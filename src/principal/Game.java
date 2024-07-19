package principal;

import java.util.Scanner;

import tabuleiro.Tabuleiro;

public class Game {
	
	static int tentativas = 0;
	public int partesAcertadas;
	
	public void iniciaTabuleiro() {
		
		Scanner sc = new Scanner(System.in);
		
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.posicionaNavio();
		//tabuleiro.imprimeTabuleiro();
		
		boolean fim = false;
		
		String escolha = "";
		
		System.out.print("""
				
				******************* Batalha Naval *******************
				
				Escolha uma posição para atacar no padrão (ColunaLinha):
				
				Colunas: A - G
				Linhas: 1 - 7
			""");
		
		while (!fim) {
			
			System.out.println();
			tabuleiro.imprimeTabuleiro();
			boolean tamanhoValido = false;
			boolean posicaoValida = false;
			while (!tamanhoValido || !posicaoValida) {
				System.out.print("\nEscolha a posicao para atacar: ");
				escolha = sc.next();
				if (escolha.length() == 2) {
					tamanhoValido = true;
					if (escolha.toLowerCase().charAt(0) - 97 <= 7 && escolha.charAt(1) - 48 <= 7) {
						posicaoValida = true;
					} else {
						System.out.println("\nPosição de jogada inválida, fora do tabuleiro!");
					}
				} else {
					System.out.println("\nPosicao invalida (Coluna + Linha)");
				}
			}
			
			int[] posicaoAtaque = new int[2];	
			
			posicaoAtaque[0] = (int) escolha.toLowerCase().charAt(0) - 97;
			posicaoAtaque[1] = (int) escolha.charAt(1) - 49;
			
			
			if ( tabuleiro.tabuleiro.get(posicaoAtaque[0])[posicaoAtaque[1]] == 1) {
				System.out.println("\nVoce acertou uma parte do navio!");
				tabuleiro.tabuleiro.get(posicaoAtaque[0])[posicaoAtaque[1]] = 2;
				tabuleiro.tabuleiroAtaques.get(posicaoAtaque[0])[posicaoAtaque[1]] = 8;
				tentativas++;
				partesAcertadas++;
			} else if (tabuleiro.tabuleiro.get(posicaoAtaque[0])[posicaoAtaque[1]] == 0) {
				System.out.println("\nAcertou a agua!");
				tabuleiro.tabuleiroAtaques.get(posicaoAtaque[0])[posicaoAtaque[1]] = 1;
				tentativas++;
			} else if (tabuleiro.tabuleiro.get(posicaoAtaque[0])[posicaoAtaque[1]] == 2) {
				System.out.println("\nVoce ja atacou esta posição!");
			}
			
			if (tabuleiro.navioEliminado) {
				System.out.println("Navio 1 eliminado");
			} else if (tabuleiro.navio2Eliminado) {
				System.out.println("Navio 2 eliminado");
			} else if (tabuleiro.navio3Eliminado) {
				System.out.println("Navio 3 eliminado");
			}
			
			if (tabuleiro.naviosEliminados()) {
				System.out.println("\nVoce afundou os navios inimigo!"
								+ "\nForam necessárias " + Game.tentativas + " bombas para afundar o navio inimigo!");
				fim = true;		
				}
		}
		sc.close();
	}
}
