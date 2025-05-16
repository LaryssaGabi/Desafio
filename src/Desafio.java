import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome = "Laryssa Gabriela";
        String tipoConta = "Corrente";
        double saldo = 1900.00;

        System.out.println("-----Dados Bancarios-----");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**************************");
    }
}
