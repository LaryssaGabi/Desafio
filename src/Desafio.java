import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome = "Laryssa Gabriela";
        String tipoConta = "Corrente";
        double saldo = 1900.00;
        int opcao = 0;


        System.out.println("-----Dados Bancarios-----");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**************************");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar Saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leia.nextInt();
        }
    }
}
