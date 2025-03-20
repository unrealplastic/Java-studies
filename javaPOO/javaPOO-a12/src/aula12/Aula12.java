package aula12;

public class Aula12 {

	public static void main(String[] args) {
		/*Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(35.3f);
		m.setCorPelo("marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println("-------------------------------------");
		r.setPeso(2);
		r.setCorEscama("verde");
		r.alimentar();
		r.locomover();
		r.emitirSom();
		System.out.println("-------------------------------------");
		p.setPeso(0.35f);
		p.setCorEscama("laranja");
		p.alimentar();
		p.locomover();
		p.emitirSom();
		System.out.println("-------------------------------------");
		a.setPeso(2);
		a.setCorPena("branco");
		a.alimentar();
		a.locomover();
		a.emitirSom();
		System.out.println("-------------------------------------");*/
		
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		Dourado dourado = new Dourado();
		Arara arara = new Arara();
		
		canguru.classe();
		canguru.setPeso(35);
		canguru.setIdade(5);
		canguru.setMembros(4);
		System.out.println(canguru.toString());
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();
		canguru.usarBolsa();
		System.out.println("-------------------------------------");
		cachorro.classe();
		cachorro.setPeso(10);
		cachorro.setIdade(2);
		cachorro.setMembros(4);
		System.out.println(cachorro.toString());
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.buscarBolinha();
		System.out.println("-------------------------------------");
		cobra.classe();
		cobra.setPeso(1.5f);
		cobra.setIdade(3);
		cobra.setMembros(0);
		System.out.println(cobra.toString());
		cobra.locomover();
		cobra.alimentar();
		cobra.emitirSom();
		cobra.darBote();
		System.out.println("-------------------------------------");
		tartaruga.classe();
		tartaruga.setPeso(8);
		tartaruga.setIdade(20);
		tartaruga.setMembros(4);
		System.out.println(tartaruga.toString());
		tartaruga.locomover();
		tartaruga.alimentar();
		tartaruga.emitirSom();
		System.out.println("-------------------------------------");
		dourado.classe();
		dourado.setPeso(0.35f);
		dourado.setIdade(1);
		dourado.setMembros(0);
		System.out.println(dourado.toString());
		dourado.locomover();
		dourado.alimentar();
		dourado.emitirSom();
		System.out.println("-------------------------------------");
		arara.classe();
		arara.setPeso(2.5f);
		arara.setIdade(9);
		arara.setMembros(2);
		System.out.println(arara.toString());
		arara.locomover();
		arara.alimentar();
		arara.emitirSom();
		arara.bicar();
		arara.repetir();
	}

}
