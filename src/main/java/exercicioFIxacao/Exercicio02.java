package exercicioFIxacao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Digite seu valor do raio : ");
        double raio = sc.nextDouble();

        double resultado = 0;

         double area = pi*Math.pow(raio,2);

        System.out.println("Seu resultado é = " + area);



    }
}
