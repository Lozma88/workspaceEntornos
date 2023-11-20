package ejemploOperaciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=23, resultado1=0;
		int num2=2;
		
		double num3=6.85, num4=9.69, resultado2=0.0;
		
		System.out.println("************************************************************************************");
		System.out.println("               Bienvenido al primer ejemplo de operaciones              ");
		System.out.println("************************************************************************************");
		
		
		resultado1=num1*num2;
		
		System.out.println("El resultado de multiplicar " +num1+" y "+num2+"  es: "+resultado1);
		
		resultado2=num3*num4;
		
		System.out.println("");
		
		System.out.println("************************************************************************************");
		System.out.printf("El resultado de multiplicar %.2f y %.2f es: %.2f", num3,num4,resultado2);
		
		
		
	}

}
