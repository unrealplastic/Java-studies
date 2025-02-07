package aula6;

public class ControleRemoto implements Controler{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Metodos Especiais
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
	
	private int getVolume() {
		return volume;
	}
	
	private void setVolume (int volume) {
		this.volume = volume;
	}
	
	private boolean getLigado() {
		return ligado;
	}
	
	private void setLigado (boolean ligado) {
		this.ligado = ligado;
	}
	
	private boolean getTocando() {
		return tocando;
	}
	
	private void setTocando (boolean tocando) {
		this.tocando = tocando;
	}

	
	
	//Métodos abstratos
	@Override
	public void ligar() {	
		this.setLigado(true);
		this.setTocando(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		this.setTocando(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("-----MENU-----");
		System.out.println(getLigado());
		System.out.println(getTocando());
		System.out.println(getVolume());
		for(int i = 0; i<=this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("\nFechando menu...");
		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+1);
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()-1);
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume()>0) {
			this.setVolume(0);
		}
			
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume()==0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if(this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if(this.getLigado() && !this.getTocando()) {
			this.setTocando(false);
		}
	}
}
