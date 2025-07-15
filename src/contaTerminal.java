import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conta;
        String ag;
        String cliente;
        float saldo;

        System.out.println("Bem-vindo ao JavaBank!");
        System.out.println("Vamos criar sua conta e adicionar seu saldo inicial!");
        System.out.println("-------------------------------------------------");
        System.out.println("Para iniciar, digite o número da sua agência: ");
        ag = sc.nextLine();
        System.out.println("Agora, digite o número da sua conta: ");
        conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu nome:");
        cliente = sc.nextLine();
        System.out.println("Por fim, digite o valor do seu depósito inicial:");
        saldo = sc.nextFloat();
        System.out.println("-------------------------------------------------");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$ %s já está disponível para saque.", cliente, ag, conta, saldo);
    }
}
