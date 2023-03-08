package models;

public class Carro {
    private Integer quantidadePneus;
    private int quantidadePortas;
    private int quantidadeJanelas;
    private int quantidadeFarois;
    private int chassi;
    private String cor;
    private int combustivel;
    private String arCondicionado;
    private String motor;
    private int ano;
    
    public Carro(Integer quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }

    public int getQuantidadePneus() {
        return quantidadePneus;
    }

    public void setQuantidadePneus(int quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadeJanelas() {
        return quantidadeJanelas;
    }

    public void setQuantidadeJanelas(int quantidadeJanelas) {
        this.quantidadeJanelas = quantidadeJanelas;
    }

    public int getQuantidadeFarois() {
        return quantidadeFarois;
    }

    public void setQuantidadeFarois(int quantidadeFarois) {
        this.quantidadeFarois = quantidadeFarois;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public String getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
