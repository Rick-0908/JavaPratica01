package PraticasJava;

import java.util.Scanner;

public class roboFacilitador01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Iniciando Robo");

        System.out.println("Deseja fazer o robo estender o braço ?");
        String racao1 = sc.nextLine();
        if (racao1.equals("sim")) {
            System.out.println("Robo estendeu o braço");
            System.out.println("Deseja fazer com que abras os dedos com o polegar ?");
            String racao2 = sc.nextLine();
            if (racao2.equals("sim")) {
                System.out.println("O robo abriu os dedos polegar e indicador");
                System.out.println("Deseja fazer com que o robo posicione os dedos envolta do lapis? ");
                String racao3 = sc.nextLine();
                if (racao3.equals("sim")) {
                    System.out.println("O robo pegou o lapis");
                    System.out.println("Deseja que o robo feche os olhos e aplique pressão ao lapis ?");
                    String racao4 = sc.nextLine();
                    if (racao4.equals("sim")) {
                        System.out.println("Deseja com que o robo levante os braços com o lapis ?");
                        String racao5 = sc.nextLine();
                        if (racao5.equals("sim")) {
                            System.out.println("Deseja com que o robo gire o corpo com os braços levantados com o lapis n mão ?");
                            String racao6 = sc.nextLine();
                            if (racao6.equals("sim")) {
                                System.out.println("Robo programado com sucesso");
                            }
                        }
                    }
                }
            }
        } else if (racao1.equals("nao")) {
            System.out.println("O robo não estendeu o braço logo não pegou o lapis");
        } else ;
        System.out.println("Digite um comando valido !!!");
        System.out.println("Sistema Fechado tente novamente");
        sc.close();

    }
}
