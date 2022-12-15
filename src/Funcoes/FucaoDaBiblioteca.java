package Funcoes;
import controladores.ControladorLivro;
import entidades.Autor;
import entidades.Livro;
import entidades.Pessoa;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FucaoDaBiblioteca {

    private static final ControladorLivro controladorLivro = new ControladorLivro();



    public static void salvarLivro(Scanner input){
        System.out.println("Digite o NOME do Livro ");
        String nomeLivro = input.nextLine();
        System.out.println("Digite o nome do autor do livro: ");
        String nome = input.nextLine();
        System.out.println("Digite Idade do Autor: ");
        Integer idade = input.nextInt();
        System.out.println("Digite a Quantidades de livros escrito pelo Autor: ");
        Integer qtLivros = input.nextInt();
        input.nextLine();
        System.out.println("Digite o Genero do livro ");
        String genero = input.nextLine();
        System.out.println("Digite o ano do livro");
        Integer ano = input.nextInt();
        System.out.println("Digite o número de páginas do livro");
        Integer numPag = input.nextInt();

        input.nextLine();

        Integer id = 0;
        controladorLivro.salvarLivro(nomeLivro, genero, ano, numPag, nome, idade, qtLivros, id);
    }

    public static void buscarLivro(Scanner input){
        System.out.println("Busca Livro pelo ID ");
        int id = input.nextInt();
        Livro livro = controladorLivro.lerLivroPorTitulo(id);

        if (livro == null){
            System.out.println(" Não tem nem um LIVRO com esse ID");

        }else {

            System.out.println("Nome do livro: " +  livro.getId() +
                    "\nAutor do Livro: " + livro.getNome() +
                    "\nIdade do Autor do Livro: " + livro.getIdade()+ " Anos "+
                    "\nQuantidade de Livros escrito pelo Autor: " + livro.getQtLivros() + " Livros " +
                    "\nGenero do Livro: " + livro.getGenero() +
                    "\nNumero de Paginas: " + livro.getNumPaginas()+ " Paginas " +
                    "\nAno da Publicação do Livro:  " + livro.getAno());
        }


    }

    public static void atualizarLivro(Scanner input){
        System.out.println("Digite o ID do livro: ");
        int id = input.nextInt();
        input.nextLine();
        Livro livro = controladorLivro.lerLivroPorTitulo(id);
        if (livro == null){
            System.out.println(" Não tem nem um LIVRO com esse ID ");
        }else {

            System.out.println(" INSIRA Genero do livro ");
            String genero = input.nextLine();
            System.out.println("Digite o novo número de páginas do livro");
            Integer numPag = input.nextInt();
            input.nextLine();
            controladorLivro.atualizarLivro( genero, numPag, id);
        }

    }

    public static void removerLivro(Scanner input){
        System.out.println("ID do livro: ");
        int id = input.nextInt();

        controladorLivro.removerLivro(id);
    }

}
