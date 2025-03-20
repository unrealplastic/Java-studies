package veiculos;

public class Moto extends Veiculos{

	public Moto(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}

	private boolean temCarenagem;
	private float velociodade;
	
	public void empinar() {
		if(this.velociodade >=25 && this.velociodade<=30) {
			System.out.println("A moto está empinando");
		} else if (this.velociodade < 25) {
			System.out.println("A velocidade está muito baixa");
		} else if (this.velociodade > 30) {
			System.out.println("A velocidade está muito alta");
		}		
		
	}

	public boolean getTemCarenagem() {
		return temCarenagem;
	}

	public void setTemCarenagem(boolean embreagem) {
		this.temCarenagem = embreagem;
	}

	public float getVelociodade() {
		return velociodade;
	}

	public void setVelociodade(float velociodade) {
		this.velociodade = velociodade;
	}
	
	
	

}
