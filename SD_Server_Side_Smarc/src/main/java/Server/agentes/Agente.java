package Server.agentes;

import ConexaoMulticast.Request;

public abstract class Agente {

    private Request request;

    public abstract double executar(Request request);

    public Agente(Request request) {
        this.request = request;
    }

}
