package exercicioFIxacao;

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o 1 número");
        double n1 = sc.nextDouble();
        System.out.print("Digite o 2 número");
        double  n2 = sc.nextDouble();

        double resultado = 0;

        resultado = n1 + n2;

        System.out.printf("O seu resultado é : %.2f%n ",resultado);


    }
}
