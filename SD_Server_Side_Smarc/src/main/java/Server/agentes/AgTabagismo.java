package Server.agentes;

import Server.model.Request;

public class AgTabagismo extends Agente {

    public AgTabagismo(Request request) {
        super(request);
    }

    @Override
    public double executar(Request request) {

        double indiceTabagismo = 0;

        switch (request.getPontuacaoTabagismo()) {
            case 10:
                indiceTabagismo = 1.0;
                break;
            case 8:
                indiceTabagismo = 0.75;
                break;
            case 5:
                indiceTabagismo = 0.50;
                break;
            case 3:
                indiceTabagismo = 0.25;
                break;
            case 0:
                indiceTabagismo = 0.0;
                break;
        }

        return indiceTabagismo;

    }

}
