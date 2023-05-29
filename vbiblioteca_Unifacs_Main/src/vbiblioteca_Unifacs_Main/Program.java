package vbiblioteca_Unifacs_Main;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Bem Vindo a Biblioteca A-Z");
		System.out.println("Temos inumeros livros disponiveis");
		System.out.println("Gostaria de alugar algum?");
		System.out.println(" Digite 1 para se cadastrar o usuario ou 2 caso o usuario ja esteja cadastrado");
		int x=0;
		Scanner scn=new Scanner(System.in);
		x=scn.nextInt();
		
		switch (x) {
		case 1: {
			
		;	 
		break;}
		case 2: {
			
			 
			break;}
		
		
		default:
			throw new IllegalArgumentException("Digite 1 ou 2, vc digitou: " + x);
		}
		
		
		
	}
}
