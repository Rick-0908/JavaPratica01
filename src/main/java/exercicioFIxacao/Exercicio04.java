package exercicioFIxacao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu número : ");
        int n1 = sc.nextInt();
        System.out.println("digite suas horas trabalhadas : ");
        int n2 = sc.nextInt();
        System.out.println("Quanto você recebe por hora ? ");
        double n3 = sc.nextDouble();

        double resultado = 0;

        resultado = n2 * n3;
        System.out.println("O seu número é " + n1 + "Suas horas trabalhadas são :" + n2 + "E seu salario é :R$" +resultado);
    }
}
