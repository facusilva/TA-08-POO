
public class Persona {

	private String nombre;
	
	private int edad;
	
	private String DNI;
	
	private Sexo sexo;
	
	private double peso;
	
	private double altura;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = Sexo.H;
		this.peso = 0.00;
		this.altura = 0.00;
		
	}
	
	public Persona(String nombre, int edad, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0.00;
		this.altura = 0.00;
	}
	
	public Persona(String nombre, int edad, String DNI, Sexo sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
