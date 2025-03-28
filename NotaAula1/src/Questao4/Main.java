package Questao4;

/*Elabore um programa que simule um sistema bancário de um cliente. Inicialmente o saldo
está zerado, mas o cliente pode escolher qualquer uma das seguintes opções do menu:
• Consultar saldo
• Depositar
• Sacar
• Transferir
Uma observação é que o cliente só pode sacar e transferir se o saldo da conta não estiver
zerado.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Cliente c = new Cliente();

        do {
            System.out.println("Digite 1 para consultar seu saldo, 2 para depositar, 3 para sacar e 4 para transferir");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("=> Saldo:");
                    System.out.println("O seu saldo atual é de R$ :" + c.getSaldo());
                    break;

                case 2:
                    System.out.println("=> Depositar");
                    System.out.println("Digite o valor a ser depositado: ");
                    c.setDeposito(sc.nextDouble());

                    c.depositar();

                    System.out.println("Você depositou R$ :" + c.getDeposito());
                    break;

                case 3:
                    System.out.println("=> Sacar");
                    System.out.println("Digite o valor a ser sacado: ");
                    c.setSaque(sc.nextDouble());

                    c.sacar();
                    break;

                case 4:
                    System.out.println("=> Transferir");
                    System.out.println("Digite o valor que deseja transferir: ");
                    c.setTransferencia(sc.nextDouble());

                    c.transferir();
                    break;

                default:
                    System.out.println("Inválido");

                    System.out.println("Para repetir o menu de opções, digite 0, para finalizar, digite 1");
                    menu = sc.nextInt();

            }

        } while (menu == 0);
    }
}