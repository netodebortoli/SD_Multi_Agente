package Server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Multicast {

    private final static int MULTICAST_PORT = 52684;
    private static String multiCastAddress = "224.0.0.1";
    private static InetAddress ipGrupo = null;
    private static MulticastSocket socket;
    private static int bufferSize = 1024 * 4;

    //atributos de conexão aqui, depois dentro do main realizar a conexao e chamar as threads do comunicador
    public static void main(String[] args) {

        try {
            ipGrupo = InetAddress.getByName(multiCastAddress);
            socket = new MulticastSocket(MULTICAST_PORT);
            socket.joinGroup(ipGrupo);
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
                socket.receive(new DatagramPacket(buffer, bufferSize, ipGrupo, MULTICAST_PORT));

                } catch (IOException e) {
                System.out.println("Erro no observador (criação dos Streams): IO Exception - " + e.getMessage());
            }

        }

    }
}
