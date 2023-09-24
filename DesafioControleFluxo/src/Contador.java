import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Contador {

    
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 50: ");
        int primeiroNumero = terminal.nextInt();

        System.out.println("Digite outro número de 0 a 50: ");
        int segundoNumero = terminal.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        }catch(ParametrosInvalidosException e);
            System.out.println(" ");
        {

        }


    }
    
    static void contar (int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (primeiroNumero > segundoNumero);
        throw new ParametrosInvalidosException();

        
        
    }
}
