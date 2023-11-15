package ConexaoMulticast;

import java.io.Serializable;

public class Response implements Serializable {

    private String mensagem;

    public Response(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
