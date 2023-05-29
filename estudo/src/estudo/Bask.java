package estudo;

//import java.util.Scanner;

public class Bask {

	public static void main(String[] args) {
			float a=1;
			float b=5;
			float c=1;
			double bask1;
			double bask2;
			float delta;
			/*Scanner input = new Scanner(System.in);   
		    try {                                      
		    	salario = input.nextFloat();
		    } finally {                               
		        input.close();                         
		    }
		    salario=salario/salarios_min;*/
			delta=((b*b) - (4*a*c));
			bask1 = (-b + Math.sqrt(delta)) / (2*a);
			bask2 = (-b - Math.sqrt(delta)) / (2*a);
			
			
			System.out.println(bask1);
			System.out.println(bask2);
		}
		}