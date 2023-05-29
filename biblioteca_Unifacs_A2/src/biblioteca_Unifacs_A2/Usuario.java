package biblioteca_Unifacs_A2;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String numeroIdentificacao;
    private ArrayList<Emprestimo> emprestimos;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.numeroIdentificacao = matricula;
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void addEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
    
    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }
}
