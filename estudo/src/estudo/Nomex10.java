package estudo;

import java.util.Scanner;

public class Nomex10 {	
		public static void main(String[] args) {
			String nome;
			int i=0;
			Scanner input = new Scanner(System.in);   
			    try {                                      
				   nome = input.next();
			       
			    } finally {                               
			        input.close();                         
			    }
			while (i!=10) {
				i++;
				System.out.println(nome);
			}
		}
}
