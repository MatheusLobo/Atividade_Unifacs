package estudo;

import java.util.Scanner;

//import java.util.Scanner;

public class Ipis {

	public static void main(String[] args) {
			float porcip;
			float peça1,valor1,qnt1;
			float peça2,valor2,qnt2;
			float total;

			Scanner input = new Scanner(System.in);   
		    try {                                      
		    	porcip = input.nextFloat();
		    	peça1 = input.nextFloat();
		    	valor1 = input.nextFloat();
		    	qnt1 = input.nextFloat();
		    	peça2 = input.nextFloat();
		    	valor2 = input.nextFloat();
		    	qnt2 = input.nextFloat();
		    } finally {                               
		        input.close();                         
		    }
		    total=(valor1*qnt1+valor2*qnt2)*((porcip/100)+1);
			

			System.out.println(total);
		}
		}