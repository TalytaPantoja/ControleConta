// Gerencia a lista de clientes e implementa funcionalidades do menu

import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private List<Cliente> clientes;

    public ClienteService(){
        this.clientes = new ArrayList<>();
    }

// Adiciona um cliente
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("✅ Cliente adicionado com sucesso!");
    }

// Lista todos os clientes
    public void listarClientes(){
            if (clientes.isEmpty()){
                System.out.println("⚠️ Nenhum cliente cadastrado.");
            } else {
                System.out.println("📋 Lista de clientes: ");
                for (Cliente cliente : clientes){
                    System.out.println(cliente);
                }
            }
    }

// Busca pelo CPF
    public Cliente buscaPorCpf(String cpf){
        for (Cliente cliente : clientes){
            if (cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

// Atualiza nome e email do cliente (baseado no CPF)
    public boolean atualizarCliente(String cpf, String novoNome, String novoEmail){
        Cliente cliente = buscaPorCpf(cpf);
        if (cliente != null){
            cliente.setNome(novoNome);
            cliente.setEmail(novoEmail);
            return true;
        }
        return false;
    }

// Remove cliente pelo CPF
    public boolean removerCliente(String cpf){
        Cliente cliente = buscaPorCpf(cpf);
        if (cliente != null){
            clientes.remove(cliente);
            return true;
        }
        return false;
    }
}
