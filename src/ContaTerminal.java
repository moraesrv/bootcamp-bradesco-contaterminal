
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, informe a agência: ");
        String agencia = scanner.nextLine();
    
        System.out.print("Por favor, informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f", nomeCliente, agencia, numero, saldo));

        scanner.close();
    }

}