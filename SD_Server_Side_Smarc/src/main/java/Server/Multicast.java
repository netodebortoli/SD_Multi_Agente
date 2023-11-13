package Server;

import Server.model.Request;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Multicast {

    public static void main(String[] args) {
        int porta = 6868;
        InetAddress ipGrupo = null;
        MulticastSocket multicastSocket = null;

        try {
            ipGrupo = InetAddress.getByName("224.225.226.227");
            multicastSocket = new MulticastSocket(porta);
            multicastSocket.joinGroup(ipGrupo);
        } catch (SocketException e) {
            System.out.println("Erro no observador (conexão do servidor): Socket Exception - " + e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println("Erro no observador (conexão do servidor): Unknown Host Exception - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro no observador (conexão do servidor): IO Exception - " + e.getMessage());
        }

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(new Request());
            byte[] data = baos.toByteArray();
            multicastSocket.send(new DatagramPacket(data, data.length, ipGrupo, porta));
        } catch (IOException e) {
            System.out.println("Erro no observador (criação dos Streams): IO Exception - " + e.getMessage());
        }

    }
}
