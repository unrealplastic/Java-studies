package veiculos;

public class Veiculos {

	private String marca;
	private String modelo;
	private int ano;
	private boolean ligado;
	
	public Veiculos(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void ligar() {
		this.setLigado(true);
	}
	
	public void desligar() {
		this.setLigado(false);
	}

	public void acelerar() {
		if (this.getLigado()) {
			System.out.println("O veículo está acelerando.");
		} else {
			System.out.println("Primeiro ligue o veículo");
		}
	}
	
	public void frear() {
		if (this.getLigado()) {
			System.out.println("O veículo freou.");
		} else {
			System.out.println("Primeiro ligue o veículo");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}
	

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean andando) {
		this.ligado = andando;
	}

	public void status() {
		System.out.println("----------------------------------");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Ano:" + this.getAno());
		System.out.println("Ligado:" + this.getLigado());
		System.out.println("----------------------------------");
	}
	

}
