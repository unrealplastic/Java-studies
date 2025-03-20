package aula11;

public class Professor extends Pessoa{

	private String especialidade;
	private float salario;
	
	public void receberAumento(float aumento) {
		this.salario += aumento;
		System.out.println("Professor(a) " + this.nome + " recebeu  um aumento de " + aumento);
		System.out.println("Salário atual: " + this.getSalario());
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	

}
