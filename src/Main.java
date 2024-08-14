public class Main {

    public static void main(String[] args) {
        // Criação de um cliente com um nome
        Cliente venilton = new Cliente("Venilton");

        // Criação de contas com o cliente
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        // Operações com contas
        try {
            cc.depositar(100);
            cc.transferir(100, poupanca);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Erro ao realizar operações: " + e.getMessage());
        }

        // Impressão dos extratos
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
