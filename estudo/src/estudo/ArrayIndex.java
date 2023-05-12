package estudo;

	import java.util.Scanner;

	public class ArrayIndex {
	    public static void main(String[] args) {
	        int[] t = {3, 5, 2, 8, 1, 7, 9};
	        int valor_procurado=1;
	        
	        for (int i=0;i>=t.length;i++) {
	        	if (valor_procurado==t[i]) {
	        		System.out.println("valor é "+valor_procurado);
	        		System.out.println("esta no index "+ i);
	        		
	        	}
	        }
	       
	        
	        
	    }
	    
	    
	}
	
	