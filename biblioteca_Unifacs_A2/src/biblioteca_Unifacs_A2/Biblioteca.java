package biblioteca_Unifacs_A2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livrosCadastrados;
    ArrayList<Usuario> usuariosCadastrados;
    ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livrosCadastrados = new ArrayList<Livro>();
    }

    public void cadastrarLivro(Livro livro) {
        livrosCadastrados.add(livro);
        usuariosCadastrados = new ArrayList<Usuario>();
    }

    public void listarLivros() {

    System.out.println("Livros cadastrados:");
    System.out.printf("%-5s %-20s %-20s %-20s %-10s %s\n","ID", "Título", "Autor", "Editora", "Ano", "Páginas");
    for (Livro livro : livrosCadastrados) {
    System.out.printf("%-5d %-20s %-20s %-20s %-10s %d\n", livro.getNumero_do_livro(), livro.getTitulo(),
    					livro.getAutor(), livro.getEditora(), livro.getAnoPubli(), livro.getNumeroPaginas());
            }
        }
        
   

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livrosCadastrados) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
		return null;
    }

    public Livro buscarLivroPorNumero(int numero) {
    	for (Livro livro : livrosCadastrados) {
            if (livro.getNumero_do_livro()==(numero)) {
                return livro;
            }
        }
		return null;
    }
    public Livro buscarLivro(String atributo, String valor) {
		//System.out.println("Os Atributos são, titulo, autor, editora, ano_publi, numero_do_livro, numero_paginas");
		//System.out.println("Um exempleo caso queira o numero de paginas (Numero_paginas, 300)");
		for (Livro livro : livrosCadastrados) {
			if (atributo.equals("titulo") && livro.getTitulo().equals(valor)) {
				return livro;
			} else if (atributo.equals("autor") && livro.getAutor().equals(valor)) {
				return livro;
			} else if (atributo.equals("editora") && livro.getEditora().equals(valor)) {
				return livro;
			} else if (atributo.equals("ano_publi") && livro.getAnoPubli().equals(valor)) {
				return livro;
			} else if (atributo.equals("numero_do_livro") && Integer.toString(livro.getNumero_do_livro()).equals(valor)) {
				return livro;
			} else if (atributo.equals("numero_paginas") && Integer.toString(livro.getNumeroPaginas()).equals(valor)) {
				return livro;
			}
		}
		
		return null; // Caso nao encontre nenhum livro
	}
    public boolean emprestarLivro(String titulo, String nomeUsuario, LocalDate dataDevolucao) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro == null) {
            System.out.println("Livro não encontrado na biblioteca.");
            return false;
        }
        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponível para empréstimo.");
            return false;
        }
        Usuario usuario = buscarUsuarioPorNome(nomeUsuario);
        if (usuario == null) {
            System.out.println("Usuário não encontrado na biblioteca.");
            return false;
        }
        	Emprestimo emprestimo = new Emprestimo(livro, usuario, LocalDate.now(), dataDevolucao);
        	livro.setDisponivel(false);
        	usuario.addEmprestimo(emprestimo);
        	System.out.printf("Livro \"%s\" emprestado para o usuário \"%s\".\n", titulo, nomeUsuario);
        	return true;
    }
    public Usuario buscarUsuarioPorNome(String nomeUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nomeUsuario)) {
                return usuario;
            }
        }
        return null;
    }
    

	

}