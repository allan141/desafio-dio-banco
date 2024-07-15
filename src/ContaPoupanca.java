public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("=== Extrato Conta Poupanca ===");
        imprmirInfosComuns();
    }
}
