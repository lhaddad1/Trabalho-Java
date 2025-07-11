package br.com.estacio.model;

public class EnderecoCompleto {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    // Construtor padrão
    public EnderecoCompleto() {}

    // Construtor com parâmetros
    public EnderecoCompleto(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereço: " + rua + ", " + cidade + " - " + estado + ", CEP: " + cep;
    }
}