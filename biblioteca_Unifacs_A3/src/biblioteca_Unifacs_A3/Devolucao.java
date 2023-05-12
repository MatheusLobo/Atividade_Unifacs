package biblioteca_Unifacs_A3;

import java.util.ArrayList;

public class Devolucao {
    ArrayList<Livro> livrosDevolvidos = new ArrayList<Livro>();
    ArrayList<Cadastro_Usuario> usuariosDevolucao = new ArrayList<Cadastro_Usuario>();
    String dataDevolucao;

    public Devolucao(ArrayList<Livro> livrosDevolvidos, ArrayList<Cadastro_Usuario> usuariosDevolucao, String dataDevolucao) {
        this.livrosDevolvidos = livrosDevolvidos;
        this.usuariosDevolucao = usuariosDevolucao;
        this.dataDevolucao = dataDevolucao;
    }

    public Devolucao(Livro livro, Cadastro_Usuario usuario, String dataEmprestimo, String dataDevolucao2) {
    	livrosDevolvidos.add(livro);
        usuariosDevolucao.add(usuario);
        dataDevolucao = dataDevolucao2;
	}



	public void registrarDevolucao(Livro livro, Cadastro_Usuario usuario, String data) {
        livrosDevolvidos.add(livro);
        usuariosDevolucao.add(usuario);
        dataDevolucao = data;
    }


    public ArrayList<Livro> getLivrosDevolvidos() {
        return livrosDevolvidos;
    }

    public void setLivrosDevolvidos(ArrayList<Livro> livrosDevolvidos) {
        this.livrosDevolvidos = livrosDevolvidos;
    }

    public ArrayList<Cadastro_Usuario> getUsuariosDevolucao() {
        return usuariosDevolucao;
    }

    public void setUsuariosDevolucao(ArrayList<Cadastro_Usuario> usuariosDevolucao) {
        this.usuariosDevolucao = usuariosDevolucao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}