package Server.agentes;

import Server.model.Request;

public class AgProfissional extends Agente {

    public AgProfissional(Request request) {
        super(request);
    }

    @Override
    public double executar(Request request) {
        return request.getOpniaoEspecialistaChanceAtqCardiaco();
    }
    
}
