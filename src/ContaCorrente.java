public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("=== Extrato Conta Corrente ===");
        imprmirInfosComuns();
    }
}
