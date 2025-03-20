package aula11;

public class Aula11 {

	public static void main(String[] args) {
		
		
		Visitante v1 = new Visitante();
		v1.setNome("João");
		v1.setIdade(22);
		v1.setSexo("masculino");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setIdade(16);
		a1.setSexo("Masculino");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(11112);
		b1.setNome("Mariana");
		b1.pagarMensalidade();
		b1.setSexo("feminino");
		b1.setBolsa(12.5f);
		System.out.println(b1.toString());
		
		Professor p1 = new Professor();
		p1.setNome("Sônia");
		p1.setIdade(52);
		p1.setSexo("feminino");
		p1.setSalario(5000f);
		p1.receberAumento(200);
		System.out.println(p1.toString());
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Marcos");
		t1.setIdade(15);
		t1.setSexo("masculino");
		t1.praticar();
		System.out.println(t1.toString());
		
		
		
	}

}
