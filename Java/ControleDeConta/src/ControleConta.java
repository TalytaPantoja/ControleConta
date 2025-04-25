import java.util.Scanner;

public class ControleConta {
    String nome = "Talyta";
    String tipoConta = "Corrente";
    double saldoInicial = 2000;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleConta controleConta = new ControleConta();
        int opcao = 0;

        do {
            System.out.println("\n**** Menu Opcoes ****");
            System.out.println("1. Consultar Saldos");
            System.out.println("2. Receber Valor");
            System.out.println("3. Transferir Valor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + controleConta.saldoInicial);
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.println("Digite o valor a ser recebido: ");
                    double receber = scanner.nextDouble();
                    controleConta.saldoInicial += receber;
                    System.out.println("Novo saldo: " + (receber + controleConta.saldoInicial));
                    break;

                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    double transferir = scanner.nextInt();

                    if (controleConta.saldoInicial > transferir){
                        System.out.println("Transferido com sucesso. Novo saldo: " + (controleConta.saldoInicial - transferir));
                    } else {
                        System.out.println("Transação inválida. Seu saldo é: " + controleConta.saldoInicial);
                    }
                    break;

                case 0:
                    System.out.println("Operacao encerrada. Até a próxima");
                    break;

                default:
                    System.out.println("Opcao inválida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
