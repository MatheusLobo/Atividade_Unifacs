package estudo;

import java.util.Scanner;

public class Salminimo {

	public static void main(String[] args) {
			float salario;
			float salarios_min=(float) 788.00;

			Scanner input = new Scanner(System.in);   
		    try {                                      
		    	salario = input.nextFloat();
		    } finally {                               
		        input.close();                         
		    }
		    salario=salario/salarios_min;
		    
			
			
			System.out.println(salario);
		}
		}