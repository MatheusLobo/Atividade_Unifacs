package prova;

import java.util.Scanner;

public class Questao2 {

	 public static void main(String[] args) {
		 int linhas,colunas,valor;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Digite o numero de linhas da matriz");
	        linhas= scan.nextInt();
	        System.out.println("Digite o numero de colunas da matriz");
	        colunas= scan.nextInt();
	        int[][] matriz = new int[linhas][colunas];
	        System.out.println("Informe os elementos da matriz ");
	        for (int i=0;i<linhas;i++) {
	        	for (int j=0;j<colunas;j++) {
	        		matriz[i][j]=scan.nextInt();
	        	}
	        }
	        
	        System.out.println("Informe o valor a ser pesquisado ");
	        valor= scan.nextInt();
	         for (int i=0;i<matriz.length;i++)  {
	        	 for (int j=0; j<matriz[0].length;j++) {
	        		if (matriz[i][j]==valor) {
	        			System.out.println("Posicao "+i+","+j+":");
	        			 if (i > 0) {
	                         System.out.println("Acima: " + matriz[i - 1][j]);
	                     }
	                     if (j > 0) {
	                         System.out.println("Esquerda: " + matriz[i][j - 1]);
	                     }
	                     if (i < linhas - 1) {
	                         System.out.println("Abaixo: " + matriz[i + 1][j]);
	                     }
	                     if (j < colunas - 1) {
	                         System.out.println("Direita: " + matriz[i][j + 1]);
	        			}
	        		}
	        		
	        	}
	        }
	        
	        
	        
	        
	        
	        
	        
	    }
	}

