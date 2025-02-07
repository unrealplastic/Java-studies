package jogai;

public class Jogo{
	

	//Atributos
	private String nome;
	private String categoria;
	private String plataforma;
	private String objetivo;
	private float tempoTotal;
	private float tempoJogado;
	private float nota;
	private boolean iniciado;
	private boolean terminado;
	private boolean andamento;
	
	//Métodos
	
	
	public void statusJogo() {
		System.out.println("-----------------------------------------");
		System.out.println("Jogo adicionado: " + this.getNome());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Plataforma: " + this.getPlataforma());
		System.out.println("Objetivo: " + this.getObjetivo());;
		System.out.println("Tempo total do jogo: " + this.getTempoTotal());
		System.out.println("Tempo jogado: " + this.getTempoJogado());
		System.out.println("Nota: " + this.getNota());
		System.out.println("O jogo foi iniciado? " + this.getIniciado());
		System.out.println("O jogo foi finalizado? " + this.getTerminado());
		System.out.println("Você ainda está jogando esse jogo? " + this.getAndamento());
		System.out.println("-----------------------------------------");
	}
	
	public void removerJogo() {
		
		this.setNome(null);
		this.setCategoria(null);
		this.setPlataforma(null);
		this.setObjetivo(null);
		this.setTempoJogado(0);
		this.setTempoTotal(0);
		this.setNota(0);
		this.setIniciado(false);
		this.setAndamento(false);
		this.setTerminado(false);
		System.out.println("-----------------------------------------");
		System.out.println("O jogo foi removido com sucesso!");
		System.out.println("-----------------------------------------");
		
	}
	
	//Método Constutor
	
		public Jogo(String nome, String categoria, String plataforma, String objetivo, float tempoTotal, float tempoJogado, float nota, boolean iniciado, boolean terminado, boolean andamento) {
			this.nome = nome;
			this.categoria = categoria;
			this.plataforma = plataforma;
			this.objetivo = objetivo;
			this.tempoTotal = tempoTotal;
			this.tempoJogado = tempoJogado;
			this.nota = nota;
			this.iniciado = iniciado;
			this.terminado = terminado;
			this.andamento = andamento;
		}
		
	
	
	
	
	//Métodos Especiais
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public float getTempoTotal() {
		return tempoTotal;
	}
	
	public void setTempoTotal(float tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	public float getTempoJogado() {
		return tempoJogado;
	}
	
	public void setTempoJogado(float tempoJogado) {
		this.tempoJogado = tempoJogado;
	}
		
	public boolean getIniciado() {
		return iniciado;
	}
	
	public void setIniciado(boolean iniciado) {
		this.iniciado = iniciado;
	}
	
	public boolean getTerminado() {
		return terminado;
	}
	
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
	
	public boolean getAndamento() {
		return andamento;
	}
	
	public void setAndamento(boolean andamento) {
		this.andamento = andamento;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}
}
