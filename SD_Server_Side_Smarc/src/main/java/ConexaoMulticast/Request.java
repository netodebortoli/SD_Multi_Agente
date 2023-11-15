package ConexaoMulticast;

import java.io.Serializable;

public class Request implements Serializable {

    private double peso;
    private double altura;
    private Integer pas;
    private Integer pad;
    private Integer qtdAtividadeFisicaSemanal;
    private Integer pontuacaoTabagismo;
    private Integer opniaoEspecialistaChanceAtqCardiaco;

    public Request() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Integer getPas() {
        return pas;
    }

    public void setPas(Integer pas) {
        this.pas = pas;
    }

    public Integer getPad() {
        return pad;
    }

    public void setPad(Integer pad) {
        this.pad = pad;
    }

    public Integer getQtdAtividadeFisicaSemanal() {
        return qtdAtividadeFisicaSemanal;
    }

    public void setQtdAtividadeFisicaSemanal(Integer qtdAtividadeFisicaSemanal) {
        this.qtdAtividadeFisicaSemanal = qtdAtividadeFisicaSemanal;
    }

    public Integer getPontuacaoTabagismo() {
        return pontuacaoTabagismo;
    }

    public void setPontuacaoTabagismo(Integer pontuacaoTabagismo) {
        this.pontuacaoTabagismo = pontuacaoTabagismo;
    }

    public Integer getOpniaoEspecialistaChanceAtqCardiaco() {
        return opniaoEspecialistaChanceAtqCardiaco;
    }

    public void setOpniaoEspecialistaChanceAtqCardiaco(Integer opniaoEspecialistaChanceAtqCardiaco) {
        this.opniaoEspecialistaChanceAtqCardiaco = opniaoEspecialistaChanceAtqCardiaco;
    }

}
