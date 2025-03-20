package aula12;

public class Peixe extends Animal{
	
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public void fazerBolhas() {
		System.out.println("Está fazendo bolhas");
	}

	@Override
	public void locomover() {
		System.out.println("Está nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Está comendo substâncias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
		
	}

}
