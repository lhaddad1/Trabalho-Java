package br.com.estacio.model;

public class ContatoProfissional extends Contato {
    private String empresa;
    private EnderecoSimples endereco;

    // Construtor padrão
    public ContatoProfissional() {
        super();
    }

    // Construtor com argumentos
    public ContatoProfissional(String nome, String telefone, String email, EnderecoSimples endereco, String empresa) {
        super(nome, telefone, email);
        this.endereco = endereco;
        this.empresa = empresa;
    }

    // Getters e Setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public EnderecoSimples getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoSimples endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nEmpresa: " + empresa +
               "\nEndereço: " + (endereco != null ? endereco.toString() : "Não informado");
    }
}