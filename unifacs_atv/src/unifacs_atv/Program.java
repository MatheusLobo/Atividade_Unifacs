package unifacs_atv;

import java.util.Scanner;


import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
    	 Biblioteca biblioteca = new Biblioteca();
         biblioteca.addlivro(new Livro("Dom Casmurro", "Machado de Assis", "Garnier", "1899", 256));
         biblioteca.addlivro(new Livro("O Guarani", "José de Alencar", "B. L. Garnier", "1857", 368));
         biblioteca.addlivro(new Livro("Vidas Secas", "Graciliano Ramos", "José Olympio", "1938", 176));
         biblioteca.addlivro(new Livro("Capitães da Areia", "Jorge Amado", "Martins", "1937", 256));
         biblioteca.addlivro(new Livro("A Hora da Estrela", "Clarice Lispector", "Rocco", "1977", 88));
         biblioteca.addlivro(new Livro("O Quinze", "Rachel de Queiroz", "José Olympio", "1930", 160));
         biblioteca.addlivro(new Livro("Macunaíma", "Mário de Andrade", "Livros do Brasil", "1928", 192));

         System.out.println("Bem-vindo à Biblioteca Java 2023 Unifacs\n");

         Scanner read = new Scanner(System.in);

         while (true) {
             System.out.println("Escolha uma opção:");
             System.out.println("1 - Registrar Livro");
             System.out.println("2 - Listar Livros");
             System.out.println("3 - Buscar Livro");
             System.out.println("4 - Sair");

             int opcao = read.nextInt();

             if (opcao == 1) {
                 System.out.println("Digite o nome do livro:");
                 String titulo = read.next();
                 System.out.println("Digite o nome do Autor:");
                 String autor = read.next();
                 System.out.println("Digite o nome da Editora:");
                 String editora = read.next();
                 System.out.println("Digite o ano de Publicação:");
                 String ano_Publi = read.next();
                 System.out.println("Digite o número de páginas:");
                 int numero_paginas = read.nextInt();

                 Livro novoLivro = new Livro(titulo, autor, editora, ano_Publi, numero_paginas);
                 biblioteca.addlivro(novoLivro);
             } else if (opcao == 2) {
                 biblioteca.Listarlivros();
                 System.out.println(" ");
             } else if (opcao == 3) {
                 System.out.println("Digite o título:");
                 String titulo = read.next();
                 Livro livroEncontrado = biblioteca.Buscador(titulo);

                 if (livroEncontrado != null) {
                     System.out.println("\nLivro encontrado:");
                     System.out.println("Título: " + livroEncontrado.getTitulo());
                     System.out.println("Autor: " + livroEncontrado.getAutor());
                     System.out.println("Editora: " + livroEncontrado.getEditora());
                     System.out.println("Ano de Publicação: " + livroEncontrado.getAnoPubli());
                     System.out.println("Número de páginas: " + livroEncontrado.getNumeroPaginas());
                 } else {
                     System.out.println("\nLivro não encontrado.");
                 }
             } else if (opcao == 4) {
                 break;
             }
         }

         read.close();
     }
 }
    