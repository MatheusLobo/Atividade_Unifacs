package estudo;

import java.util.Scanner;

public class Somaidade20 {	
		public static void main(String[] args) {
			int a,b;
			int maior=0;
			int i=0;
			b=0;
			Scanner input = new Scanner(System.in);   
			    try {
			    while(i!=20) {
			    i++;
				   a = input.nextInt();
				   b=b+a;
				   if (a>=18)
					   maior++;
			    }		       
			    } finally {                               
			        input.close();                         
			    }

			System.out.println(b);
			System.out.println(b/20);
			System.out.println(maior);
		}
}
