/**
 * Interface que define as operações básicas para uma conta bancária.
 */
public interface IConta {

    /**
     * Realiza um saque da conta.
     * 
     * @param valor o valor a ser sacado
     * @throws IllegalArgumentException se o valor for maior que o saldo disponível
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta.
     * 
     * @param valor o valor a ser depositado
     * @throws IllegalArgumentException se o valor for menor ou igual a zero
     */
    void depositar(double valor);

    /**
     * Realiza uma transferência de valores entre contas.
     * 
     * @param valor o valor a ser transferido
     * @param contaDestino a conta para a qual o valor será transferido
     * @throws IllegalArgumentException se o valor for maior que o saldo disponível
     * @throws NullPointerException se a contaDestino for nula
     */
    void transferir(double valor, IConta contaDestino);

    /**
     * Imprime o extrato da conta.
     */
    void imprimirExtrato();
}
