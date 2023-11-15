package Server.agentes;

import ConexaoMulticast.Request;

public class AgObesidade extends Agente {

    public AgObesidade(Request request) {
        super(request);
    }

    @Override 
    public double executar() {
        
        double indiceObesidade;
        double peso = request.getPeso();
        double altura = request.getAltura();

        double imc = (peso / (Math.pow(altura, 2)));
        
        if(imc < 25){
            indiceObesidade = 0;
        } else if (imc > 40){
            indiceObesidade = 1;
        } else {
            indiceObesidade = ((imc - 25) / (40 - 25));
        }
        
        return indiceObesidade;
    }

}
