package ejercicio_18_bucles;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo, 
         * retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos necesarios y
         *  se realizarán las operaciones . El coste de las entradas se debe restar al saldo de dicha cuenta. 
         *  La cuenta será creada por nosotros con un saldo inicial concreto.
         *  
         */
        
        int op=0,op1=0,numEntradas=0;
        double saldo=2500.00,cantRetirada=0.00,pEntradasVip=10.30,pEntradasPalco=8.30,pEntradasButacas=6.30, pEntradasTotal=0.00,cantIngresada=0.00;
        
        do {
            
            System.out.println("****************************************************************************************************************************");
            System.out.println("                                      Bienvenido al banco ''Qué Ruina''");
            System.out.println("****************************************************************************************************************************");
            
            System.out.println();
            
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                        0. Para salir     ");
            System.out.println("                        1. Para ver saldo.");
            System.out.println("                        2. Para retirar dinero.");
            System.out.println("                        3. Para comprar entradas.");
            System.out.println("                        4. Para ingresar dinero.");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
            
            System.out.println("");
            
            op=Leer.datoInt();
        
        switch(op) {
            
            case 1:
                
                System.out.printf("El saldo de su cuenta es de %.2f €\n ",saldo);
                System.out.println("");
                
                break;
                
            case 2:
                
                System.out.println("Por favor, indique la cantidad a retirar");
                
                cantRetirada=Leer.datoDouble();
                
                if(cantRetirada>saldo) {
                    
                    System.out.println("Lo sentimos, está usted tieso");
                }
                
                else {
                    
                    saldo=saldo-cantRetirada;
                }
                
                System.out.printf("El saldo de su cuenta es de %.2f €\n",saldo);
                System.out.println("");
                
                break;
                
                case 3:
                    
                    System.out.println("Indique el número de entradas que quiere");
                    numEntradas=Leer.datoInt();
                    
                    do {
                        System.out.println("  0.Para salir");
                        System.out.println("  1.Para entradas VIP");
                        System.out.println("  2.Para entradas Palco");
                        System.out.println("  3.Para entradas Patio Butacas");
                        op1=Leer.datoInt();
                        
                        switch(op1) {
                            
                            case 1:
                                pEntradasTotal=numEntradas*pEntradasVip;
                                if(pEntradasTotal>saldo) {
                                    
                                    System.out.println("Lo sentimos, está usted tieso");
                                    
                                }
                                
                                else {
                                    
                                    saldo=saldo-pEntradasTotal;
                                    
                                    System.out.printf("Va a pagar %.2f € \n",pEntradasTotal);
                                    System.out.printf("El saldo de su cuenta es de %.2f €\n",saldo);
                                    System.out.println("");
                                    
                                }
                                break;
                                
                            case 2:
                                pEntradasTotal=numEntradas*pEntradasPalco;
                                if(pEntradasTotal>saldo) {
                                    
                                    System.out.println("Lo sentimos, está usted tieso");
                                    
                                }
                                
                                else {
                                    
                                    saldo=saldo-pEntradasTotal;
                                    System.out.printf("Va a pagar %.2f € \n",pEntradasTotal);
                                    System.out.printf("El saldo de su cuenta es de %.2f €\n",saldo);
                                    System.out.println("");
                                    
                                }
                                break;
                                
                            case 3:
                                
                                pEntradasTotal=numEntradas*pEntradasButacas;
                                if(pEntradasTotal>saldo) {
                                    
                                    System.out.println("Lo sentimos, está usted tieso");
                                    
                                }
                                
                                else {
                                    
                                    saldo=saldo-pEntradasTotal;
                                    System.out.printf("Va a pagar %.2f € \n",pEntradasTotal);
                                    System.out.printf("El saldo de su cuenta es de %.2f €\n",saldo);
                                    System.out.println("");
                                    
                                }
                                break;
                                
                                default:
                                    System.out.println("Lo siento opción no válida");
                                    break;
                                
                                case 0:
                                    
                                    System.out.println("Saliendo.......");
                                
                        }
                    }while(op1!=0);
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Indiquepor favor, la cantidad que desea ingresar");
                    cantIngresada=Leer.datoDouble();
                    
                    saldo=saldo+cantIngresada;
                    
                    System.out.printf("El saldo de su cuenta es de %.2f €\n",saldo);
                    System.out.println("");
                    
                    break;
                    
                case 0:
                    
                    System.out.println("Saliendo.......");
                    
                    break;
                    
                default:
                    System.out.println("Lo sentimos opción no válida");
                    break;
                
                
        }
            
        }while(op!=0);
        
        System.out.println("");
        System.out.println("*************************************************************************************************************************");
        System.out.println("                                     Gracias por utilizar nuestro banco");
        System.out.println("*************************************************************************************************************************");


	}

}
