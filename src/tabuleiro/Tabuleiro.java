package tabuleiro;

import java.util.ArrayList;
import java.util.List;

import navio.Navio;

public class Tabuleiro {
	
	public List<int[]> tabuleiro = new ArrayList<>();
	public List<int[]> tabuleiroAtaques = new ArrayList<>();
	public List<int[]> posicoesOcupadas = new ArrayList<>();
	public List<int[]> navio1 = new ArrayList<>();
	public List<int[]> navio2 = new ArrayList<>();
	public List<int[]> navio3 = new ArrayList<>();
	public boolean navioEliminado;
	public boolean navio2Eliminado;
	public boolean navio3Eliminado;
	
	public void posicionaNavio() {
		
		
		boolean posicaoOcupada = false;
		
		for (int i = 0; i <= 6; i++) {
			int[] linha = new int[7];
			tabuleiro.add(linha);
		}
		
		for (int i = 0; i <= 6; i++) {
			int[] linha = new int[7];
			tabuleiroAtaques.add(linha);
		}
		
		Navio n = new Navio();
		boolean navioPosicionado = false;
		
		while (!navioPosicionado) {
			n.getPosicaoNavio();
			
			int[] posicao1N = new int[3];
			posicao1N[0] = n.getPosicaoInicial()[0];
			posicao1N[1] = n.getPosicaoInicial()[1];
			posicoesOcupadas.add(posicao1N);
			
			int[] posicao2N = new int[3];
			posicao2N[0] = n.getPosicaoMeio()[0];
			posicao2N[1] = n.getPosicaoMeio()[1];
			posicaoOcupada = posicoesOcupadas.contains(posicao2N);
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao2N);
				}
			
			
			int[] posicao3N = new int[3];
			posicao3N[0] = n.getPosicaoFinal()[0];
			posicao3N[1] = n.getPosicaoFinal()[1];
			posicaoOcupada = posicoesOcupadas.contains(posicao3N);
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao3N);
			}
			
			if (posicoesOcupadas.contains(posicao1N) && 
					posicoesOcupadas.contains(posicao2N) && 
					posicoesOcupadas.contains(posicao3N)) {
				navioPosicionado = true;
			}
			
			tabuleiro.get(n.getPosicaoInicial()[0])[n.getPosicaoInicial()[1]] = 1;
			tabuleiro.get(n.getPosicaoMeio()[0])[n.getPosicaoMeio()[1]] = 1;
			tabuleiro.get(n.getPosicaoFinal()[0])[n.getPosicaoFinal()[1]] = 1;
			
			navio1.add(posicao1N);
			navio1.add(posicao2N);
			navio1.add(posicao3N);
			
			//imprimeTabuleiro();
		
		}
		
		//System.out.println("Navio 1 posicionado");
		
		Navio n2 = new Navio();
		n2.getPosicaoNavio();
		
		
		boolean navio2Posicionado = false;
		
		while (!navio2Posicionado) {
			n2.getPosicaoNavio();
			
			int[] posicao1N2 = new int[3];
			posicao1N2[0] = n.getPosicaoInicial()[0];
			posicao1N2[1] = n.getPosicaoInicial()[1];
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao1N2);
			}
			
			int[] posicao2N2 = new int[3];
			posicao2N2[0] = n.getPosicaoMeio()[0];
			posicao2N2[1] = n.getPosicaoMeio()[1];
			posicaoOcupada = posicoesOcupadas.contains(posicao2N2);
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao2N2);
			}
			
			int[] posicao3N2 = new int[3];
			posicao3N2[0] = n.getPosicaoFinal()[0];
			posicao3N2[1] = n.getPosicaoFinal()[1];
			posicaoOcupada = posicoesOcupadas.contains(posicao3N2);
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao3N2);
			}
			
			if (posicoesOcupadas.contains(posicao1N2) && 
					posicoesOcupadas.contains(posicao2N2) && 
					posicoesOcupadas.contains(posicao3N2)) {
				navio2Posicionado = true;
			}
			
			tabuleiro.get(n2.getPosicaoInicial()[0])[n2.getPosicaoInicial()[1]] = 1;
			tabuleiro.get(n2.getPosicaoMeio()[0])[n2.getPosicaoMeio()[1]] = 1;
			tabuleiro.get(n2.getPosicaoFinal()[0])[n2.getPosicaoFinal()[1]] = 1;
			
			navio2.add(posicao1N2);
			navio2.add(posicao2N2);
			navio2.add(posicao3N2);
			
			//imprimeTabuleiro();
		
		}
		
		//System.out.println("Navio 2 posicionado");
		
		
		
		Navio n3 = new Navio();
		
		boolean navio3Posicionado = false;
		
		while (!navio3Posicionado) {
			n3.getPosicaoNavio();
			
			int[] posicao1N3 = new int[3];
			posicao1N3[0] = n.getPosicaoInicial()[0];
			posicao1N3[1] = n.getPosicaoInicial()[1];
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao1N3);
			}
			int[] posicao2N3 = new int[3];
			posicao2N3[0] = n.getPosicaoMeio()[0];
			posicao2N3[1] = n.getPosicaoMeio()[1];
			posicaoOcupada = posicoesOcupadas.contains(posicao2N3);
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao2N3);
			}
			
			int[] posicao3N3 = new int[3];
			posicao3N3[0] = n.getPosicaoFinal()[0];
			posicao3N3[1] = n.getPosicaoFinal()[1];
			posicaoOcupada = posicoesOcupadas.contains(posicao3N3);
			if (!posicaoOcupada) {
				posicoesOcupadas.add(posicao3N3);
			}
			
			if (posicoesOcupadas.contains(posicao1N3) && 
					posicoesOcupadas.contains(posicao2N3) && 
					posicoesOcupadas.contains(posicao3N3)) {
				navio3Posicionado = true;
			}
			
			tabuleiro.get(n3.getPosicaoInicial()[0])[n3.getPosicaoInicial()[1]] = 1;
			tabuleiro.get(n3.getPosicaoMeio()[0])[n3.getPosicaoMeio()[1]] = 1;
			tabuleiro.get(n3.getPosicaoFinal()[0])[n3.getPosicaoFinal()[1]] = 1;
			
			navio3.add(posicao1N3);
			navio3.add(posicao2N3);
			navio3.add(posicao3N3);
			
			//imprimeTabuleiro();
		
		}
		
		if (tabuleiro.get(n.getPosicaoInicial()[0])[n.getPosicaoInicial()[1]] == 2 &&
				tabuleiro.get(n.getPosicaoMeio()[0])[n.getPosicaoMeio()[1]] == 2 &&
				tabuleiro.get(n.getPosicaoFinal()[0])[n.getPosicaoFinal()[1]] == 2) {
			navio2Eliminado = true;
		} else if (tabuleiro.get(n2.getPosicaoInicial()[0])[n2.getPosicaoInicial()[1]] == 2 &&
				tabuleiro.get(n2.getPosicaoMeio()[0])[n2.getPosicaoMeio()[1]] == 2 &&
				tabuleiro.get(n2.getPosicaoFinal()[0])[n2.getPosicaoFinal()[1]] == 2) {
			navio2Eliminado = true;
		} else if (tabuleiro.get(n3.getPosicaoInicial()[0])[n3.getPosicaoInicial()[1]] == 2 &&
				tabuleiro.get(n3.getPosicaoMeio()[0])[n3.getPosicaoMeio()[1]] == 2 &&
				tabuleiro.get(n3.getPosicaoFinal()[0])[n3.getPosicaoFinal()[1]] == 2) {
			navio3Eliminado = true;
		}
		
		//System.out.println("Navio 3 posicionado");
		
	}
	
	public void imprimeTabuleiro() {
		
		int j = 1;
		System.out.println("  1 2 3 4 5 6 7");
		for (int[] is : tabuleiro) {
			j++;
			String colunas = (char) (j + 95) + " ";
			System.out.print(colunas.toUpperCase());
			for (int i = 0; i <= 6; i++) {
				System.out.print(is[i] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean naviosEliminados() {
		if (navioEliminado && navio2Eliminado && navio3Eliminado) {
			return true;
		} 
		return false;
	}
}
