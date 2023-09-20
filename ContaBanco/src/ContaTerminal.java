import java.util.Scanner;
import java.util.Locale;
//TODO: Conhecer e importar a classe Scanner



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Bem vindo ao Banco Goulart, para iniciarmos insira as informações solicitadas e pressione ENTER para o próximo campo.");
        
        System.out.print("Qual o seu nome? ");  
        String nome = scanner.next();

        System.out.println("Infome o número da sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da sua conta SEM o dígito: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();


        //exibir a mensagem final 
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " sua conta é " + conta + " e o seu saldo de R$ " + saldo + " já está disponível para saque." );


    }
}
