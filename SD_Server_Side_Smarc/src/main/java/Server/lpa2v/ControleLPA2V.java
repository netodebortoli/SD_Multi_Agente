package Server.lpa2v;

import java.util.ArrayList;
import java.util.List;

public class ControleLPA2V {

    public static String iniciarAlgoritmo(List<Double> entradas) {
        List<Double> dados = new ArrayList<>();
        List<P> nodes = new ArrayList<>();
        if (entradas.size() > 2) {
            for (int i = 0; i < entradas.size(); i += 2) {
                P p = new P(
                        entradas.get(i),
                        definirGrauEvidenciaDesfavoravel(entradas.get(i + 1)));
                nodes.add(p);
            }
            if (nodes.size() % 2 == 1) {
                P p = max(List.of(nodes.get(0), nodes.get(1)));
                nodes.remove(0);
                nodes.remove(1);
                nodes.add(p);
            }
            nodes.forEach(no -> {
                dados.add(analiseDeNo(no));
            });
            iniciarAlgoritmo(dados);
        } else {
            P p = new P(
                    entradas.get(0),
                    entradas.get(1));
            return definirEstadoLogico(p);
        }
        return null;
    }

    private static String definirEstadoLogico(P p) {
        String s = "";

        double Gc = definirGrauCerteza(p.getMi(), p.getLambda());
        double Gct = definirGrauContradicao(p.getMi(), p.getLambda());

        return s;
    }

    private static double analiseDeNo(P p) {
        double dg_dct;
        double dg_dc;
        double dg_cr;
        double distancia;
        double dg_mctr;

        // Determinação do grau de contradição normalizado
        dg_mctr = definirGrauContradicaoNormalizado(p.getMi(), p.getLambda());

        //Cálculo do grau de certeza
        dg_dc = definirGrauCerteza(p.getMi(), p.getLambda());

        //Calculo do grau de contradição
        dg_dct = definirGrauContradicao(p.getMi(), p.getLambda());

        //Calculo da distância
        distancia = definirDistancia(dg_dc, dg_dct);

        // Determinação do grau de certeza real
        if (dg_dc >= 0) {
            dg_cr = definirGrauCertezaResultanteReal(distancia);
        } else {
            dg_cr = distancia - 1;
        }

        // Determinação do grau de evidência resultante;
        return definirGrauEvidenciaResultanteReal(dg_cr);
    }

    // λ (lambda)
    private static double definirGrauEvidenciaDesfavoravel(double mi) {
        return 1 - mi;
    }

    // Gc
    private static double definirGrauCerteza(double mi, double lambda) {
        return mi - lambda;
    }

    // Gct
    private static double definirGrauContradicao(double mi, double lambda) {
        return (mi + lambda) - 1;
    }

    // d
    private static double definirDistancia(double gc, double Gct) {
        return Math.sqrt(
                (Math.pow((1 - Math.abs(gc)), 2)) + (Math.pow(Gct, 2))
        );
    }

    // Gcr <=> Grau de Certeza Real
    private static double definirGrauCertezaResultanteReal(double distancia) {
        return 1 - distancia;
    }

    // μER <=> Grau de Evidencia Real
    private static double definirGrauEvidenciaResultanteReal(double gcr) {
        return (gcr + 1) / 2;
    }

    // Mctr <=> μctr
    private static double definirGrauContradicaoNormalizado(double mi, double lambda) {
        return (mi + lambda) / 2;
    }

    // U <=> Evidencia Resultante
    private static double definirEvidenciaResultante(double uctr) {
        return 1 - (Math.abs((2 * uctr) - 1));
    }

    private static P max(List<P> dados) {
        double maiorMi = dados.get(0).getMi();
        double menorLambda = dados.get(0).getLambda();
        for (var dado : dados) {
            if (dado.getMi() > maiorMi) {
                maiorMi = dado.getMi();
            }
            if (menorLambda > dado.getLambda()) {
                menorLambda = dado.getLambda();
            }
        }
        return new P(maiorMi, menorLambda);
    }

}
