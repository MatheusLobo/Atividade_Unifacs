package unifacs_atv;

import java.util.ArrayList;

public class Biblioteca{
	static ArrayList<Livro> livros;
	public Biblioteca() {
		livros = new ArrayList<Livro>();
    }
	 public static void addlivro(Livro Livro) {
		 livros.add(Livro);
	    }
	
	 public void Listarlivros() {
	        System.out.println("/nLivros Registrados:");
	        System.out.printf("%-25s %-25s %-25s %-25%s\n","Titulo", "Autor", "Editora", "Ano de Publicação", "Numero de paginas");
	        for (Livro Livro : livros) {
	            System.out.printf("%-25s %-25s %-25s %-25s %d\n",
	            		Livro.getTitulo(), Livro.getAutor(), Livro.getEditora(), Livro.getAnoPubli(), Livro.getNumeroPaginas() );
	        }
	    }
	
	 public Livro Buscador(String titulo) {
	        for (Livro livro : livros) {
	            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
	                return livro;
	            }
	        }
	        return null;
	    }
	}


