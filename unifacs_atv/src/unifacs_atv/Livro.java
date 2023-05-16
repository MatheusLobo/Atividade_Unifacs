package unifacs_atv;

import java.util.Scanner;


public class Livro {
    String titulo;
    String autor;
    String editora;
    String ano_Publi;
    int numero_paginas;

    public Livro(String titulo, String autor, String editora, String ano_Publi, int numero_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano_Publi = ano_Publi;
        this.numero_paginas = numero_paginas;
    }

    public String getTitulo() {
        return titulo;
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
        return numero_paginas;
    }
}

