package PraticasJava;

import java.util.Locale;
import java.util.Scanner;

public class fixacao1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String product1 = "Computer";
        String product2 = "Office";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtos que obtemos :" + product1 + "Ou :" + product2);
        String texto1 = scanner.nextLine();
        System.out.println("Qual você deseja ?");
        String texto2 = scanner.nextLine();
        String operacao = scanner.nextLine();


        if (operacao.equals("Produto 1")) {
            System.out.println("Computer, which price is :$" + price1);
            System.out.println(("Para obter esta maquina você precisa ter mais de 30 anos, Digite sua idade"));
            String text1 = scanner.nextLine();
            if (Integer.parseInt(text1) >= 30) {
                System.out.println(("VocÊ possui a idade suficiente para obter o computador"));
            } else if (Integer.parseInt(text1) <= 30) {
                System.out.println("Você não possui idade suficiente, tente novamente em breve");
            } else {
                System.out.println("Digite uma opção valida");
            }

        } else if (operacao.equals("Produto 2")) {
            System.out.println("Office desk,which price is :$" + price2);
            System.out.println(("Para obter esta maquina você precisa ter mais de 30 anos, Digite sua idade"));
            String text1 = scanner.nextLine();
            if (Integer.parseInt(text1) >= 30) {
                System.out.println(("VocÊ possui a idade suficiente para obter o computador"));
            } else if (Integer.parseInt(text1) <= 30) {
                System.out.println("Você não possui idade suficiente, tente novamente em breve");
            } else {
                System.out.println("Digite uma opção valida");


            }
        }
        System.out.println();
        System.out.println("Aqui terminamos o nosso processo");
        System.out.println();
        scanner.close();
    }
}