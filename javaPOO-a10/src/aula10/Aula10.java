package aula10;

public class Aula10 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fatima");
		
		p1.setSexo("masculino");
		p2.setSexo("feminino");
		p3.setSexo("masculino");
		p4.setSexo("feminino");
		
		p2.setCurso("informatica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
