package aula12;

public class Cachorro extends Mamifero{
	
	public void buscarBolinha() {
		System.out.println("Está buscando bolinha");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Está comendo ração");
	}
	
	@Override
	public void locomover() {
		System.out.println("Está andando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AU! AU! AU!");
	}

}
