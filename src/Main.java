public class Main {
    public static void main(String[] args) {
        Contas cc = new ContaCorrente();
        Contas pp = new ContaPoupanca();
        cc.depositar(500);
        cc.transferir(500, pp);
        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}