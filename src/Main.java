
public class Main {
    public static void main(String[] args) {
        Cliente allan = new Cliente();
        allan.setNome("Allan");

        Conta cc = new ContaCorrente(allan);
        Conta poupanca = new ContaPoupanca(allan);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
