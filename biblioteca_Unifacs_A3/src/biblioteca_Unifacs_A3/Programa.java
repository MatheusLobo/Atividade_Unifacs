package biblioteca_Unifacs_A3;

import java.util.Scanner;

import vbiblioteca_Unifacs_Main.Cadastro_Usuario;

public class Programa extends Biblioteca {

	/*public class Main {
	    public static void main(String[] args) {
	        Biblioteca biblioteca = new Biblioteca();

	        // cadastra alguns usuários
	        Cadastro_Usuario usuario1 = new Cadastro_Usuario("João da Silva", "123.456.789-00", "joao.silva@gmail.com", "Rua A, 123", "01/01/1980", "(71) 99999-0000");
	        biblioteca.cadastrarUsuario(usuario1);

	        Cadastro_Usuario usuario2 = new Cadastro_Usuario("Maria Souza", "987.654.321-00", "maria.souza@gmail.com", "Rua B, 456", "02/02/1990", "(71) 99999-1111");
	        biblioteca.cadastrarUsuario(usuario2);

	        Cadastro_Usuario usuario3 = new Cadastro_Usuario("Carlos Santos", "111.222.333-44", "carlos.santos@gmail.com", "Rua C, 789", "03/03/2000", "(71) 99999-2222");
	        biblioteca.cadastrarUsuario(usuario3);

	        // cadastra alguns livros
	        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Saraiva", "1997", 612);
	        biblioteca.cadastrarLivro(livro1);

	        Livro livro2 = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", "Saraiva", "1954", 1200);

	        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Saraiva", "1943", 10);
	        biblioteca.cadastrarLivro(livro3);

	        // realiza empréstimo de um livro
	        biblioteca.realizarEmprestimo(new Emprestimo(livro1, usuario1, "01/05/2023"));

	        // devolve o livro emprestado
	        biblioteca.devolverLivro(new Emprestimo(livro1, usuario1, "01/05/2023"), livro1, usuario1, "10/05/2023");

	        // imprime lista de livros emprestados
	        biblioteca.imprimirLivrosEmprestados();

	        // imprime lista de livros atrasados
	        biblioteca.imprimirLivrosAtrasados();
	    }
	}*/
	
	// Classe Cadastro_Usuario   public void cadastrarUsuario(Cadastro_Usuario usuario) {usuariosCadastrados.add(usuario);}
	
	public static void main(String[] args) {
		String cadastrado_S_N;
		boolean cadastrado = false;
		int i=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Bem Vindo a Biblioteca A-Z");
	    System.out.println("Temos inumeros livros disponiveis");
	    System.out.println("Gostaria de alugar algum?");
	    Cadastro_Usuario usuario = null;
	    System.out.println("Usuario ja cadastrado?(S/N)");
	    cadastrado_S_N=scn.toString();
	    if (cadastrado_S_N=="S"||"s") {
	    	cadastrado=true;
	    
	    
	    } else {cadastrado=false;
	    		System.out.println("Gostaria de cadastrar? (S/N)");
	    		cadastrado_S_N=scn.toString();
	    			if (cadastrado_S_N=="N") {
	    				break;
	    			}else {
	    		System.out.println("Digite o nome:");
        				String nome = scn.nextLine();
        		System.out.println("Digite o CPF:");
        				String cpf = scn.nextLine();
        		System.out.println("Digite o email:");
        				String email = scn.nextLine();
        		System.out.println("Digite o endereco:");
        				String endereco = scn.nextLine();
        		System.out.println("Digite a data de nascimento:");
        				String data_nasc = scn.nextLine();
        		System.out.println("Digite o telefone:");
        				String telefone = scn.nextLine();
        usuario = new Cadastro_Usuario(nome, cpf, email, endereco, data_nasc, telefone);
        cadastrado = true;
	    		
	    		
	    		}}
	    

	    while (i=0) {
	        System.out.println("Digite 2 para se cadastrar o usuario"); 
	        int x = scn.nextInt();
	        	scn.nextLine();
	        	
	        switch (x) {
	            case 2:
	                System.out.println("Digite o nome:");
	                String nome = scn.nextLine();
	                System.out.println("Digite o CPF:");
	                String cpf = scn.nextLine();
	                System.out.println("Digite o email:");
	                String email = scn.nextLine();
	                System.out.println("Digite o endereco:");
	                String endereco = scn.nextLine();
	                System.out.println("Digite a data de nascimento:");
	                String data_nasc = scn.nextLine();
	                System.out.println("Digite o telefone:");
	                String telefone = scn.nextLine();
	                usuario = new Cadastro_Usuario(nome, cpf, email, endereco, data_nasc, telefone);
	                cadastrado = true;
	                break; 
			 
		case 1: {
			
			 
			break;
		}
		
		
		}
		
		
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

		
		
		
	
