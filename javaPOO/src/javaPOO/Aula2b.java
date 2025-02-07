package javaPOO;

public class Aula2b {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		
		c2.cor = "preta";
		c2.modelo = "Bic";
		c2.tampar();
		c2.status();
		c2.rabiscar();
	}

}
