package PraticasJava;

import java.util.Scanner;

public class whileSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número , maximo até 100, a contagem será feita até 150 ");
        String texto1 = scanner.nextLine();

        int numeroUsuario  = Integer.parseInt(texto1) ;

        int contador = numeroUsuario ;


        while (contador < 150) {
            System.out.println(("A contagem é " + contador));
            contador++;
        }
    }
}
