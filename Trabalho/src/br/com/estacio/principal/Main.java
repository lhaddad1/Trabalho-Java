package br.com.estacio.principal;

import java.util.Scanner;

import br.com.estacio.model.Agenda;
import br.com.estacio.model.Contato;
import br.com.estacio.model.ContatoPessoal;
import br.com.estacio.model.ContatoProfissional;
import br.com.estacio.model.EnderecoCompleto;
import br.com.estacio.model.EnderecoSimples;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    ContatoPessoal pessoal = new ContatoPessoal();
                    System.out.print("Nome: ");
                    pessoal.setNome(scanner.nextLine());
                    System.out.print("Telefone: ");
                    pessoal.setTelefone(scanner.nextLine());
                    System.out.print("Email: ");
                    pessoal.setEmail(scanner.nextLine());

                    EnderecoCompleto endCompleto = new EnderecoCompleto();
                    System.out.print("Rua: ");
                    endCompleto.setRua(scanner.nextLine());
                    System.out.print("Cidade: ");
                    endCompleto.setCidade(scanner.nextLine());
                    System.out.print("Estado: ");
                    endCompleto.setEstado(scanner.nextLine());
                    System.out.print("CEP: ");
                    endCompleto.setCep(scanner.nextLine());
                    pessoal.setEndereco(endCompleto);

                    System.out.print("Data de Nascimento: ");
                    pessoal.setDataNascimento(scanner.nextLine());

                    agenda.adicionarContato(pessoal);
                    System.out.println("Contato pessoal adicionado com sucesso!");
                    break;

                case 2:
                    ContatoProfissional profissional = new ContatoProfissional();
                    System.out.print("Nome: ");
                    profissional.setNome(scanner.nextLine());
                    System.out.print("Telefone: ");
                    profissional.setTelefone(scanner.nextLine());
                    System.out.print("Email Profissional: ");
                    profissional.setEmail(scanner.nextLine());

                    EnderecoSimples endSimples = new EnderecoSimples();
                    System.out.print("Rua: ");
                    endSimples.setRua(scanner.nextLine());
                    profissional.setEndereco(endSimples);

                    System.out.print("Empresa: ");
                    profissional.setEmpresa(scanner.nextLine());

                    agenda.adicionarContato(profissional);
                    System.out.println("Contato profissional adicionado com sucesso!");
                    break;

                case 3:
                    Contato contato = new Contato();
                    System.out.print("Nome: ");
                    contato.setNome(scanner.nextLine());
                    System.out.print("Telefone: ");
                    contato.setTelefone(scanner.nextLine());
                    System.out.print("Email: ");
                    contato.setEmail(scanner.nextLine());
                    System.out.println("Contato genérico adicionado com sucesso!");
                    break;

                case 4:
                    System.out.print("Digite o nome do contato a remover: ");
                    agenda.removerContato(scanner.nextLine());
                    System.out.println("Contato removido.");
                    break;

                case 5:
                    System.out.print("Nome do contato para buscar: ");
                    Contato encontrado = agenda.buscarContato(scanner.nextLine());
                    if (encontrado != null) {
                        System.out.println("Contato encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Lista de contatos:");
                    for (Contato c : agenda.listarContatos()) {
                        System.out.println(c);
                        printLinha();
                    }
                    break;

                case 7:
                    System.out.println("Obrigado por usar a agenda!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void mostrarMenu() {
        printLinha();
        System.out.println("Bem-vindo à Agenda de Contatos:");
        System.out.println("1. Adicionar Contato Pessoal");
        System.out.println("2. Adicionar Contato Profissional");
        System.out.println("3. Adicionar Contato Genérico");
        System.out.println("4. Remover Contato");
        System.out.println("5. Buscar Contato");
        System.out.println("6. Listar Contatos");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void printLinha() {
        System.out.println("--------------------------------------------");
    }
}