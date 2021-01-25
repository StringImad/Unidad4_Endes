package refactorizacion;

public class Empleado {
	
	 
	private int horas;
    private int horasextra;
    private tipoEmpleado tipo = new tipoEmpleado();
	

	
	public void setHoras(int horas) {
		this.horas=horas;
			}
	public void setHorasextra(int horasextra) {
		this.horasextra=horasextra;
			}
	
	public void setTipo(String t, double h)
	 {tipo.setTipoEmpleado(t, h);}
	 
		 
	 public double calculoHoras() {
		if (tipo.getTipo().equals("Supervisor")) {
			
			return horas+horasextra*1.40;
		}
		
        if (tipo.getTipo().equals("Dependiente")) {
			
			return horas+horasextra*1.75;
		}
		
		return horas +horasextra*1.5;
		
		}
	
	public double getsueldo() {
		return tipo.getHorabase()*calculoHoras();
	}
	
	
}
