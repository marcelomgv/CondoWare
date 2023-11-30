package CondoWare2;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int cpfDono;

    public Veiculo() {
        placa = "";
        modelo = "";
        marca = "";
    }
    
    public Veiculo(String placa, String modelo, String marca) {
        this.marca = marca;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(int cpfDono) {
        this.cpfDono = cpfDono;
    }
    
    
}
