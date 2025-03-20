package aula13;

public class Cachorro extends Lobo{
	
	@Override
	public void emitirSom() {
		System.out.println("AU! AU! AU!");
	}
	
	public void reagir(String frase) {
		if(frase.equalsIgnoreCase("Olá")  || frase.equalsIgnoreCase("Vem comer")) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int minuto) {
		if(hora<12) {
			System.out.println("Abanar");
		} else if (hora>=18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e latir");
		}
	}
	
	public void reagir(int idade, float peso) {
		if (idade<5) {
			if (peso<10) {
				System.out.println("Abanar"); //se for novo e leve
			} else {
				System.out.println("Latir"); //se for novo e pesado
			}
		} else {
			if (peso<10) {
				System.out.println("Rosnar"); //se for velho e leve
			} else {
				System.out.println("Ignorar"); //se for velho e pesado
			}

		}
	}

}
