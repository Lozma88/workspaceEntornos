package ejemplo_02;

public class Alumno {

	private String nombre;
	private double notaProg;
	private double notaBD;
	
	
	public Alumno(String nombre, double notaProg, double notaBD) {
		super();
		this.nombre = nombre;
		this.notaProg = notaProg;
		this.notaBD = notaBD;
	}
	
	public double calcularMedia() {
		
		double media;
		double divisor=2.0;
		
		media=(notaProg+notaBD)/divisor;
		
		return media;
			
	}
	
	public void mostrarDatos(double media) {
		
		System.out.printf("La media de %s es de: %.2f.\n",nombre,media);
	}
	
	
}
