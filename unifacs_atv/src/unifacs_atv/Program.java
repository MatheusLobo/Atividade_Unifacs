package unifacs_atv;

import java.util.Scanner;


import java.util.ArrayList;

public class Program {
 public static void main(String[] args) {
	 Biblioteca.addlivro(new Livro("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", "1960", 281));
	 System.out.println("Bem vindo a Biblioteca Java 2023 Unifacs");
	 System.out.println("");
	 Scanner SCAN = new Scanner(System.in);
	 
	 while (true) {
		 System.out.println("Escolha uma opçao");
		  System.out.println("1- Registrar Livro");
          System.out.println("2- Listar Livros");
          System.out.println("3- Buscar Livro");
          System.out.println("4- Sair");
          int opcao = SCAN.nextInt();
          	if (opcao == 1) {
          		
          	}
          	if (opcao == 2) {
          		
          	}
          	if (opcao == 3) {
          		
          	}
          	if (opcao == 4) {
          		break;
          	}
		 
		 
		 
	 }
}
}

