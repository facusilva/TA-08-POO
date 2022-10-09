
public class Electrodomestico {

	protected double precioBase;
	
	protected String color;
	
	protected char consumoEnergetico;
	
	protected double peso;
	
	private final double PRECIOBASE_DEF = 100.00;
	
	private final String COLOR_DEF = "blanco";
	
	private final char CONSUMOENERGETICO_DEF = 'F';
	
	private final double PESO_DEF = 5.00;
	
	
	
	public Electrodomestico() {
		this.precioBase = PRECIOBASE_DEF;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMOENERGETICO_DEF;
		this.peso = PESO_DEF;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMOENERGETICO_DEF;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumo(consumoEnergetico);
		this.peso = peso;
	}

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
