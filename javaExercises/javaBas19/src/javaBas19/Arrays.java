package javaBas19;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double [] temperaturaDiaria  = new double [365];
		
		for(int i = 0; i<5; i++) {
			temperaturaDiaria[i] = ler.nextDouble();
		}

		for(int i = 0; i<temperaturaDiaria.length; i++) { //versão padrão do for
			System.out.println("Temperatura do dia " + (i+1) + " é " + temperaturaDiaria[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		for(double temperatura: temperaturaDiaria) { //versão onde abrigamos o array dentro de outra variável 
			System.out.println(temperatura); //acessa apenas o valor, mas não o indice
		}
		

	}

}
