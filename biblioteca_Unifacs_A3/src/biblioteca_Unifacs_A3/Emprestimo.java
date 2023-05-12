package biblioteca_Unifacs_A3;

import java.util.ArrayList;

public class Emprestimo {
    ArrayList<Livro> livrosEmprestados = new ArrayList<Livro>();
    Cadastro_Usuario usuarioEmprestimo;
    String dataEmprestimo;
    String dataDevolucaoPrevista;

    public Emprestimo(ArrayList<Livro> livrosEmprestados, Cadastro_Usuario usuarioEmprestimo, String dataEmprestimo, String dataDevolucaoPrevista) {
        this.livrosEmprestados = livrosEmprestados;
        this.usuarioEmprestimo = usuarioEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public void registrarEmprestimo(ArrayList<Livro> livros, Cadastro_Usuario usuario, String dataEmprestimo, String dataDevolucaoPrevista) {
        this.livrosEmprestados = livros;
        this.usuarioEmprestimo = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public Cadastro_Usuario getUsuarioEmprestimo() {
        return usuarioEmprestimo;
    }

    public void setUsuarioEmprestimo(Cadastro_Usuario usuarioEmprestimo) {
        this.usuarioEmprestimo = usuarioEmprestimo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }


	}
}
