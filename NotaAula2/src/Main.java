/*Crie um sistema para controle de um produto com atributos código, nome,
        tamanho/peso, cor, valor e quantidade no estoque.
        O sistema deve permitir o cadastro dos dados, além de realizar a venda e
        fazer o controle do estoque.
        Para o pagamento, temos os seguintes benefícios:
        Pix, Espécie, Transferência ou Débito, 5% de desconto.
        Crédito, parcelar em 3x sem juros.
        Observação: Espécie, caso o valor pago seja maior que o valor do produto,
        informar o troco.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        do {
            System.out.println("Digite 1 para cadastrar um produto, 2 para realizar uma venda, 3 atualizar o estoque");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("=== Cadastrar um novo produto ===");
                    System.out.println("=> Digite o código do produto:");
                    p.setCodigo(sc.nextInt());
                    System.out.println("=> Digite o nome do produto:");
                    p.setNome(sc2.nextLine());
                    System.out.println("=> Digite a cor do produto:");
                    p.setCor(sc.next());
                    System.out.println("=> Digite a quantidade do produto:");
                    p.setQuantidade(sc.nextInt());
                    System.out.println("=> Digite o tamanho do produto:");
                    p.setTamanho(sc.nextDouble());
                    System.out.println("=> Digite o valor do produto:");
                    p.setPreco(sc.nextDouble());

                    System.out.println("Código: " + p.getCodigo() + "\nNome: " + p.getNome() + "\nCor: " + p.getCor() + "\nQuantidade: " + p.getQuantidade() + " unidades" + "\nTamanho: " + p.getTamanho() + " cm" + "\nValor: R$" + p.getPreco() + "\n***Cadastro feito com sucesso!***");
                    break;

                case 2:
                    System.out.println("=== Realizar uma venda ===");
                    System.out.println("Digite a quantidade vendida: ");
                    p.setVenda(sc.nextInt());

                    p.vender();

                    System.out.println("Digite o método de pagamento: 1 para Pix, 2 para Dinheiro, 3 para Transferência/Débito, 4 para Crédito");
                    p.setTipoPagamento(sc.nextInt());

                    if (p.getTipoPagamento() == 1 || p.getTipoPagamento() == 2 || p.getTipoPagamento() == 3) {
                        System.out.println("Esse método de pagamento dá direito a 5% de desconto");
                    }else {
                        System.out.println("O parcelamento pode ser feito em até 3x sem juros");
                    }

                    System.out.println("Digite o valor recebido pela venda");
                    p.setPagamentoRecebido(sc.nextDouble());

                    if (p.getTipoPagamento() == 2){
                        if (p.getPagamentoRecebido() > p.getPreco()){
                            p.devolverTroco();

                            System.out.println("O seu troco é de: R$" + p.getTroco());
                        }
                    }

                    System.out.println("Você vendeu " + p.getVenda() + " unidades de " + p.getNome() + "\nO estoque atual de " + p.getNome() + " é de " + p.getQuantidade() + " unidades");

                    break;

                case 3:
                    System.out.println("=== Atualizar o estoque ===");
                    System.out.println("Digite a quantidade para adicionar ao estoque: ");
                    p.setNovoestoque(sc.nextInt());

                    p.atualizarEstoque();

                    System.out.println("O estoque atual de " + p.getNome() + " é de " + p.getQuantidade() + " unidades");

                    break;


                default:
                    System.out.println("Inválido");

                    System.out.println("Para repetir o menu de opções, digite 0, para finalizar, digite 1");
                    menu = sc.nextInt();

            }

        } while (menu == 0);
    }
}