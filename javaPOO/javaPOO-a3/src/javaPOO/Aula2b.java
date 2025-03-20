package javaPOO;

public class Aula2b {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.modelo = "BIC cristal";
		c1.cor = "azul";
		// c1.ponta = 0.5f;  a própria IDE já mostra que é privada
		c1.carga = 90; //está dentro de uma classe que está usando a classe Caneta
		
		
		//c1.tampada = false;
		c1.destampar(); //mesmo se um atributo for privado, podemos usar um método para acessar ele
		
		
		c1.rabiscar();
		
		c1.status();

	}

}
