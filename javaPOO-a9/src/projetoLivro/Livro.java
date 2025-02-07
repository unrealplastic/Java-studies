package projetoLivro;


public class Livro implements Publicacao{

	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String detalhes() {
		return "Livro{" + "\ntitulo=" + titulo + "\nautor=" + autor + "\nTotalPaginas=" + totalPaginas + "\naberto=" + aberto + "\nPaginaAtual=" + paginaAtual + "\nleitor=" + leitor.getNome() + "\nidade=" + leitor.getIdade() + "\nsexo=" + leitor.getSexo() +"}";
	}
	
	public Livro (String titulo,String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.paginaAtual = 0;
		this.leitor = leitor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public void setTitulo(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public int getPaginaAtual() {
		return paginaAtual;
	}
	
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	
	public boolean getAberto() {
		return aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int pagina) {
		if(pagina>this.paginaAtual) {
			this.paginaAtual = 0;
		} else {
			this.paginaAtual = pagina;
		}
	}

	@Override
	public void avancarPagina() {
		this.paginaAtual++;
	}

	@Override
	public void voltarPagina() {
		this.paginaAtual--;
	}
}
