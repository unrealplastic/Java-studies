package veiculos;

public class Caminhao extends Veiculos{

	public Caminhao(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	private float capacidadeCarga;
	
	public void carregar() {
		if(this.capacidadeCarga>this.getCapacidadeCarga()) {
			System.out.println("Capacidade máxima de carga atingida");
		} else {
			System.out.println("Carga sendo carregada.");
		}
	}

	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	

}
