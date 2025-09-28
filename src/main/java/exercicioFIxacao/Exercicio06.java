package exercicioFIxacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1 valor: ");
        double A = sc.nextDouble();
        System.out.print("Digite o 2 valor :");
        double B = sc.nextDouble();
        System.out.print("Digite o 3 valor :");
        double C = sc.nextDouble();

        double resultado = 0;

        resultado = (A * C)/2;
        System.out.println("O valor do triangulo é : " + resultado );

        double resultado2 = 0;
        double pi = 3.14159;
        resultado2 = pi*Math.pow(C,2);
        System.out.printf("A area de C é : %.2f%n" , resultado2 );

        double resultado3 = 0;
        resultado3 = (A - B) * C/2;
        System.out.printf("A área do trapezio é : %.0f%n", resultado3);

        double resultado4 = 0;
        resultado4 = Math.sqrt(B);
        System.out.printf("A área do quabrado de B é : %.0f%n", resultado4);

        double resultado5 = 0;
        resultado5 = A * B;
        System.out.printf("A área do quadrado A e B é : %.0f%n", resultado5);
    }
}
