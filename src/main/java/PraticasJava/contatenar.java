package PraticasJava;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class contatenar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("Olá Bem-Vindo (a), Digite seu número para fazer o calculo :");
        System.out.println("-----------------------------------------------------------");
        Double n1 = scanner.nextDouble();
        System.out.println("------------------------------------------------------------");
        System.out.println("Olá agora digite seu 2 número :");
        System.out.println("-----------------------------------------------------------");
        Double n2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Deseja fazer qual calculo ? (+,-,* ou /)");
        String operacao = scanner.nextLine();
        ;

        double resultado = 0;
        boolean operacaoValida = true;

        if (operacao.equals("+")) {
            resultado = n1 + n2;
            System.out.println("Seu resultado deu :" + resultado);
        } else if (operacao.equals("-")) {
            resultado = n1 - n2;
            System.out.println("Seu resultado deu :" + resultado);
        } else if (operacao.equals("*")) {
            resultado = n1 * n2;
            System.out.println("Seu resultado deu :" + resultado);
        } else if (operacao.equals("/")) {
            if (n2 != 0) {
                resultado = n1 / n2;
                System.out.println("Seu resultado deu: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida!");
                operacaoValida = false;
            }
        } else {
            System.out.println("Digite uma opção válida!!");
            operacaoValida = false;
        }
        if (operacaoValida) ;
        System.out.println("Sua conta foi finalizada deseja fazer novamente ?\n SE sim, reabra o sistema");
        scanner.close();


    }
}

