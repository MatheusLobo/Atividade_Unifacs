package estudo;
import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {
			float saldo;

			Scanner input = new Scanner(System.in);   
		    try {                                      
		        saldo = input.nextFloat();

		    } finally {                               
		        input.close();                         
		    }
		    	saldo=(float)(saldo+saldo*0.01);

			System.out.println(saldo);

		}
		}

