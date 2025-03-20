package aula11;



public class Aluno extends Pessoa{ //se uma classe for declarada como final, a classe bolsista não pode extende-la, porque classes finais não podem ter filhos

	private int matricula;
	private String curso;
	
	public void pagarMensalidade() { //se um metodo for delcarado como final, ele não pode ser utilizado na classe bolsista, porque metodos finais não podem ser sobrepostos
		System.out.println("Mensalidade do aluno " + this.nome + " foi paga");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
