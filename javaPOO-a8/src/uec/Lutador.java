package uec;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public void apresentar() {
		System.out.print("Apresentamos o lutador " + this.getNome());
		System.out.println(" vindo diretamente de " + this.getNacionalidade() + "!");
		System.out.print("Com " + this.getIdade() + " anos, ");
		System.out.print(this.getAltura() + "m de altura, ");
		System.out.print("pesando " + this.getPeso() + " KG, ");
		System.out.print("ele já ganhou " + this.getVitorias() + " vezes, ");
		System.out.print("perdeu " + this.getDerrotas() + " vezes ");
		System.out.println("e empatou " + this.getEmpates() + " vezes");
		System.out.println("------------------------------------------------------------");
	}
	
	public void status() {
		System.out.print(this.getNome());
		System.out.println(" é um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println( this.getEmpates() + " empates");
		System.out.println("------------------------------------------------------------");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) { //métodos construtores NÃO tem definição de retorno
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso (peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria() { //vira um método interno, então não recebe nenhum parâmetro
		if (this.peso<52.2) {
			this.categoria = "inválida";
		} else if (this.peso<=70.3) {
			this.categoria = "leve";
		} else if (this.peso<=83.9) {
			this.categoria = "médio";
		} else if (this.peso<=120.9) {
			this.categoria = "pesado";
		} else {
			this.categoria = "inválida";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}

	
	
	
	
	
	
}
