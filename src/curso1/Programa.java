package curso1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas para calcular a altura média: ");
		int n = sc.nextInt();
		System.out.println("Digite a altura de cada pessoa: ");
		double[] vetor = new double[n];
		
		for(int i=0;i<n;i++) {
			vetor[i]= sc.nextDouble();
		}

		double soma= 0.0;
		for(int i =0; i<n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		System.out.printf("Altura Média: %.2f%n", media);
		sc.close();
	}

}
