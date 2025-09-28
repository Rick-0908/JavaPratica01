package PraticasJava;

import java.util.Scanner;

public class sanduiche01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Boas vindas a montagem ");

        System.out.println("Pegue 2 fatias de pão para começar");
        System.out.println("Agora coloque 1 fatia de pão sobre a mesa");
        System.out.println("Pegue agora uma fatia de queijo");
        System.out.println("Posicione a fatia de queijo sobre a fatia de pão número 1 ");
        System.out.println("Há mais queijo na geladeira ?");
        String acao1 = sc.nextLine();
        if (acao1.equals("sim")) {
            System.out.println("coloque ele no pão");
            System.out.println("Seu Pão foi deliciosamente feito !!!");
        } else if (acao1.equals("nao")) {
            System.out.println("Verifique se há presunto");
            System.out.println("H[a presunto ?");
            String acao1P = sc.nextLine();
            if (acao1P.equals("sim")) {
                System.out.println("Coloque ele no pão");
            } else if (acao1P.equals("nao")) {
                System.out.println("PRECISAMOS FAZER COMPRAS AGORA !!!");
            }
            sc.close();
        } else {
            System.out.println("Digite um comando valido !!!");
            System.out.println("Sistema Fechado tente novamente");
            sc.close();
        }
    }
}
