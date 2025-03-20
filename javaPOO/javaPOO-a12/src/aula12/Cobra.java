package aula12;

public class Cobra extends Reptil{
	
	public void darBote() {
		System.out.println("Está dando bote");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Está comendo a presa");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("SSSsssssss");
	}

}
