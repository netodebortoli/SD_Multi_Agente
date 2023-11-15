package Server.agentes;

import ConexaoMulticast.Request;

public class AgTabagismo extends Agente {

    public AgTabagismo(Request request) {
        super(request);
    }

    @Override
    public double executar() {

        double indiceTabagismo;
        int pontuacao = request.getPontuacaoTabagismo();

        if(pontuacao == 0){
            indiceTabagismo = 0.0;
        } else if (pontuacao > 0 && pontuacao <= 3) {
            indiceTabagismo = 0.25;
        } else if (pontuacao > 3 && pontuacao <= 5) {
            indiceTabagismo = 0.50;
        } else if (pontuacao > 5 && pontuacao <= 8) {
            indiceTabagismo = 0.75;
        } else {
            indiceTabagismo = 1.0;
        }
        
        return indiceTabagismo;

    }

}
