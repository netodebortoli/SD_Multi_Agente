package ConexaoMulticast;

import Server.lpa2v.AlgoritmoLPA2V;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Servidor {

    private final static int MULTICAST_PORT = 52684;
    private static String multiCastAddress = "224.0.0.1";
    private static InetAddress enderecoGrupo;
    private static MulticastSocket socket;
    
    private static int bufferSize = 1024 * 4;

    //atributos de conexão aqui, depois dentro do main realizar a conexao e chamar as threads do comunicador
    public static void main(String[] args) {
        try {
            enderecoGrupo = InetAddress.getByName(multiCastAddress);
            socket = new MulticastSocket(MULTICAST_PORT);
            socket.joinGroup(enderecoGrupo);
        } catch (SocketException e) {
            System.out.println("Erro no servidor (conexão): Socket Exception - " + e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println("Erro no servidor (conexão): Unknown Host Exception - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro no servidor (conexão): IO Exception - " + e.getMessage());
        }

        while (true) {
            try {
                byte[] buffer = new byte[bufferSize];
                socket.receive(new DatagramPacket(buffer, bufferSize, enderecoGrupo, MULTICAST_PORT));

                //Deserializa o objeto
                ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
                ObjectInputStream ois = new ObjectInputStream(bais);
                Object readObjectInputStream = ois.readObject();

                if (readObjectInputStream instanceof Request) {
                    AlgoritmoLPA2V algoritmo = new AlgoritmoLPA2V(
                            (Request) readObjectInputStream, socket, MULTICAST_PORT, enderecoGrupo);
                    algoritmo.start();
                }

            } catch (IOException e) {
                System.out.println("Erro na criação dos Streams (IO Exception):\n" + e.getMessage());
            } catch (ClassNotFoundException ex) {
                System.out.println("Erro ao ler classe do objeto (ClassNotFoundException):\n" + ex.getMessage());
            }
        }
    }

}
