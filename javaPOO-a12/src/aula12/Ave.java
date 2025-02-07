package aula12;

public class Ave extends Animal{

	private String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	public void fazerNinho() {
		System.out.println("Está fazendo ninho");
	}
	
	@Override
	public void locomover() {
		System.out.println("Está voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Está comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
		
	}

}
