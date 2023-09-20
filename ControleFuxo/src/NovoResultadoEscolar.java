public class NovoResultadoEscolar {
  
  public static void main(String[] args) {
    int nota = 3;
		String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
    //expressão ternária que joga para uma variável 
		System.out.println(resultado);
  }
}
