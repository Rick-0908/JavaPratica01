package fixacao1;

import java.util.Scanner;

public class entradededados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // atribui uma entrada de dados onde vai receber dados e o usuario (ler o teclado)

        String v1; // Declara v1 como string
        int v2; // Declara v2 como numero inteiro
        double v3; // declara v3 para receber numero decimal
        char v4; // Declara v4 como char ( variavel de valor = 1 caractere)

        System.out.println("Digite a primeira String");
        v1 = sc.nextLine(); // Lê v1 como string

        System.out.println("Digite um número inteiro");
        v2 = sc.nextInt(); // Lê v2 como numero inteiro

        System.out.println("Digite um numero real :");
        v3 = sc.nextDouble(); // Lê v3 como numero decimal/real

        System.out.println("Digite um caractere :");
        v4 = sc.next().charAt(0); /*Lê v4 como char
        .charAt(0) lê apenas o primeiro caractere digitado e ignora os outros, o número entre parênteses diz qual
        caractere é lido (começando do 0) */

        System.out.println("Dados digitados :");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        // printa todos os respectiveis variaveis

        sc.close(); //FEcha o programa inteiro 



    }
}
