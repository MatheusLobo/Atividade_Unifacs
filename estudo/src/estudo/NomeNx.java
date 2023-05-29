package estudo;

import java.util.Scanner;

public class NomeNx {	
		public static void main(String[] args) {
			String nome;
			int i=0;
			int n;
			Scanner input = new Scanner(System.in);   
			    try {                                      
				   nome = input.next();
				   n = input.nextInt();
			    } finally {                               
			        input.close();                         
			    }
			while (i!=n) {
				i++;
				System.out.println(nome);
			}
		}
}
