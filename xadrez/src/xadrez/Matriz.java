package xadrez;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int[][] tabuleiro = new int[8][8];
		int posicaoX_torre, posicaoY_torre;
		int total_derrotas = 0;

		Scanner input = new Scanner(System.in);
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					tabuleiro[i][j] = input.nextInt();
				}
			}
		
		posicaoX_torre = input.nextInt();
		posicaoY_torre = input.nextInt();
		for (int i = 0; i < 8; i++) {
			if (tabuleiro[posicaoX_torre][i] == 2) {
				total_derrotas++;
			}
			if (tabuleiro[i][posicaoY_torre] == 2) {
				total_derrotas++;
			}
		}
		total_derrotas -=2;
		System.out.println(total_derrotas);
	}
}