
public class Cliente {

    private String nome;

    // Construtor para inicializar o nome do cliente
    public Cliente(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    // Sobrescrita do método toString para fácil impressão dos detalhes do cliente
    @Override
    public String toString() {
        return "Cliente{nome='" + nome + "'}";
    }
}
