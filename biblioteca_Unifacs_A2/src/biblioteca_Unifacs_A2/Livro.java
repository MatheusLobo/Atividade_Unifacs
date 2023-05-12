/**
 * 
 */
package biblioteca_Unifacs_A2;

/**
 * @author MatheusLobo
 *
 */

import java.util.ArrayList;

public class Livro {
	
	static ArrayList<Livro> livrosCadastrados = new ArrayList<Livro>();
	int numero_do_livro;
	String titulo;
	String autor;
	String editora;
	String ano_Publi;
	int Numero_paginas;
	boolean disponivel;
	ArrayList<Emprestimo> emprestimos;
	
	 public Livro(int numero_do_livro, String titulo, String autor, String editora, String anoPubli, int numeroPaginas) {
			this.numero_do_livro = numero_do_livro;
			this.titulo = titulo;
			this.autor = autor;
			this.editora = editora;
			this.ano_Publi = ano_Publi;
			this.Numero_paginas = Numero_paginas;
			this.disponivel = true;
	        this.emprestimos = new ArrayList<Emprestimo>();
		
	}
	 
	 public boolean isDisponivel() {
	        return disponivel;
	}
	 

	 
	 public void setDisponivel(boolean disponivel) {
	        this.disponivel = disponivel;
	}
	 
	public void cadastrarLivro(Livro Livro) {
		livrosCadastrados.add(Livro);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getNumero_do_livro() {
			return numero_do_livro;
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
	public String BuscaLivroGeral() {
	    return String.format("%-20s %-20s %-20s %-10s %d", this.titulo, this.autor, this.editora, this.ano_Publi, this.Numero_paginas);
	}
	
	
	
}
	