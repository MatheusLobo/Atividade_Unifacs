package biblioteca_Unifacs_A3;

import java.util.ArrayList;

public class Biblioteca {
     ArrayList<Cadastro_Usuario> usuariosCadastrados;
     ArrayList<Livro> livrosCadastrados;
     ArrayList<Emprestimo> emprestimos;
     ArrayList<Devolucao> devolucoes;

    public Biblioteca() {
        this.usuariosCadastrados = new ArrayList<>();
        this.livrosCadastrados = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.devolucoes = new ArrayList<>();
    }

    // Métodos para manipular usuários
    public void cadastrarUsuario(Cadastro_Usuario usuario) {
        usuariosCadastrados.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void excluirUsuario(Cadastro_Usuario usuario) {
        usuariosCadastrados.remove(usuario);
        System.out.println("Usuário excluído com sucesso!");
    }

    public Cadastro_Usuario buscarUsuario(String nome) {
        for (Cadastro_Usuario usuario : usuariosCadastrados) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    // Métodos para manipular livros
    public void cadastrarLivro(Livro livro) {
        livrosCadastrados.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void excluirLivro(Livro livro) {
        livrosCadastrados.remove(livro);
        System.out.println("Livro excluído com sucesso!");
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livrosCadastrados) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    // Métodos para manipular empréstimos
    public void realizarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo realizado com sucesso!");
    }

    public void devolverLivro(Emprestimo emprestimo, Livro livro, Cadastro_Usuario usuario, String dataDevolucao) {
        Devolucao devolucao = new Devolucao(livro, usuario, emprestimo.getDataEmprestimo(), dataDevolucao);
        devolucoes.add(devolucao);
        emprestimos.remove(emprestimo);
        System.out.println("Devolução registrada com sucesso!");
    }

    // Métodos para relatórios
    public void imprimirLivrosEmprestados() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Livro emprestado: " + emprestimo.getLivro().getTitulo());
            System.out.println("Usuário que pegou emprestado: " + emprestimo.getUsuarioEmprestimo().getNome());
            System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println();
        }
    }

    public void imprimirLivrosAtrasados() {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.estaAtrasado()) {
                System.out.println("Livro emprestado: " + emprestimo.getLivro().getTitulo());
                System.out.println("Usuário que pegou emprestado: " + emprestimo.getUsuarioEmprestimo().getNome());
                System.out.println("Data do empréstimo: " + emprestimo.getDataEmprestimo());
                System.out.println("Data prevista para devolução: " + emprestimo.getDataDevolucaoPrevista());
                System.out.println("Dias em atraso: " + emprestimo.getDiasAtraso());
                System.out.println();
            }
        }
    }}