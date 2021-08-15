package view;
import controller.tempoGastoVetor;

public class Principal {
	
	public static void main(String[] args) {
		
		//declara posições
		double[] vetor1000 = new double[1000]; 
		double[] vetor10000 = new double[10000];
		double[] vetor100000 = new double[100000]; 

		//atribui posições para calculo do controler
		tempoGastoVetor op = new tempoGastoVetor();
		op.calculaTempo(vetor1000);
		op.calculaTempo(vetor10000);
		op.calculaTempo(vetor100000);
	}

}
