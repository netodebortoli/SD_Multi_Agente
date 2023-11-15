package Server.agentes;

import ConexaoMulticast.Request;

public class AgSedentarismo extends Agente {

    public AgSedentarismo(Request request) {
        super(request);
    }

    @Override
    public double executar() {

        double indiceSedentarismo = 0;

        switch (request.getQtdAtividadeFisicaSemanal()) {
            case 0:
                indiceSedentarismo = 1.0;
                break;
            case 1:
                indiceSedentarismo = 0.75;
                break;
            case 2:
                indiceSedentarismo = 0.50;
                break;
            case 3:
                indiceSedentarismo = 0.25;
                break;
            case 4:
                indiceSedentarismo = 0.0;
                break;
        }

        return indiceSedentarismo;
    }

}
