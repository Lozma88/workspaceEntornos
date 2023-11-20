package ejemplo_01;

public class Alumno {
	
	//Atributos
	//En las clases que definen a los objetos no se les da valores iniciales a los atributos
	
	private String nombre;
	private int edad;
	private double notaMedia;
	
	
	//constructor
	//dentro de los paréntesis van los parámetros o argumentos
	public Alumno(String nombre, int edad, double notaMedia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
		
	}

	//creamos constructor sin notaMedia
	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//creamos constructor vacío 
	public Alumno() {
		super();
	}
	
	
	
	
	
	
	
	
	
	//Métodos
	//Primer método propio, para imprimir en bonito
	
	public void mostrarDatos(String calle) {
		
		//Cuerpo
		
		System.out.println("Los datos del alumno son:");
		System.out.println();
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota media: "+notaMedia);
		System.out.println("Dirección: "+calle);
		
	}
	
	/*calcularMedia
	insertarNota
	darAlta
	matricular
	medirAsistencia
	notificarFaltas*/
	
	

}
