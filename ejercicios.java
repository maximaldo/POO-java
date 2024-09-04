package ejercicios1;
import java.util.Scanner;



public class ejercicios {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Elegi el ejercicio con un numero del 1 al 5");
		 int eleccion = scanner.nextInt();
	        switch(eleccion) {
	        case 1:
		        NumeroPar numeroPar = new NumeroPar();
		        numeroPar.imprimirNumeros();
	        	break;
	        case 2:
		        primo siesprimo = new primo();
		        siesprimo.numerosPrimos();
	        	break;
	        case 3:
	        	pedirnums nombre = new pedirnums();
		        nombre.pedir();
	        	break;
	        case 4:
	        	break;
	        case 5:
	        	break;
	        
	        }
		 
		 
		 scanner.close();
	}
}

class NumeroPar {
    public void imprimirNumeros() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par.");
            } else {
                System.out.println(i + " no es par.");
            }
        }
    }
}

class primo{
	public void numerosPrimos() {
		for(int i = 50; i < 100; i++) {
			int esprimo = 0;
			for(int j = 2; j < i; j++ ) {
				if(i % j == 0) {
					esprimo++;
				}
			}
			if(esprimo == 0) {
				System.out.println(i + "es numero primo");
			}else {
				System.out.println(i + "no es numero primo");
			}
			
		}
		
	}
}

class pedirnums{
	public void pedir() {
	Scanner scannerfortnite = new Scanner(System.in);
	 int pedir = 0;
	 int primo = 0;
	 do {
		 System.out.println("Escribi un numero mayor a 100 y primo. Si escribis 0 salis del programa");
	 pedir = scannerfortnite.nextInt();
	  if(pedir >= 100) {
		  primo = 0;
		  for(int i = 2; i < pedir; i++) {
			  if(pedir % i == 0) primo++;
		  }
		  if(primo == 0) {
			  System.out.println("El numero " + pedir + " es mayor a 100 y primo");
			  break;
		  }else {
			  System.out.println("El numero " + pedir + " es mayor a 100 pero no es primo");
		  }
		  
	  } else {
		  System.out.println("No es mayor a 100 asi que no es valido");
	  }
	 }while(pedir != 0);
	 scannerfortnite.close();
	}
}

class calculadora{
	public void calcular(){
		System.out.println("Escriba la operacion que desea realizar entre:\n+\n-\n/\n*");
		 Scanner scanner = new Scanner(System.in);
		 int operacion = scanner.next().charAt(0);
		 switch(operacion) {
	     	 case '+':
	     		 break;
	     	 case '-':
	     		 break;
	         case '/':
	     		 break;
	       	 case '*':
	     		 break;
		 }
		 
		
	}
	
}
