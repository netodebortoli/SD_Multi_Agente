package Server.agentes;

import ConexaoMulticast.Request;

public abstract class Agente {

    protected static Request request;

    public abstract double executar();

    public Agente(Request request) {
        Agente.request = request;
    }

}
