package ConexaoMulticast;

import java.io.Serializable;
import java.util.UUID;

public class Response implements Serializable {

    private String mensagem;
    private UUID id;

    public Response(UUID id, String mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }

    public UUID getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}