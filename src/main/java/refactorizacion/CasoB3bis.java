package refactorizacion;

public class CasoB3bis {
	 public static void main(String[] args) {
		 System.out.println(incrementoPrecioBase(10,2000.0));
	 }
	
	 static double incrementoPrecioBase(int cantidad,double preciounitario){
		 double preciobase=cantidad*preciounitario;
		 if (preciobase>1000)
			 return preciobase*0.90;
		 else
			 return preciobase*0.95;
	 }
			
	
	
}
