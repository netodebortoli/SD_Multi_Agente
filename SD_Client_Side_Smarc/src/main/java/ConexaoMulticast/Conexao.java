package ConexaoMulticast;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.UUID;

public class Conexao {

    private final static int MULTICAST_PORT = 52684;
    private String multiCastAddress = "224.0.0.1";
    private InetAddress enderecoGrupo;
    private MulticastSocket socket;
    private final int bufferSize = 1024 * 4;
    private static ObjectInputStream entrada = null;
    private UUID id;

    public UUID getId() {
        return id;
    }

    public Conexao() {
        try {
            this.id = UUID.randomUUID();
            enderecoGrupo = InetAddress.getByName(multiCastAddress);
        } catch (UnknownHostException ex) {
            System.out.println("Erro ao conectar com o grupo (UnknownHostException):\n" + ex.getMessage());
        }
    }

    public String iniciar(Request request) {

        Response response = null;

        // create a socket
        try {
            socket = new MulticastSocket(MULTICAST_PORT);
            socket.joinGroup(enderecoGrupo);

            // prepare date
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(request);

            byte[] data = baos.toByteArray();

            socket.send(new DatagramPacket(data, data.length, enderecoGrupo, MULTICAST_PORT));

            while (true) {
                byte[] buffer = new byte[bufferSize];
                socket.receive(new DatagramPacket(buffer, bufferSize));

                ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
                entrada = new ObjectInputStream(bais);

                try {
                    Object readObject = entrada.readObject();
                    if (readObject instanceof Response) {
                        response = (Response) readObject;
                        if (response.getId().equals(this.id)) {
                            break;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Erro ao receber objeto (IOException):\n" + e.getMessage());
                } catch (ClassNotFoundException e) {
                    System.out.println("Erro ao ler classe do objeto de respota(ClassNotFoundException):\n" + e.getMessage());
                }
            }

        } catch (IOException ex) {
            System.out.println("Erro ao conectar com o socket (IOException):\n" + ex.getMessage());
        }

        return response != null
                ? response.getMensagem()
                : "Erro ao obter resultados";
    }

}
