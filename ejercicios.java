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
	        	break;
	        case 4:
	        	break;
	        case 5:
	        	break;
	        
	        }
	        NumeroPar numeroPar = new NumeroPar();
	        numeroPar.imprimirNumeros();
		 
		 
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
				System.out.println(i + "no es numero primo");
			}else {
				System.out.println(i + "es numero primo");
			}
			
		}
		
	}
}
