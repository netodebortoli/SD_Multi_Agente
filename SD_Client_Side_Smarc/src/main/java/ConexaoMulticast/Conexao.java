package ConexaoMulticast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Conexao {

    private final static int MULTICAST_PORT = 52684;
    private String multiCastAddress = "224.0.0.1";
    private InetAddress enderecoGrupo;
    private MulticastSocket socket;

    public Conexao() {
        try {
            enderecoGrupo = InetAddress.getByName(multiCastAddress);
        } catch (UnknownHostException ex) {
            System.out.println("Erro ao conectar com o grupo (UnknownHostException):\n" + ex.getMessage());
        }
    }

    public void iniciar(Request request) {
        // create a socket
        try {
            socket = new MulticastSocket(MULTICAST_PORT);
            socket.joinGroup(enderecoGrupo);
            
            System.out.println(request.getAltura());
            
            // prepare date
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(request);

            byte[] data = baos.toByteArray();

            socket.send(new DatagramPacket(data, data.length, enderecoGrupo, MULTICAST_PORT));

        } catch (IOException ex) {
            System.out.println("Erro ao conectar com o socket (IOException):\n" + ex.getMessage());
        }
    }

}
