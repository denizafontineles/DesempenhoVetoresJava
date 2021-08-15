package controller;

public class tempoGastoVetor {
	
	public tempoGastoVetor() {
		super();
	}
	
	public void calculaTempo(double[] tempoVetor) {
		
		// Pegar valor inicial
		double tempoInicial = System.nanoTime();
		
		//percorrer o vetor
		for (double posicaoVetor : tempoVetor) {
		}
		
		//NANO
		double tempoFinal = System.nanoTime();
		// calculo total
		double tempoTotal = tempoFinal - tempoInicial;
		
		// SEGUNDOS
		// para achar milisegundos dividir 10,9
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		// printa todas posições
		System.out.println("TEMPO TOTAL -> " + tempoTotal + " S");
	}
	
}
