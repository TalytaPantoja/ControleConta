// Recebe a lista de clientes
public class Cliente {
    private String nome;  // Atributo privado
    private String cpf;   // Atributo privado
    private String email; // Atributo privado

// Construtor para inicializar os dados do cliente
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
// Métodos getters para acessar os dados
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }

// Métodos setters para modificar os dados
    public String setNome(String novoNome) {
        return nome;
    }
    public String setCpf() {
        return cpf;
    }
    public String setEmail(String novoEmail) {
        return email;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | CPF: " + cpf + " | Email: " + email;
    }
}

