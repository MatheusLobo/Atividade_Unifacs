package unifacs_atv;

import java.util.Scanner;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void addlivro(Livro livro) {
        livros.add(livro);
    }

    public void Listarlivros() {
        System.out.println("\nLivros Registrados:");
        System.out.printf("%-25s %-25s %-25s %-25s %-25s\n",
                "Titulo", "Autor", "Editora", "Ano de Publicação", "Numero de paginas");
        for (Livro livro : livros) {
            System.out.printf("%-25s %-25s %-25s %-25s %d\n",
                    livro.getTitulo(), livro.getAutor(), livro.getEditora(),
                    livro.getAnoPubli(), livro.getNumeroPaginas());
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