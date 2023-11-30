package CondoWare2;

public class Condomino extends Pessoa {
    
    private int apartamento;
    private int bloco;

    private Veiculo veiculo = new Veiculo();
    
    public Veiculo addVeiculo(String placa, String modelo, String marca) {
        getVeiculo().setPlaca(placa);
        getVeiculo().setModelo(modelo);
        getVeiculo().setMarca(marca);
        return getVeiculo();
    }
    
    public int getApartamento() {
        return apartamento;
    }

    public void setApartamento(int apartamento) {
        this.apartamento = apartamento;
    }
    

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
   
}
