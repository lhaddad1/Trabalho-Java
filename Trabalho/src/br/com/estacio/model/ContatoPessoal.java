package br.com.estacio.model;

public class ContatoPessoal extends Contato {
    private String dataNascimento;
    private EnderecoCompleto endereco;

    public ContatoPessoal() {
        super();
    }

    public ContatoPessoal(String nome, String telefone, String email, EnderecoCompleto endereco, String dataNascimento) {
        super(nome, telefone, email);
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EnderecoCompleto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCompleto endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nData de Nascimento: " + dataNascimento +
               "\nEndereço: " + (endereco != null ? endereco.toString() : "Não informado");
    }
}