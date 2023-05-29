package estudo;

import java.io.IOException;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        int[] notas = {100,50,20,10,5,2,1};    // Declaração do array de notas
        int[] quantidade = new int[7];         // Declaração do array de quantidades de notas
        int valor;                             // Declaração da variável que armazenará o valor informado pelo usuário
        int i;                                 // Declaração da variável de controle do loop

        Scanner input = new Scanner(System.in);    // Declaração de um objeto Scanner para receber a entrada do usuário
        try {                                      // Início do bloco try-catch para capturar exceções
            valor = input.nextInt();               // Recebe um valor inteiro como entrada do usuário e armazena na variável "valor"
        } finally {                                // Bloco finally para garantir que o objeto Scanner seja fechado
            input.close();                         // Fecha o objeto Scanner
        }
        
        System.out.println(valor);  // Imprime o valor informado pelo usuário na tela

        // Loop para calcular a quantidade de cada nota necessária
        for (i = 0; i < notas.length; i++) {
            quantidade[i] = valor / notas[i];    // Calcula a quantidade de notas de cada valor necessário e armazena no array "quantidade"
            valor %= notas[i];                    // Atualiza o valor para o resto da divisão
        }

        // Loop para imprimir a quantidade de notas necessárias
        for (i = 0; i < notas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidade[i], notas[i]);    // Imprime a quantidade de notas de cada valor necessária para representar o valor informado pelo usuário
        }
    }
}