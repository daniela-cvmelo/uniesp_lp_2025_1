    public class Produto {

    private String nome;
    private int codigo;
    private String cor;
    private double preco;
    private double valor;
    private int quantidade;
    private int venda;
    private int novoestoque;
    private int tipoPagamento;
    private double pagamentoRecebido;
    private double troco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    private double tamanho;

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    public int getNovoestoque() {
        return novoestoque;
    }

    public void setNovoestoque(int novoestoque) {
        this.novoestoque = novoestoque;
    }

    public int getTipoPagamento() {
            return tipoPagamento;
        }

    public void setTipoPagamento(int tipoPagamento) {
            this.tipoPagamento = tipoPagamento;
        }

        public double getPagamentoRecebido() {
            return pagamentoRecebido;
        }

        public void setPagamentoRecebido(double pagamentoRecebido) {
            this.pagamentoRecebido = pagamentoRecebido;
        }

        public double getTroco() {
            return troco;
        }

        public void setTroco(double troco) {
            this.troco = troco;
        }

        public void vender() {
        quantidade = quantidade - venda;
    }

    public void atualizarEstoque() {
        quantidade = quantidade + novoestoque;
    }

    public void devolverTroco(){
        troco = pagamentoRecebido - preco;
    }







    }


