import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaUsuario contaUsuario = new ContaUsuario();
        
        System.out.println("Por favor, digite o número da Conta !");
        contaUsuario.numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        contaUsuario.agencia = sc.nextLine();
        sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        contaUsuario.nomeCliente = sc.nextLine();

        System.out.println("Digite o valor a ser depositado !");
        contaUsuario.saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", contaUsuario.nomeCliente, contaUsuario.agencia, contaUsuario.numero, contaUsuario.saldo);

        sc.close();
    }
}
