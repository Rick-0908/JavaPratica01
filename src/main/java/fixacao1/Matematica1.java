package fixacao1;

public class Matematica1 {
    public static void main(String[] args) {

        double x = 3.0; // Lembrar sempre de declarar o valor da variavel double com as casas decimais
        double y = -4.0;
        double z = -5.9;
        double A,B,C; // Aqui A,B,C serão variaveis para testarmos as funções matemáticas

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        // Mart.sqrt  calcula raiz quadrada
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de " + z + " = " + C);
        // print dos valores para melhor visualização no console
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0,2.0);
        // Mart.pow calcula a potenciação (primeiro numero elevado ao segundo)
        System.out.println(x + "elevado a " + y + " = " + A);
        System.out.println(x + "elevado ao quadrado = " + B );
        System.out.println("5 elevado ao quadrado = " + C);
        // print dos resultados
        A = Math.abs(y);
        B = Math.abs(z);
        //Math.abs mostra o valor absoluto
        // valor absoluto é a distancia de um número em uma reta númerica por ex -5 até 0 a distancia é 5
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
        // print dos resultados
    }
}
