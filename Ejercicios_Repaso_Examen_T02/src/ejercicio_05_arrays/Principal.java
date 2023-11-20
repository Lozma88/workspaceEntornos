package ejercicio_05_arrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear un programa que realice lo siguiente:
			•
			Solicitar al usuario que introduzca por teclado el tamaño del array.
			•
			Declarar y definir el array de enteros.
			•
			Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			•
			Mostrar por pantalla la suma de todos los elementos.
			•
			Mostrar el mayor y el menor guardados en el array.
			•
			Modificar un valor elegido por el usuario.*/
		
		int tam,op=0,hasta,desde, suma=0,mayor=0,menor=0,pos=0,num=0;
		
		int [] numeros;
		
		Random rnd = new Random (System.nanoTime());
		
		System.out.println("*******************************************************************************************************************************");
		System.out.println("                                 Bienvenido al programa para control de arrays");
		System.out.println("*******************************************************************************************************************************");
		
		System.out.println("Por favor, indique el tamaño del array");
		tam=Leer.datoInt();
		
		while(tam<=0) {
			System.out.println("Por favor, indique un valor mayor que cero");
			tam=Leer.datoInt();
		}
		
		numeros= new int [tam];
		do {
			
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			System.out.println("                     0. Para salir.");
			System.out.println("                     1. Para rellenar el array.");
			System.out.println("                     2. Para mostrar la suma de todos los elementos.");
			System.out.println("                     3. Para mostrar el mayor.");
			System.out.println("                     4. Para mostrar el menor.");
			System.out.println("                     5. Para modificar un valor.");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			op=Leer.datoInt();
			switch(op) {
			
				case 1:
					System.out.println("Desde qué número empezamos a rellenar");
					desde=Leer.datoInt();
					
					System.out.println("Hasta qué número rellenamos");
					hasta=Leer.datoInt();
					
					for (int i = 0; i < numeros.length; i++) {
						
						numeros[i]=rnd.nextInt(hasta-desde+1)+desde;
					}
					
					for (int i = 0; i < numeros.length; i++) {
				
						System.out.print(" "+numeros[i]+"\t\t");
					
					}
					System.out.println();
					break;
					
				case 2:
					for (int i = 0; i < numeros.length; i++) {
						
						suma+=numeros[i];
						
					}
					
					System.out.println("La suma de todos los elementos es:"+suma);
					break;
					
				case 3:
					
					for (int i = 0; i < numeros.length; i++) {
						
						if(i==0) {
							mayor=numeros[i];	
						}
						
						if(numeros[i]>mayor) {
							
							mayor=numeros[i];
						}
					
					}
					
					System.out.println("El número mayor es: "+mayor);
					break;
					
				case 4:
					for (int i = 0; i < numeros.length; i++) {
						
						if (i==0) {
							menor=numeros[i];
						}
						
						if(numeros[i]<menor) {
							
							menor=numeros[i];	
						}
					}
					
					System.out.println("El número menor es: "+menor);
					break;
					
				case 5:
					System.out.println("Indique por favor cuál es la posición que desea modificar");
					pos=Leer.datoInt()-1;
					
					System.out.println("Indique por favor, cuál es el nuevo número que desea introducir");
					num=Leer.datoInt();
					
					num=numeros[pos];
					
					for (int i = 0; i < numeros.length; i++) {
						
						System.out.print(" "+numeros[i]+"\t\t");
						
						}
					System.out.println();
					
					break;
					
				case 0:
					
					System.out.println("Saliendo.............");
					
					break;
					
				default:
					
					System.out.println("Opción no válida, por favor marque una opción válida");
					break;
				
			}
			
			
		}while(op!=0);
	}

}
