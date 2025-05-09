// Classe principal com menu interativo

import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();
        int opcao;

        do {
            System.out.println("\n=== Menu de Clientes ===");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente por CPF");
            System.out.println("4 - Atualizar cliente");
            System.out.println("5 - Remover cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Cliente novoCliente = new Cliente(nome, cpf, email);
                    clienteService.adicionarCliente(novoCliente);
                    break;

                case 2:
                    clienteService.listarClientes();
                    break;

                case 3:
                    System.out.print("Digite o CPF: ");
                    String cpfBusca = scanner.nextLine();
                    Cliente encontrado = clienteService.buscaPorCpf(cpfBusca);
                    if (encontrado != null) {
                        System.out.println("🔍 Cliente encontrado: " + encontrado);
                    } else {
                        System.out.println("❌ Cliente não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("CPF do cliente a atualizar: ");
                    String cpfAtualizar = scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = scanner.nextLine();

                    Boolean atualizado = clienteService.atualizarCliente(cpfAtualizar, novoNome, novoEmail);
                    if (atualizado) {
                        System.out.println("✅ Cliente atualizado com sucesso.");
                    } else {
                        System.out.println("❌ Cliente não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("CPF do cliente a remover: ");
                    String cpfRemover = scanner.nextLine();
                    boolean removido = clienteService.removerCliente(cpfRemover);
                    if (removido) {
                        System.out.println("Cliente removido.");
                    } else {
                        System.out.println("❌ Cliente não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("👋 Encerrando o programa...");
                    break;

                default:
                    System.out.println("❗ Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
