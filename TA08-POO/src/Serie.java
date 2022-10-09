
public class Serie {

	//defino los atributos de la clase
	private String titulo;
	
	private int temporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;
	
	//defino los valores por defecto
	final int TEMPORADAS_DEF = 3;
	
	final boolean ENTREGADO_DEF = false;
	
	//constructor por defecto
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = "";
	}
	
	//constructor que recibe título y creador, los demás datos serán los por defecto
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = creador;
	}
	
	//constructor que recibe todos los datos de la película
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.creador = creador;
	}

	//GETTERS Y SETTERS
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
