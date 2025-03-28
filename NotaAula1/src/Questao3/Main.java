package Questao3;

/*Crie uma classe chamada "Produto" que representará um produto com os atributos nome,
preço e quantidade em estoque. Implemente métodos para adicionar estoque e vender
unidades do produto. Na classe principal, crie um objeto Produto, realize operações de:
• Adicionar estoque
• Vender produtos
• Exibir o estoque.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int novocadastro = 0;
        int alterarcadastro = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Produto p = new Produto();

        do {
            System.out.println("=== Cadastrar produto ===");

            System.out.println("Digite o nome do produto: ");
            p.nome = sc2.nextLine();

            System.out.println("Digite o preço do produto: ");
            p.preco = sc.nextDouble();

            System.out.println("Digite a quantidade atual do estoque");
            p.estoqueinicial = sc.nextInt();

            System.out.println("Gostaria de cadastrar um novo produto? Digite 0 para cadastrar e digite 1 para encerrar");
            novocadastro = sc.nextInt();
        }while (novocadastro == 0);

                do{
                    System.out.println("=== Alterar produto ===");

                    System.out.println("Digite o nome do produto: ");
                    p.nome = sc3.nextLine();

                    System.out.println("Digite a quantidade para adicionar ao estoque: ");
                    p.estoquenovo = sc.nextInt();

                    p.adicionarEstoque();

                    System.out.println("Digite a quantidade vendida do produto: ");
                    p.venda = sc.nextInt();

                    p.vender();

                    p.exibirEstoque();

                    System.out.println("O estoque atual de " + p.nome + " é: " + p.estoquefinal + " no valor de R$" + p.preco);

                    System.out.println("Digite 0 para realizar uma nova alteração ou digite 1 para finalizar");
                    alterarcadastro = sc.nextInt();
                }while (alterarcadastro == 0);
                }
        }


