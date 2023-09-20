public class ResultadoFinal {
  public static void main(String[] args) {
    
    int nota = 4;

	if (nota >= 7) //if precisa retornar true
  //if será sempre a primeira instrução 
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7) // else if precisa retornar true ou false 
  //posso ter diversos else if 
		System.out.println("Recuperação");
	else //else precisa retornar false 
  //else será sempre a última instrução
		System.out.println("Reprovado");
  }
}
