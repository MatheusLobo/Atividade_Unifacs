package biblioteca_Unifacs_A3;
import java.util.ArrayList;

public class Livro {
	
	ArrayList<Livro> livrosCadastrados = new ArrayList<Livro>();
	int livro;
	String titulo;
	String autor;
	String editora;
	String ano_Publi;
	int Numero_paginas;
		
	
	public Livro(int livro, String titulo, String autor, String editora, String ano_Publi,int Numero_paginas) {
			this.livro = livro;
			this.titulo = titulo;
			this.autor = autor;
			this.editora = editora;
			this.ano_Publi = ano_Publi;
			this.Numero_paginas = Numero_paginas;	
		
	}
	public void cadastrarLivro(Livro Livro) {
		livrosCadastrados.add(Livro);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getLivro() {
			return livro;
	}
	public String getAutor() {
		return autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public String getAnoPubli() {
		return ano_Publi;
	}
	
	public int getNumeroPaginas() {
		return Numero_paginas;
	}
	
	
	
	
}
	
	
	

