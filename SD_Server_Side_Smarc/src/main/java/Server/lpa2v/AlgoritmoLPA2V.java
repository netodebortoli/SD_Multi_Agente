package Server.lpa2v;

import Server.agentes.AgObesidade;
import Server.agentes.AgPressaoDiastolica;
import Server.agentes.AgPressaoSistolica;
import Server.agentes.AgProfissional;
import Server.agentes.AgSedentarismo;
import Server.agentes.AgTabagismo;
import Server.agentes.Agente;
import ConexaoMulticast.Request;
import ConexaoMulticast.Response;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

public class AlgoritmoLPA2V extends Thread {

    private MulticastSocket socket;
    private int porta;
    private InetAddress ipGrupo;
    private Request request;
    private String resposta;
    private static ObjectOutputStream saida;

    public AlgoritmoLPA2V(Request request, MulticastSocket socket, int porta, InetAddress ipGrupo) {
        this.request = request;
        this.socket = socket;
        this.porta = porta;
        this.ipGrupo = ipGrupo;
    }

    private List<Double> iniciarAgentes() {

        List<Double> entradas = new ArrayList();

        List<Agente> agentes = List.of(
                new AgObesidade(request),
                new AgPressaoSistolica(request),
                new AgPressaoDiastolica(request),
                new AgSedentarismo(request),
                new AgTabagismo(request),
                new AgProfissional(request)
        );

        agentes.forEach(a -> {
            entradas.add(a.executar());
        });

        return entradas;
    }

    @Override
    public void run() {
        List<Double> entradasLpa2v = this.iniciarAgentes();

    }

    private void envia(Response resposta) {
        try {
            ByteArrayOutputStream saidaDados = new ByteArrayOutputStream();
            saida = new ObjectOutputStream(saidaDados);
            saida.writeObject(resposta);
            byte[] data = saidaDados.toByteArray();
            socket.send(new DatagramPacket(data, data.length, ipGrupo, porta));
        } catch (IOException ex) {
            System.out.println("Erro na criação dos Streams (IO Exception):\n" + ex.getMessage());
        }
    }

}
