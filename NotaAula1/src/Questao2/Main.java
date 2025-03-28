package Questao2;

/*Defina um sistema onde o usuário informe (na classe principal, através do teclado) qual
opção deseja visualizar. Caso informe 1 ele vai ver a soma de dois números. Caso informe
2, vai ver a subtração, 3 divisão e 4 multiplicação. Observação: Estas operações deverão
ser realizadas em uma classe chamada Matemática.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matematica mat = new Matematica();
        int r = 0;

        do {
            System.out.println("Digite 1 para somar dois números, 2 para subtrair, 3 para dividir e 4 para multiplicar");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Somar");
                    System.out.println("Digite o primeiro número para somar: ");
                    mat.n1 = sc.nextInt();
                    System.out.println("Digite o segundo número para somar: ");
                    mat.n2 = sc.nextInt();

                    mat.somar();

                    System.out.println(mat.total);
                    break;

                case 2:
                    System.out.println("Subtrair");
                    System.out.println("Digite o primeiro número para subtrair: ");
                    mat.n1 = sc.nextInt();
                    System.out.println("Digite o segundo número para subtrair: ");
                    mat.n2 = sc.nextInt();

                    mat.subtrair();

                    System.out.println(mat.total);
                    break;

                case 3:
                    System.out.println("Dividir");
                    System.out.println("Digite o primeiro número para dividir: ");
                    mat.n1 = sc.nextInt();
                    System.out.println("Digite o segundo número para dividir: ");
                    mat.n2 = sc.nextInt();

                    mat.dividir();

                    System.out.println(mat.total);
                    break;

                case 4:
                    System.out.println("Multiplicar");
                    System.out.println("Digite o primeiro número para multiplicar: ");
                    mat.n1 = sc.nextInt();
                    System.out.println("Digite o segundo número para multiplicar: ");
                    mat.n2 = sc.nextInt();

                    mat.multiplicar();

                    System.out.println(mat.total);
                    break;

                default:
                    System.out.println("Inválido");

                    System.out.println("Para fazer novos cálculos, digite 0, para finalizar, digite 1");
                    r = sc.nextInt();

            }

        } while (r == 0);
    }
}