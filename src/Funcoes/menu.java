package Funcoes;

import entidades.Cabecalho;
import entidades.Rodape;

import java.util.Scanner;

public class menu {
    public static final FucaoDaBiblioteca funBiblioteca = new FucaoDaBiblioteca();
    private static final Cabecalho cabecalho = new Cabecalho();
    private static final Rodape rodape = new Rodape();
    public static void mostrarMenu(){
        System.out.println("---------- Bem-vindo ao sistema de livros ----------");
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Cadastrar Livro ");
        System.out.println("2 - Buscar Livro ");
        System.out.println("3 - Atualizar Livro ");
        System.out.println("4 - Remover Livro");
        System.out.println("5 - Sair da Biblioteca ");
    }


    public static boolean escolherOpcao(Scanner input){
        int opcao = input.nextInt();
        input.nextLine();
        boolean finalizarPrograma = true;
        switch (opcao){
            case 1:
                cabecalho.setTitulo("\nVocê deseja Cadastrar um Livro? Digite o ID! ");
                cabecalho.imprimir();
                funBiblioteca.salvarLivro(input);
                break;
            case 2:
                cabecalho.setTitulo("\nVocê deseja buscar um Livro? Digite o ID! ");
                cabecalho.imprimir();
                funBiblioteca.buscarLivro(input);
                break;
            case 3:
                cabecalho.setTitulo("\nVocê deseja atualizar um Livro? Digite o ID!");
                cabecalho.imprimir();
                funBiblioteca.atualizarLivro(input);
                break;
            case 4:
                cabecalho.setTitulo("\nVocê deseja remover um livro? Digite o ID!");
                cabecalho.imprimir();
                funBiblioteca.removerLivro(input);
                break;
            case 5:
                finalizarPrograma = false;
                rodape.setRodape("Você Saiu da Bibloteca");
                rodape.imprimir();
                break;
            default:
                System.out.println("Opcão inválida! Tente novamente");
                break;
        }
        return finalizarPrograma;
    }
}
