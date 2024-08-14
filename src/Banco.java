import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    // Construtor para inicializar o nome e a lista de contas
    public Banco(String nome) {
        setNome(nome);
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do banco não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(Conta conta) {
        if (conta != null) {
            contas.add(conta);
        } else {
            throw new IllegalArgumentException("Conta não pode ser nula");
        }
    }

    // Método para remover uma conta do banco
    public void removerConta(Conta conta) {
        contas.remove(conta);
    }
}
