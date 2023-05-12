package estudo;

import java.util.Scanner;

public class Nomeidade10 {	
		public static void main(String[] args) {
			String nome,nome_n = null;
			int idade,idade_n,b;
			int i=0;
			b=0;
			idade_n=200;
			Scanner input = new Scanner(System.in);   
			    try {
			    	while (i!=10) {
			    		i++;
			    		nome = input.next();
			    		idade = input.nextInt();
			    		if (idade<idade_n) {
			    			idade_n=idade;
			    			nome_n=nome;
			    		}
			    	}
			    } finally {                               
			        input.close();                         
			    }

			System.out.println(nome_n);
		}
}
