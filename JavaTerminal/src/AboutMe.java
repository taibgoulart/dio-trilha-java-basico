import java.util.Locale;
import java.util.Scanner;


public class AboutMe {

  public static void main (String[] args){

    //criando o objeto scanner 
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    
    System.out.println("Qual o seu nome? ");
    String nome = scanner.next();

    System.out.println("Qual seu sobrenome? ");
    String sobrenome = scanner.next();

    System.out.println("Qual sua idade? ");
    int idade = scanner.nextInt();

    System.out.println("Qual a sua altura? ");
    double altura = scanner.nextDouble();

    //imprimind os dados obtidos pelo usuário 
    System.out.println("Oii, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + "cm, e estou muito feliz em compartilhar meu aprendizado em Java com vocês! :)");



  }
  
}
