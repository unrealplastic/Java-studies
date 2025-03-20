package veiculos;

public class Transportes {

	public static void main(String[] args) {
		Carro c1 = new Carro("Toyota", "Corolla", 2020);
		Moto m1 = new Moto("Honda", "CBR 600", 2019);
		
		c1.setNumeroPortas(4);
		c1.abrirPortas();
		c1.acelerar();
		c1.ligar();
		c1.acelerar();
		c1.status();
		
		m1.setTemCarenagem(true);
		m1.ligar();
		m1.setVelociodade(28);
		m1.acelerar();
		m1.empinar();
		m1.status();

	}

}
