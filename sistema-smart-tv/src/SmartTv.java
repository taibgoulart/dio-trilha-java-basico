public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
      //o mesmo que volume + 1
      volume++;
    }
    public void diminuirVolume(){
      //o mesmo que volume - 1
      volume--;
    }

    public void ligar(){
      ligada=true;
    }
    public void desligar(){
      ligada=false;
    }
}
