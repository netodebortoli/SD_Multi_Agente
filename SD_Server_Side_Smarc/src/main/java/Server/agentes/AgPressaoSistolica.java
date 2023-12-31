package Server.agentes;

import ConexaoMulticast.Request;

public class AgPressaoSistolica extends Agente {

    public AgPressaoSistolica(Request request) {
        super(request);
    }

    @Override
    public double executar() {
        
        double indicePAS;
        double pressaoSistolica = request.getPas();

        if (pressaoSistolica < 120) {
            indicePAS = 0;
        } else if (pressaoSistolica > 140) {
            indicePAS = 1;
        } else {
            indicePAS = ((pressaoSistolica - 120) / (140 - 120));
        }

        return indicePAS;
    }

}
