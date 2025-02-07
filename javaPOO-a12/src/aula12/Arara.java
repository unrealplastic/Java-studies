package aula12;

public class Arara extends Ave{
	
	public void bicar() {
		System.out.println("Está bicando");
	}
	
	public void repetir() {
		System.out.println("Repetiu o que você falou");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Arara! Arara!");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Está comendo semente");
	}

}
