package ejercicio_05_bis;


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
		
		int op=0, tam=0, hasta=0,desde=0,suma=0,mayor=0,menor=0, pos=0,num=0, numCeros=0;
		
		double media=0;
		
		int [] aleatorios;
		
		Random rnd = new Random (System.nanoTime());
		
		
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("            Bienvenido al programa degestión de arrays");
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println("Por favor indique el tamaño del array");
		tam=Leer.datoInt();
		
		while(tam<=0) {
			
			System.out.println("Por favor indique un número mayor que 0");
			tam=Leer.datoInt();
			
		}
		
		aleatorios=new int[tam];
		
		do {
			
		
		
		System.out.println("**********************************************************************************");
		System.out.println("    0. Para Salir.   ");
		System.out.println("    1. Para rellenar el array.");
		System.out.println("    2. Para mostrar la suma.");
		System.out.println("    3. Para mostrar el mayor.");
		System.out.println("    4. Para mostrar el menor.");
		System.out.println("    5. Para modificar un valor.");
		System.out.println("    6. Para contar el número de 0.");
		System.out.println("    7. Para hacer la media de los numeros");
		System.out.println("**********************************************************************************");
		op=Leer.datoInt();
		
		switch(op) {
			case 1:  
				
				System.out.println("Por favor indique en qué número empezamos a contar");
				desde=Leer.datoInt();
				System.out.println("Por favor indique hasta qué número contamos");
				hasta=Leer.datoInt();
				
				for (int i = 0; i < aleatorios.length; i++) {
					
					aleatorios[i]=rnd.nextInt(hasta-desde+1)+desde;
					
				}
				
				for (int i = 0; i < aleatorios.length; i++) {
					
					System.out.print("  "+aleatorios[i]+"\t\t");
					
				}
				System.out.println();
				System.out.println("**********************************************************************************");
				System.out.println();
				break;
				
			case 2:
				
				for (int i = 0; i < aleatorios.length; i++) {
					
					suma+=aleatorios[i];
				}
				
				System.out.println("La suma de los elementos es: "+suma);
				
				System.out.println();
				System.out.println("**********************************************************************************");
				System.out.println();
				
				break;
				
			case 3:
				
				for (int i = 0; i < aleatorios.length; i++) {
					
					if(i==0) {
						mayor=aleatorios [i];
					}
					
					if(aleatorios[i]>mayor) {
						
						mayor=aleatorios[i];
						
					}
					
				}
				
				System.out.println("El mayor número es: "+mayor);
				System.out.println();
				System.out.println("**********************************************************************************");
				System.out.println();
				
				break;
				
			case 4:
				
				for (int i = 0; i < aleatorios.length; i++) {
					
					if(i==0) {
						menor=aleatorios [i];
					}
					
					if(aleatorios[i]<menor) {
						
						menor=aleatorios[i];
						
					}
					
				}
				
				System.out.println("El menor número número es: "+menor);
				System.out.println();
				System.out.println("**********************************************************************************");
				System.out.println();
				
				break;
			
			case 5:
				
				System.out.println("Indique por favor la posición a modificar");
				pos=Leer.datoInt()-1;
				System.out.println("Indique por favor el valor nuevo");
				num=Leer.datoInt();
				
				aleatorios[pos]=num;
				
				for (int i = 0; i < aleatorios.length; i++) {
					
					System.out.print("  "+aleatorios[i]+"\t\t");
					
				}
				
				System.out.println();
				System.out.println("**********************************************************************************");
				System.out.println();
				
				break;
				
			case 6:
				
				for (int i = 0; i < aleatorios.length; i++) {
					
					if(aleatorios[i]==0) {
						
						numCeros++;
						
					}
					
				}
				
				System.out.println("El número de ceros es de: "+numCeros);
				System.out.println();
				System.out.println("**********************************************************************************");
				System.out.println();
				
				break;
			
			case 7:
				
				media=(double)suma/aleatorios.length;
				
				System.out.printf("La media de los elementos es de %.2f ",media);
				System.out.println();
				System.out.println("**********************************************************************************");
				System.out.println();
				break;
				
			case 0:
				System.out.println("Saliendo.......");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		
		}while (op!=0);
		
		
		System.out.println("Gracias por usar el programa");
		

	}
	
		

}
