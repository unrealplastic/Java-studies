package javaPOO;

public class Caneta {

		public String modelo;
		public String cor;
		private float ponta;
		protected int carga; //se não definir a visibilidade, ela vai ser automaticamente definida como "publica para pacote"
		private boolean tampada;
		
		
		public void rabiscar() {
			if(this.tampada == true) {
				System.out.println("ERRO! Destampe a caneta");
			} else {
				System.out.println("Estou rabiscando!");
			}
		}
		
		public void tampar() {
			this.tampada = true;
		}
		
		public void destampar() {
			this.tampada = false;
		}
		
		public void status() {
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Ponta: " + this.ponta);
			System.out.println("Uma caneta " + this.cor);
			System.out.println("Carga: " + this.carga);
			System.out.println("está tampada? " + this.tampada);
		}
		
		
	}


