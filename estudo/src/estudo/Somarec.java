package estudo;

import java.util.Scanner;

public class Somarec {	
		public static void main(String[] args) {
			int a,b;
			int i=0;
			b=0;
			Scanner input = new Scanner(System.in);   
			    try {
			    while(i!=15) {
			    i++;
				   a = input.nextInt();
				   b=b+a;
			    }		       
			    } finally {                               
			        input.close();                         
			    }

			System.out.println(b);
		}
}
