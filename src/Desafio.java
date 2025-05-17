import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome = "Laryssa Gabriela";
        String tipoConta = "Corrente";
        double saldo = 1900.00;
        int opcao = 0;


        System.out.println("===== Dados Bancários =====");
        System.out.printf("Nome do cliente: %s%n", nome);
        System.out.printf("Tipo de conta: %s%n", tipoConta);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("===========================\n");


        String menu = """
                ==============================
                        MENU PRINCIPAL
                ==============================
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                ==============================
                Escolha uma opção:
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leia.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo em conta é de: " + saldo);
                System.out.println("\n");

            } else if (opcao == 2) {
                System.out.println("Quanto gostaria de transferir? ");
                double transferir = leia.nextDouble();
                System.out.println("\n");

                if (transferir > saldo) {
                    System.out.println("O valor que gostaria de transferir é maior do que se encontra em conta.");
                    System.out.println("\n");
                } else {
                    saldo -= transferir;
                    System.out.println("O novo valor do saldo em conta é de: " + saldo);
                    System.out.println("\n");
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                System.out.println("\n");

                double valoReceber = leia.nextDouble();
                saldo += valoReceber;

                if (valoReceber > 0) {
                    System.out.println("O valor total em conta é de: " + saldo);
                    System.out.println("\n");
                } else {
                    System.out.println("O valor a receber tem que ser maior que  0");
                }

            } else if (opcao == 4) {
                System.out.println("Consulta bancaria encerrada...");
            } else {
                System.out.println("Digita uma opção valida");
                System.out.println("\n");
            }
        }
        leia.close();
    }
}

