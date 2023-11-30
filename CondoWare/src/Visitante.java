package CondoWare2;

import java.sql.Timestamp;

public class Visitante {
    private Timestamp entrada;
    private int blocoVisitado;
    private String nomeVisitante;
    private int apVisitado;
    private Timestamp saida;

    public Timestamp getEntrada() {
        return entrada;
    }

    public void setEntrada(Timestamp entrada) {
        this.entrada = entrada;
    }

    public int getBlocoVisitado() {
        return blocoVisitado;
    }

    public void setBlocoVisitado(int blocoVisitado) {
        this.blocoVisitado = blocoVisitado;
    }

    public String getNomeVisitante() {
        return nomeVisitante;
    }

    public void setNomeVisitante(String nomeVisitante) {
        this.nomeVisitante = nomeVisitante;
    }

    public int getApVisitado() {
        return apVisitado;
    }

    public void setApVisitado(int apVisitado) {
        this.apVisitado = apVisitado;
    }

    public Timestamp getSaida() {
        return saida;
    }

    public void setSaida(Timestamp saida) {
        this.saida = saida;
    }
}
