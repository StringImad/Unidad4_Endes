package refactorizacion;

public class CasoDbis {

	static int salario(int horas, int horasextra,int salariobase) {
	 horas=(int) (horas+horasextra*1.5);
	 salariobase=salariobase*horas;
	 
	 return salariobase ;
}
	
	
	 public static void main(String[] args) {
		 int horas=35;
		 int horasextras=4;		 
		 int salariobase=1000;
		 
		 System.out.println (salario(horas,horasextras,salariobase));
	 }
	
	
	
	
}
