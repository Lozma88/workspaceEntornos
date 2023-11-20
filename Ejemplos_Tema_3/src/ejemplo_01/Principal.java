package ejemplo_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		int edad;
		double notaMedia;
		//declaramos un objeto de la clase Alumno 
		Alumno al1;
		
		//instancianos un objeto con valores 
		
		System.out.println("Indique el nombre ");
		nombre= Leer.dato();
		System.out.println("Indique la edad ");
		edad=Leer.datoInt();
		System.out.println("Indique la nota media ");
		notaMedia=Leer.datoDouble();
		
		System.out.println("***************************************************************************************************");
		 al1 = new Alumno(nombre,edad,notaMedia);
		 al1.mostrarDatos("Condes de Bustillo");
		
		
		
		
		
		

	}

}
