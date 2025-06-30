package br.com.estacio.model;

public class EnderecoSimples {
    private String rua;

    public EnderecoSimples() {}

    public EnderecoSimples(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Endereço: " + rua;
    }
}