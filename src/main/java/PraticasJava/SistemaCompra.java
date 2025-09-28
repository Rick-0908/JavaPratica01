package PraticasJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Equipamento = {"Capacete - 1", "Luvas - 2", "Botas - 3", "Cinto - 4"};
        String[] Roupas = {"Blusa - 1", "Calça - 2", "Cueca - 3", "Moletom - 4"};
        String[] Ferramentas = {"martelo - 1", "Chave de Fenda - 2", "Chave Phillips - 3", "Compressor - 4"};
        String[] Perifericos = {"Fone de Ouvido - 1", "Mouse - 2", "Teclado - 3", "Monitor - 4"};
        String[] Pagamento = {"Cartão de Crédito", "Cartão de Debito","Pix","Boleto"};

        System.out.println("==================================================");
        System.out.println("Boas Vindas ao sistema de Compra");
        System.out.println("==================================================");

        System.out.println("Deseja comprar qual dos itens abaixo ?");
        System.out.println("1 - Equipamentos");
        System.out.println("2 - Roupas");
        System.out.println("3 - Ferramentas");
        System.out.println("4 - Perifericos");
        String opcao = sc.next();
        if (opcao.equals("1")) {
            System.out.println("Digite o produto desejado 1 de cada vez");
            System.out.println(Equipamento[0]);
            System.out.println(Equipamento[1]);
            System.out.println(Equipamento[2]);
            System.out.println(Equipamento[3]);
            String opcaoR = sc.next();
            if (opcaoR.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4")) {
                if (opcaoR.equals("1")) {
                    System.out.println("Otima escolha !!! Sua escolha foi: " + Equipamento[0]);
                }
                if (opcaoR.equals("2")) {
                    System.out.println("Otima escolha !!! Sua escolha foi: " + Equipamento[1]);
                }
                if (opcaoR.equals("3")) {
                    System.out.println("Otima escolha !!! Sua escolha foi: " + Equipamento[2]);
                }
                if (opcaoR.equals("4")) {
                    System.out.println("Otima escolha !!! Sua escohla foi: " + Equipamento[3]);
                }

            }
        } else if (opcao.equals("2")) {
            System.out.println("Digite o produto desejado 1 de cada vez");
            System.out.println(Roupas[0]);
            System.out.println(Roupas[1]);
            System.out.println(Roupas[2]);
            System.out.println(Roupas[3]);
            String opcaoR2 = sc.next();
            if (opcaoR2.equals("1") || opcaoR2.equals("2") || opcaoR2.equals("3") || opcaoR2.equals("4")) {
                if (opcaoR2.equals("1")) {
                    System.out.println("Otima escolha !!! Sua escolha foi: " + Roupas[0]);
                }
                if (opcaoR2.equals("2")) {
                    System.out.println("Otima escolha !!! Sua escolha foi: " + Roupas[1]);
                }
                if (opcaoR2.equals("3")) {
                    System.out.println("Otima escolha !!! Sua escolha foi: " + Roupas[2]);
                }
                if (opcaoR2.equals("4")) {
                    System.out.println("Otima escolha !!! Sua escohla foi: " + Roupas[3]);
                }

            }
        } else if (opcao.equals("3")) {
            System.out.println("Digite o produto desejado 1 de cada vez");
            System.out.println(Ferramentas[0]);
            System.out.println(Ferramentas[1]);
            System.out.println(Ferramentas[2]);
            System.out.println(Ferramentas[3]);
            String opcaoR3 = sc.next();
            if (opcaoR3.equals("1") || opcaoR3.equals("2") || opcaoR3.equals("3") || opcaoR3.equals("4")) {
                if (opcaoR3.equals("1")) {
                    System.out.println("Otima Escolha !!! Sua escolha foi: " + Ferramentas[0]);
                }
                if (opcaoR3.equals("2")) {
                    System.out.println("Otima Escolha !!! Sua escolha foi: " + Ferramentas[1]);
                }
                if (opcaoR3.equals("3")) {
                    System.out.println("Otima Escolha !!! Sua escolha foi: " + Ferramentas[2]);
                }
                if (opcaoR3.equals("4")) {
                    System.out.println("Otima Escolha !!! Sua escolha foi: " + Ferramentas[3]);
                }
            }
        } else if (opcao.equals("4")) {
            System.out.println("Digite o produto desejado 1 de cada vez");
            System.out.println(Perifericos[0]);
            System.out.println(Perifericos[1]);
            System.out.println(Perifericos[2]);
            System.out.println(Perifericos[3]);
            String opcaoR4 = sc.next();
            if (opcaoR4.equals("1") || opcaoR4.equals("2") || opcaoR4.equals("3") || opcaoR4.equals("4")) {
                if (opcaoR4.equals("1")) {
                    System.out.println("Otima Escolha !!! sua escolha foi: " + Perifericos[0]);
                }
                if (opcaoR4.equals("2")) {
                    System.out.println("Otima escolha !!! sua escolha foi: " + Perifericos[1]);
                }
                if (opcaoR4.equals("3")) {
                    System.out.println("Otima escolha !!! sua escolha foi: " + Perifericos[2]);
                }
                if (opcaoR4.equals("4")) {
                    System.out.println("Otima escolha !!! sua escolha foi: " + Perifericos[3]);
                }
            }
        }
            System.out.println("Como Deseja fazer o pagamento ?");
            System.out.println(Pagamento[0]);
            System.out.println(Pagamento[1]);
            System.out.println(Pagamento[2]);
            System.out.println(Pagamento[3]);
            String opcaoP = sc.next();
            if (opcaoP.equals("1") || opcaoP.equals("2") || opcaoP.equals("3") || opcaoP.equals("4")) {
                if (opcaoP.equals("1")) {
                    System.out.println("Cartão de Credito selecionado, Verifique o APP do seu bando !!!");
                }if (opcaoP.equals("2")) {
                    System.out.println("Cartão de Debidto selecionado, Verifique o APP do seu bando !!!");
                }if (opcaoP.equals("3")) {
                    System.out.println("Metodo de pagamento PIX selecionado  (QR CODE APARECE AQUI)");
                }if (opcaoP.equals("4")) {
                    System.out.println("Um boleto foi gerado com sucesso verifique seu email !!!");
            }
        }
    }
}