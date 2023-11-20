package ejemplo_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumn1;
		double notaProg,notaBD,media;
		String nombre;
		
		
		System.out.println("Indique el nombre ");
		nombre= Leer.dato();
		
		System.out.println("Indique nota de programamción");
		notaProg=Leer.datoDouble();
		
		System.out.println("Indique nota de BBDD");
		
		notaBD=Leer.datoDouble();
		
		alumn1=new Alumno(nombre,notaProg,notaBD);
		
		media=alumn1.calcularMedia();
		
		alumn1.mostrarDatos(media);

	}

}
