public class PlanoOperadora {
  public static void main(String[] args) {
    
    String plano = "T"; //M / T
		//neste cenário o switch case está sendo utilizado sem o break de forma complementar 
    switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
  }
}
//o uso de break vai depender da condição apresentada, se queremos ou não dar continuidade 