package aula6; 

public interface Controler { //ao invés de criar uma classe, criamos uma interface
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
}
