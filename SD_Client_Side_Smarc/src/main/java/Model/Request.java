package Model;

import java.io.Serializable;

public class Request implements Serializable {

    private Object[] mensagem;

    public Request() { }
    
    public Object[] getMensagem() {
        return mensagem;
    }

    public void setMensagem(Object[] mensagem) {
        this.mensagem = mensagem;
    }
}
