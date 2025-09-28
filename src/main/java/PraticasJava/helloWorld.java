package PraticasJava;

import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja criar o seu Hello Word ?: ");
        String texto1 = sc.nextLine();
        if (texto1.equalsIgnoreCase("Sim"))
        {

            System.out.println("HEllow mundao feio !!!");
        }else if (texto1.equalsIgnoreCase("Nao")) {
            System.out.println("Posso fazer nada não meu chefe");
        }


    }
}
