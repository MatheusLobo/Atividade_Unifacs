package estudo;
import java.util.Scanner;

public class Dividirnumeros {


	public static void main(String[] args) {
		int divi,a,b;

		Scanner input = new Scanner(System.in);   
	    try {                                      
	        a = input.nextInt();
	        b = input.nextInt();
	    } finally {                               
	        input.close();                         
	    }
	    divi=a/b;
	    System.out.println(divi);
	}
	}


