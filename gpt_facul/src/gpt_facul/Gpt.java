package gpt_facul;

import java.util.Scanner;

public class Gpt {

	public static void main(String[] args) {
	/*Escreva um programa que exibe todos os números de 1 a 100
 *  Para múltiplos de três, exiba "Fizz" em vez do número e para 
 *  múltiplos de cinco, exiba "Buzz". Para números que são 
 *  múltiplos de três e cinco, exiba "FizzBuzz".
			 /

		for (int i=1;i<=100;i++) {
	if (i%3==0 && i%5==0 ) {
		System.out.println("FizzBuzz");
	} else if (i%3==0) {
				System.out.println("Fizz");
			} else if (i%5==0) {
				System.out.println("Buzz");
		} else {
			System.out.println(i);
	}

}
		int[] num = new int[10];
		int aux=0;
		int j=0;
		Scanner input = new Scanner(System.in);
		
		for (int i=0;i<10;i++) {
			num[i] = input.nextInt();
			if (aux<num[i]) {
				aux=num[i];
				j=i;
			}
		}
		
		System.out.println("o maior numero foi "+ aux +" e estava na posic "+ (j));
		
}
	
		// Escreva um programa que lê uma matriz 4x4 e imprime a sua diagonal principal.
		
		int[][] a= new int[4][4];
		int i=0;
		int j=0;
		
		Scanner input= new Scanner(System.in);
			for(i=0;i<a.length;i++) {
				for(j=0;j<a.length;j++) {
					a[i][j] = input.nextInt();
				}
			}
			
			for (i=0;i< a.length;i++) {
				System.out.println(a[i][i]);
			}
		
		*/
		
		/* Escreva um programa que recebe uma matriz quadrada de tamanho N x N
		 *  (onde N é um número ímpar) e imprime a soma dos elementos da diagonal
		 *   principal e da diagonal secundária.
		 */
		
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Digite o valor da matriz impar n");
			n=input.nextInt();
			int[][] m = new int[n][n];
			int somap=0;
			int somas=0;
			
			int i=0;
			int j=0;
			 
			for (i=0;i<m.length;i++) {
				for(j=0;j<m.length;j++) {
					m[i][j]= input.nextInt();
					
				}
			}
		
		for(i = 0; i<n;i++) {
		somap=m[i][i]+somap;
		somas=m[n-i-1][i]+somas;
		
	}
		
	System.out.println(somap);
	System.out.println(somas);
		
		
		
		
		
		
		
		
		
		
		
		
	}}