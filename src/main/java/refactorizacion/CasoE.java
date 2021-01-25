package refactorizacion;

public class CasoE {

	static String buscaAnimal(String[] animales) {
		
		for (int i=0; i<animales.length;i++) 
		{
			if (animales[i].equals("Perro")) {
			return "Perro";		
		}
			if (animales[i].equals("Tortuga")) {
				return "Tortuga";		
			}	
			
			if (animales[i].equals("Loro")) {
					return "Loro";		
				}
		
	   }
	  return "No encontrado";
	}	
	
	 public static void main(String[] args) {
		String[] animales1= {"pez","pájaro","León"};
		String[] animales2= {"pez","Loro","León"};
			 
		System.out.println (buscaAnimal(animales1));
		System.out.println (buscaAnimal(animales2));
	 }









}
