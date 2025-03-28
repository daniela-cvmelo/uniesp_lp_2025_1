package Questao1;

/* Defina uma classe Questao1.Aluno que faça o cadastro do nome e das 3 notas e a operação do cálculo
da média. Ao final, exiba (na classe principal) a média. Em seguida, informe se ele está
aprovado, reprovado ou na final. Se a média for >= 70 está aprovado, abaixo de 40 está
reprovado, senão, está na final. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int r;
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        do {
            System.out.println("Digite seu nome");
            a.setNome(sc.next());

            System.out.println("Digite a nota 1");
            a.setNota1(sc.nextDouble());

            System.out.println("Digite a nota 2");
            a.setNota2(sc.nextDouble());

            System.out.println("Digite a nota 3");
            a.setNota3(sc.nextDouble());

            a.calcularMedia();

            System.out.println("A média final foi: " + a.getMedia());

            if (a.getMedia() >= 7) {
                System.out.println("Parabéns, você foi aprovado ");
            } else if (a.getMedia() >= 4 && a.getMedia() < 7) {
                System.out.println("Você foi pra final");
            } else {
                System.out.println("Você foi reprovado ");
            }

            System.out.println("Para calcular a média de outro aluno, digite 0, para finalizar, digite 1");
            r = sc.nextInt();

        }while(r ==0);
        }
    }

















