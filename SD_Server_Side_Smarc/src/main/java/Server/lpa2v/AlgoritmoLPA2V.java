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
        this.iniciarLpa2v(entradasLpa2v);
    }

    private void iniciarLpa2v(List<Double> entradas) {

    }

    private double analisarNo(double mi, double mi2) {
        double lambda = this.definirGrauEvidenciaDesfavoravel(mi2);
        double dg_dct;
        double dg_dc;
        double dg_cr;
        double distancia;
       
        //Cálculo do grau de certeza
        dg_dc = this.definirGrauCerteza(mi, lambda);
        
        //Calculo do grau de contradição
        dg_dct = this.definirGrauContradicao(mi, lambda);
        
        //Calculo da distância
        distancia = this.definirDistancia(dg_dc, dg_dct);

        // Determinação do grau de certeza real
        if (dg_dc >= 0) {
            dg_cr = this.definirGrauCertezaResultanteReal(distancia);
        } else {
            dg_cr = distancia - 1;
        }
        
        // Determinação do grau de evidência resultante;
        return this.definirGrauEvidenciaResultanteReal(dg_cr);
    }

    // λ (lambda)
    private double definirGrauEvidenciaDesfavoravel(double mi) {
        return 1 - mi;
    }

    // Gc
    private double definirGrauCerteza(double mi, double lambda) {
        return mi - lambda;
    }

    // Gct
    private double definirGrauContradicao(double mi, double lambda) {
        return (mi + lambda) - 1;
    }

    // d
    private double definirDistancia(double gc, double Gct) {
        return Math.sqrt(
                (Math.pow((1 - Math.abs(gc)), 2)) + (Math.pow(Gct, 2))
        );
    }

    // Gcr <=> Grau de Certeza Real
    private double definirGrauCertezaResultanteReal(double distancia) {
        return 1 - distancia;
    }

    // μER <=> Grau de Evidencia Real
    private double definirGrauEvidenciaResultanteReal(double gcr) {
        return (gcr + 1) / 2;
    }

    // Mctr <=> μctr
    private double definirGrauContradicaoNormalizado(double mi, double lambda) {
        return (mi + lambda) / 2;
    }

    // U <=> Evidencia Resultante
    private double definirEvidenciaResultante(double uctr) {
        return 1 - (Math.abs((2 * uctr) - 1));
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
