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

public class Conexao {

    private final static int MULTICAST_PORT = 52684;
    private String multiCastAddress = "224.0.0.1";
    private InetAddress enderecoGrupo;
    private MulticastSocket socket;
    private final int bufferSize = 1024 * 4;

    public Conexao() {
        try {
            enderecoGrupo = InetAddress.getByName(multiCastAddress);
        } catch (UnknownHostException ex) {
            System.out.println("Erro ao conectar com o grupo (UnknownHostException):\n" + ex.getMessage());
        }
    }

    public String iniciar(Request request) {
        
        String respostaInterface = "Erro ao obter resultados";
        
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

            while(true){
                byte[] buffer = new byte[bufferSize];
                socket.receive(new DatagramPacket(buffer, bufferSize, enderecoGrupo, MULTICAST_PORT));
                
                ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
                ObjectInputStream ois = new ObjectInputStream(bais);
                
                try {
                    Object readObject = ois.readObject();
                    if(readObject instanceof Response){
                        Response response = (Response)readObject;
                        respostaInterface = response.getMensagem();
                    } else {
                        System.out.println("Objeto recebido não é do tipo Response");
                    }
                    break;
                } catch (Exception e){
                    System.out.println("Não foi possível ler o objeto vindo no datagrama UDP");
                }
            }
            
            
        } catch (IOException ex) {
            System.out.println("Erro ao conectar com o socket (IOException):\n" + ex.getMessage());
        }
        
        return respostaInterface;
    }

}
