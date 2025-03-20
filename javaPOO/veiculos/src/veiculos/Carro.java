package veiculos;

public class Carro extends Veiculos{
	
	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	private int numeroPortas;
	private boolean portaAberta;
	
	public void abrirPortas() {
		if(this.getPortaAberta()) {
			System.out.println("Impossível abrir as portas porque já estão abertas.");
		} else {
			System.out.println("As portas foram abertas");
		}
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public boolean getPortaAberta() {
		return portaAberta;
	}

	public void setPortaAberta(boolean portaAberta) {
		this.portaAberta = portaAberta;
	}
	
	
	
	

}
