package exercicioFIxacao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIgite seu 1 número :");
        int A = sc.nextInt();
        System.out.println("Digite seu 2 número :");
        int B = sc.nextInt();
        System.out.println("Digite seu 3 número :");
        int C = sc.nextInt();
        System.out.println("Digite seu 4 número :");
        int D = sc.nextInt();


        int diferenca = A * B - C * D;

        System.out.println("A diferença é de : " + diferenca);
    }
}
