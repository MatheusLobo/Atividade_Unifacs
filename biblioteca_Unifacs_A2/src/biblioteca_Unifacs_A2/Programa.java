package biblioteca_Unifacs_A2;
import java.time.LocalDate;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        // Aqui você pode criar um menu para o usuário escolher as opções,
        // por exemplo, cadastrar um livro, listar livros, emprestar livro, etc.
        System.out.println("Bem-vindo(a) à Biblioteca da Unifacs!");

        // Verifica se o usuário é cadastrado
        System.out.println("Você é cadastrado na biblioteca? Digite 'sim' ou 'nao':");
        String respostaCadastro = input.nextLine();
        Usuario usuario;
        if (respostaCadastro.equalsIgnoreCase("nao")) {
            System.out.println("Você precisa se cadastrar para ter acesso aos livros da biblioteca.");
            System.out.println("Por favor, preencha o formulário abaixo:");
            System.out.print("Nome completo: ");
            String nome = input.nextLine();
            System.out.print("Matrícula: ");
            String matricula = input.nextLine();
            usuario = new Usuario(nome, matricula);
        } else {
            System.out.print("Digite sua matrícula: ");
            String matricula = input.nextLine();
            usuario = biblioteca.buscarUsuarioPorNome(matricula);
            if (usuario == null) {
                System.out.println("Usuário não encontrado na biblioteca.");
                return;
            }
        }

        // Lista os livros cadastrados
        biblioteca.listarLivros();
        System.out.println("Escolha um livro para empréstimo (digite o número do livro): ");
        int numeroLivro = input.nextInt();
        Livro livro = biblioteca.buscarLivroPorNumero(numeroLivro);
        if (livro == null) {
            System.out.println("Livro não encontrado na biblioteca.");
            return;
        }
        System.out.print("Digite a data de devolução (no formato aaaa-mm-dd): ");
        LocalDate dataDevolucao = LocalDate.parse(input.next());
        if (biblioteca.emprestarLivro(livro.getTitulo(), usuario.getNome(), dataDevolucao)) {
            System.out.printf("Empréstimo do livro \"%s\" efetuado com sucesso.\n", livro.getTitulo());
        } else {
            System.out.println("Não foi possível efetuar o empréstimo.");
        }
    }
}
