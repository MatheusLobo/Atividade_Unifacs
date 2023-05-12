package gpt_facul;

import java.util.Random;
import java.util.Scanner;

public class Aula2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos dados vao ser?");
		int nd;
		nd= input.nextInt();
		System.out.println("Quantos lados o quadrado vai ter?");
		int n;
		 n= input.nextInt();
		 int[] dados= new int[n];
		 for (int i=1;i<dados.length;i++) {
			 dados[i]=i;
	}
		 int j=1;
		 int ddd;
		 Random random = new Random();
		 while (nd>=j){
			 j++;
			 ddd= random.nextInt(n);
			 System.out.println("Dado de nº "+(j-1));
			System.out.println(dados[ddd]); 
		 }
}
}