package gpt_facul;

import java.util.Scanner;

public class Soma  {
    public static int ADICAO(int a, int b) {
        return a + b;
    }


	public static void main(String[] args) {
		int a,b;
		int soma;
		Scanner input = new Scanner(System.in);
		System.out.println("Qual valores somar");
		a= input.nextInt();
		b= input.nextInt();
		soma=ADICAO(a,b);
		
		System.out.println(soma);
	}
}
