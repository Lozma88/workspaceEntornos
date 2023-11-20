package ejmplo_03;

public class Vehiculo {
	
	private String nombre;
	private double precio;
	private int numRuedas;
	
	//constructor
	public Vehiculo(String nombre, double precio, int numRuedas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.numRuedas = numRuedas;
	}

	//getters and setter, nos ayudan a obtener el valor de un atributo, y a cambiar el valor del atributo desde otra clase   
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", precio=" + precio + ", numRuedas=" + numRuedas + "]";
	}

	
	
	
	
	
	
	

}
