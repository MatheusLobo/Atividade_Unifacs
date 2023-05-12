package pootraining;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();

        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, cpf, idade);

        sc.nextLine(); // para limpar o buffer

        System.out.println("Digite a cor do carro:");
        String cor = sc.nextLine();

        System.out.println("Digite a placa do carro:");
        String placa = sc.nextLine();

        Carro carro = new Carro(cor, placa);

        System.out.println("Digite o número da vaga:");
        int numeroVaga = sc.nextInt();

        Vaga vaga = new Vaga();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Placa do carro: " + carro.getPlaca());
        System.out.println("Número da vaga: " + vaga.setNumero());

        sc.close();
    }
}