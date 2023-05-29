package estudo;
import java.util.Scanner;

public class AntSuc {


	public static void main(String[] args) {
		int num1;

		Scanner input = new Scanner(System.in);   
	    try {                                      
	    	num1 = input.nextInt();
	    } finally {                               
	        input.close();                         
	    }

	    System.out.println(num1-1);
	    
	    System.out.println(num1+1);
	}
	}


