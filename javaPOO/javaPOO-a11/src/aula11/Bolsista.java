package aula11;

public class Bolsista extends Aluno{

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}
	
	public void pagarMensalidade() { //diferente do pagar mensalidade para um aluno, apesar de ser o mesmo metodo (polimorfismo)
		System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
