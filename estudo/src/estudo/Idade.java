package estudo;
import java.util.Scanner;


public class Idade {

	public static void main(String[] args) {
			int ano,mes,dia,idade;
			Scanner input = new Scanner(System.in);   
		    try {                                      
		    	ano = input.nextInt();
		    	mes = input.nextInt();
		    	dia = input.nextInt();

		    } finally {                               
		        input.close();                         
		    }
		    		
		   

			idade=ano*365+mes*30+dia;
			System.out.println(idade);

		}
}