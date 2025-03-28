package Questao3;

public class Produto {

    String nome;
    double preco;
    int estoqueinicial;
    int estoqueatual;
    int estoquefinal;
    int estoquenovo;
    int venda;

    public void adicionarEstoque(){
        estoqueatual = estoqueinicial + estoquenovo;
    }

    public void vender(){
        estoquefinal = estoqueatual - venda;
    }

    public void exibirEstoque(){
        System.out.println(estoquefinal);
    }

}
