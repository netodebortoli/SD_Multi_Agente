package Server.agentes;

import ConexaoMulticast.Request;

public class AgProfissional extends Agente {

    public AgProfissional(Request request) {
        super(request);
    }

    @Override
    public double executar() {
        return request.getOpniaoEspecialistaChanceAtqCardiaco();
    }
    
}
