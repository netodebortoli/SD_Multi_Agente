package Server.agentes;

import Server.model.Request;

public class AgPressaoDiastolica extends Agente {

    public AgPressaoDiastolica(Request request) {
        super(request);
    }

    @Override
    public double executar(Request request) {

        double indicePAD;
        double pressaoDiastolica = request.getPad();

        if (pressaoDiastolica < 80) {
            indicePAD = 0;
        } else if (pressaoDiastolica > 90) {
            indicePAD = 1;
        } else {
            indicePAD = ((pressaoDiastolica - 80) / (90 - 80));
        }

        return indicePAD;
    }

}
