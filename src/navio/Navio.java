package navio;

public class Navio {
	
	private boolean horizontal;
	public int[] posicaoInicial = new int[2];
	public int[] posicaoMeio = new int[2];
	public int[] posicaoFinal = new int[2];
	
	public Navio() {
		posicaoInicial[0] = 0;
		posicaoInicial[1] = 0;
		posicaoMeio[0] = 0;
		posicaoMeio[1] = 0;
		posicaoFinal[0] = 0;
		posicaoFinal[1] = 0;
	}
	
	public void getPosicaoNavio() {
		int posicao = (int) (Math.random() * 1);
		if (posicao == 1) {
			horizontal = true;
		} else {
			horizontal = false;
		}
		
		int coluna = (int) (Math.random() * 6);
		int linha = (int) (Math.random() * 6);
		
		if (horizontal) {
			this.posicaoInicial[0] = coluna;
			this.posicaoInicial[1] = linha;
			this.posicaoMeio[1] = linha;
			this.posicaoFinal[1] = linha;
			if (this.posicaoInicial[0] + 2 <= 6) {
				this.posicaoMeio[0] = coluna + 1;
				this.posicaoFinal[0] = coluna + 2;
			} else {
				this.posicaoMeio[0] = coluna - 1;
				this.posicaoFinal[0] = coluna - 2;
			}
		}else {
			this.posicaoInicial[0] = coluna;
			this.posicaoMeio[0] = coluna;
			this.posicaoFinal[0] = coluna;
			this.posicaoInicial[1] = linha;
			if (this.posicaoInicial[1] + 2 <= 6) {
				this.posicaoMeio[1] = linha + 1;
				this.posicaoFinal[1] = linha + 2;
			} else {
				this.posicaoMeio[1] = linha - 1;
				this.posicaoFinal[1] = linha - 2;
			}
		}
	}	

	public int[] getPosicaoInicial() {
		return posicaoInicial;
	}

	public int[] getPosicaoMeio() {
		return posicaoMeio;
	}

	public int[] getPosicaoFinal() {
		return posicaoFinal;
	}
	
	

}
