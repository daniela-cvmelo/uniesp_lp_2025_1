package Questao4;

public class Cliente {

    private String nome;
    private double saldo;
    private double deposito;
    private double saque;
    private double transferencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }

    public void consultarSaldo(){
        if (saldo > 0 ) {
            System.out.println("O seu saldo é de R$ " + saldo);
        } else {
            System.out.println("Você não possui saldo");
        }
    }

    public void depositar() {
        saldo = saldo + deposito;
    }

    public void sacar(){
        if (saldo > 0 ) {
            saldo = saldo - saque;
            System.out.println("Você sacou R$: " + saque);
        } else {
            System.out.println("Você não possui saldo");
        }
    }

    public void transferir(){
        if (saldo > 0 ) {
            saldo = saldo - transferencia;
            System.out.println("Você transferiu R$ :" + transferencia);
        } else {
            System.out.println("Você não possui saldo");
        }
    }
}
