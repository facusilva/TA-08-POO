
public class Persona {

	//defino los atributos de la clase
	private String nombre;
	
	private int edad;
	
	private String DNI;
	
	private char sexo;
	
	private double peso;
	
	private double altura;
	
	//constructor con valores por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0.00;
		this.altura = 0.00;
		
	}
	
	//constructor que recibe por parámetros nombre, edad y sexo, peso y altura tendrán sus valores por defecto
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0.00;
		this.altura = 0.00;
	}
	
	//constructor que recibe todos los datos de la persona
	public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//GETTERS Y SETTERS
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
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
