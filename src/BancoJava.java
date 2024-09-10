import java.util.Scanner;

public class BancoJava {
    public static void main(String[] args) {
        String nomeDoCliente = "Nickollas";
        String tipoDeConta = "Corrente";
        double saldo = 1000;
        Scanner leitura = new Scanner(System.in);

        System.out.printf("""
                    ************************************
                    
                    Dados iniciais do cliente:
                    Nome:   %s
                    Tipo de conta:  %s
                    Saldo: R$%.2f
                    
                    ************************************
                """, nomeDoCliente, tipoDeConta, saldo);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("""
                        Operações:
                        1 - Consultar saldo
                        2 - Receber valor
                        3 - Transferir valor
                        4 - Sair
                    
                        Digite a opção desejada:
                    """);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Insira o valor que irá receber:");
                    double valorDepositado = leitura.nextDouble();
                    if (valorDepositado < 0) {
                        System.out.println("Valor é inválido");
                    } else {
                        saldo += valorDepositado;
                    }
                    System.out.printf("Saldo atualizado: R$%.2f\n", saldo);
                    break;
                case 3:
                    System.out.println("Insira o valor que irá transferir:");
                    double valorTransferido = leitura.nextDouble();
                    if (valorTransferido > saldo) {
                        System.out.println("Saldo insuficiente para transferência");
                    } else {
                        saldo -= valorTransferido;
                        System.out.printf("Saldo atualizado: R$%.2f\n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Aplicação encerrada...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
