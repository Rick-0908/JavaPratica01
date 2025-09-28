package PraticasJava;

import java.util.Scanner;

public class autenticacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String acesso1 = "admin";
        String senha1 = "admin123";

        System.out.print("Digite seu acesso: \n(Admin,usuario)");
        String acesso2 = sc.nextLine();
        System.out.print("Digite seu senha: ");
        String senha2 = sc.nextLine();

        if (acesso2.equals(acesso1) && senha2.equals(senha1)) {
            System.out.println("O acesso permitido é total Boas vindas ADM guarde sua senha: " + senha1);
        }else if (acesso2.equals(acesso1)) {
            System.out.println("Senha incorreta para Admin");
        }else if (acesso2.equals(acesso2)) {
            System.out.println("Senha correta mas usuario invalido");
        }else if (senha2.equals(senha1)) {
            System.out.println("Acesso permitido totalmente");
        }else {
            System.out.println("Acesso negado");
        }


    }
}
