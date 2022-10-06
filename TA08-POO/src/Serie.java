
public class Serie {

	private String titulo;
	
	private int temporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;
	
	final int TEMPORADAS_DEF = 3;
	
	final boolean ENTREGADO_DEF = false;
	
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
}
