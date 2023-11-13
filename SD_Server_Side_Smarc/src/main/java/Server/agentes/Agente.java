package Server.agentes;

import Server.model.Request;
import Server.model.Response;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public abstract class Agente extends Thread {

    private String nome;
    private String enderecoMulticast = "22.0.0.1";
    private static int porta;
    private static InetAddress enderecoGrupo = null;
    private static MulticastSocket socket = null;
    private static ObjectOutputStream saida = null;
    private static ObjectInputStream entrada = null;
    private final int tamanho = 1024 * 4;

    public abstract String executar(Request request);

    public Agente(String nome) {
        this.nome = nome;
        try {
            porta = 52684;
            enderecoGrupo = InetAddress.getByName(enderecoMulticast);
            socket = new MulticastSocket(porta);
            socket.joinGroup(enderecoGrupo);
        } catch (UnknownHostException e) {
            System.out.printf("Falha ao criar Agente %s: UnknownHostException (%s)", nome, e.getMessage());
        } catch (IOException e) {
            System.out.printf("Falha ao criar Agente %s: IOException (%s)", nome, e.getMessage());
        }
    }

    public Request receber() {
        byte[] buffer = new byte[tamanho];
        Request request = null;

        try {
            socket.receive(new DatagramPacket(buffer, tamanho, enderecoGrupo, porta));

            ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
            entrada = new ObjectInputStream(bais);

            Object objetoRecebido = entrada.readObject();

            if (objetoRecebido instanceof Request) {
                request = (Request) objetoRecebido;
                executar(request);
            }
            
        } catch (IOException e) {
            System.out.printf("Falha ao receber objeto (Agente %s): IOException (%s)", nome, e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.printf("Falha ao receber objeto (Agente %s): ClassNotFoundException (%s)", nome, e.getMessage());
        }
        return request;
    }

    public void enviar(Response response) {
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            saida = new ObjectOutputStream(baos);
            
            saida.writeObject(response);
            
            byte[] data = baos.toByteArray();
            socket.send(new DatagramPacket(data, data.length, enderecoGrupo, porta));
            
        } catch (IOException e){
            System.out.printf("Falha ao enviar objeto (Agente %s): IOException (%s)", nome, e.getMessage());
        }
    }
    
    @Override //A MODIFICAR --- A MODIFICAR --- A MODIFICAR --- A MODIFICAR --- A MODIFICAR --- A MODIFICAR --- A MODIFICAR --- 
    public void run() {
        try {
            InetAddress group = InetAddress.getByName(enderecoMulticast);
            MulticastSocket multicastSocket = new MulticastSocket(porta);
            multicastSocket.joinGroup(group);

            while (true) {
                byte[] buffer = new byte[tamanho];
                multicastSocket.receive(new DatagramPacket(buffer, tamanho, group, porta));

                ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
                ObjectInputStream ois = new ObjectInputStream(bais);

                Object readObject = ois.readObject();
                if (readObject instanceof Request) {
                    Request request = (Request) readObject;
                    //EXECUTA ALGORITMO DE SEDENTARISMO
                } else {
                    System.out.println("O objeto recebido não é do tipo Request.");
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Erro no Agente Sedentarismo (conexão): Unknown Host Exception - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro no Agente Sedentarismo (criação do multicast): IO Exception - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Não foi possível ler algum objeto dos dados recebidos.");
        }

    }

}
