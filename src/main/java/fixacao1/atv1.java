package fixacao1;

import java.util.Locale;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product1 = "Computer";
        String product2 = "Office disk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtcs :");
        System.out.println("which " + product1 + "price is :" + price1); //Sempre utilizar 2 "+" para colocar mais de uma variavel
        System.out.println("which " + product2 + "price is :" + price2);
        System.out.println("Record " + age + " years old, code " + code + " and gender :" + gender);
        System.out.printf("Meansure with eight decimal places : %.8f%n", measure); //Sempre que for usar função colocar printf, depois a função em % (mod)
        System.out.printf("Rouded three decimal places : %.3f%n", measure);

        Locale.setDefault(Locale.US); // usado para localizar em idioma infles
        System.out.println("US decimal :" + measure);


    }
}
