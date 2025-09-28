package exercicioFIxacao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo da peça 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Digite a quantidade da peças 1 : ");
        int n2 = sc.nextInt();
        System.out.println("Qual o valor da peça 1 : ");
        double preco1 = sc.nextDouble();
        System.out.println("Digite o codigo da peça 2 :");
        int n3 = sc.nextInt();
        System.out.println("Digite a quantidade da peça 2 : ");
        int n4 = sc.nextInt();
        System.out.println("Qual o valor da peça 2 :");
        double preco2 = sc.nextDouble();

        double resultado = 0;
        double resultado2 = 0;

        resultado = n2 * preco1;
        resultado2 = n4 * preco2;

        System.out.println("O codigo da peça 1 é : " + n1 + "E seu preço estoque é : R$" +resultado);
        System.out.println("O codigo da peça 1 é : " + n3 + "E seu preço estoque é : R$" +resultado2);

    }
}
