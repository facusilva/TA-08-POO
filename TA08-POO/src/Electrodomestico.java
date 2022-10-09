
public class Electrodomestico {

	//defino los atributos de la clase
	protected double precioBase;
	
	protected String color;
	
	protected char consumoEnergetico;
	
	protected double peso;
	
	//defino los valores por defecto
	private final double PRECIOBASE_DEF = 100.00;
	
	private final String COLOR_DEF = "blanco";
	
	private final char CONSUMOENERGETICO_DEF = 'F';
	
	private final double PESO_DEF = 5.00;
	
	
	//declaro el constructor con los valores por defecto
	public Electrodomestico() {
		this.precioBase = PRECIOBASE_DEF;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMOENERGETICO_DEF;
		this.peso = PESO_DEF;
	}
	
	//declaro el constructor que le lelgan preciobase y peso por parámetro y el resto de atributos serán por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMOENERGETICO_DEF;
		this.peso = peso;
	}
	
	//declaro el constructor donde le llegan todos los datos por parámetros
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumo(consumoEnergetico);
		this.peso = peso;
	}

	//GETTERS Y SETTERS
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//compruebo el color introducido por el usuario y devuelvo el valor correspondiente establecido por el enum
	public String comprobarColor(String color) {
		switch(color.toLowerCase()) {
		case "blanco":
			return Colores.BLANCO.color;
		case "negro":
			return Colores.NEGRO.color;
		case "rojo":
			return Colores.ROJO.color;
		case "azul":
			return Colores.AZUL.color;
		case "gris":
			return Colores.GRIS.color;
		default:
			return Colores.BLANCO.color;
		}
	}
	
	//compruebo el consumo introducido por el usuario y devuelvo el valor correspondiente establecido por el enum
	public char comprobarConsumo(char consumo) {
		switch(consumo) {
		case 'A':
			return Consumo.A.consumo;
		case 'B':
			return Consumo.B.consumo;
		case 'C':
			return Consumo.C.consumo;
		case 'D':
			return Consumo.D.consumo;
		case 'E':
			return Consumo.E.consumo;
		case 'F':
			return Consumo.F.consumo;
		default:
			return Consumo.F.consumo;
		}
	}
	
}
