public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Qual o volume atual: " + smartTv.volume);

        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Em qual canal está: " + smartTv.canal);
        System.out.println("Qual o volume atual: " + smartTv.volume);

        smartTv.ligar (); 
        System.out.println("Novo status-> A Tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> A Tv está ligada? " + smartTv.ligada);


    }
}
