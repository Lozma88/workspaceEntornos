package ejmplo_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		Vehiculo veh1 = new Vehiculo("Amoto",1200.00,2);
		Vendedor vend1=new Vendedor("Luis",1200,2);
		double nPrecio;
		System.out.println(veh1);
		
		//System.out.println(nombre);
		
		//System.out.println(veh1.nombre);
		//Con el get se accede al valor del atributo 
		System.out.println(veh1.getNombre());
		
		//modificar el atributo
		
		System.out.printf("El precio es: %.2f \n",veh1.getPrecio());
		System.out.println("Indique el nuevo precio");
		nPrecio=Leer.datoDouble();
		veh1.setPrecio(nPrecio);
		
		System.out.printf("El nuevo precio es: %.2f \n",veh1.getPrecio());
		
		
		//no se pone vend1.tostring(); sólo se pone el nombre del objeto
		System.out.println(vend1);
		
		

	}

}
