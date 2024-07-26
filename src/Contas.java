public abstract class Contas implements ICONTA {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Contas() {
        this.agencia = Contas.AGENCIA_PADRAO;
        this.conta = Contas.SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Contas contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes() {
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.conta);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }


}







