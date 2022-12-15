
import Funcoes.menu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do {
           menu.mostrarMenu();

        } while(menu.escolherOpcao(input));
    }


}