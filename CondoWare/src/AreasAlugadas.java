package CondoWare2;

import java.util.Date;

public class AreasAlugadas {
    private String cpfLocador;
    private Date dataAlug;
    private int id;

    public String getCpf() {
        return cpfLocador;
    }

    public void setCpfLocador(String cpfLocador) {
        this.cpfLocador = cpfLocador;
    }

    public Date getDataAlug() {
        return dataAlug;
    }

    public void setDataAlug(Date dataAlug) {
        this.dataAlug = dataAlug;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
