package Server.lpa2v;

import Server.agentes.AgObesidade;
import Server.agentes.AgPressaoDiastolica;
import Server.agentes.AgPressaoSistolica;
import Server.agentes.AgProfissional;
import Server.agentes.AgSedentarismo;
import Server.agentes.AgTabagismo;
import Server.agentes.Agente;
import Server.model.Request;
import Server.model.Response;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlgoritmoLPA2V extends Thread {

    private MulticastSocket socket;
    private int porta;
    private InetAddress ipGrupo;
    private Request request;
    private String resposta;

    public AlgoritmoLPA2V(Request request, MulticastSocket socket, int porta, InetAddress ipGrupo) {
        this.request = request;
        this.socket = socket;
        this.porta = porta;
        this.ipGrupo = ipGrupo;
    }
    
    private void executar(){
       Agente agObesidade = new AgObesidade(request);
       Agente agPressaoSistolica = new AgPressaoSistolica(request);
       Agente agPressaoDiastolica = new AgPressaoDiastolica(request);
       Agente agSedentarismo = new AgSedentarismo(request);
       Agente agTabagismo = new AgTabagismo(request);
       Agente agProfissional = new AgProfissional(request);
    }

    @Override
    public void run() {

        ObjectOutputStream oos = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(new Response());
            byte[] data = baos.toByteArray();
            socket.send(new DatagramPacket(data, data.length, ipGrupo, porta));
        } catch (IOException ex) {
            Logger.getLogger(AlgoritmoLPA2V.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(AlgoritmoLPA2V.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
