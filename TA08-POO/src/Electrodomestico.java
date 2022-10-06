
public class Electrodomestico {

	protected double precioBase;
	
	protected Colores color;
	
	protected Consumo consumoEnergetico;
	
	protected double peso;
	
	private final double PRECIOBASE_DEF = 100.00;
	
	private final Colores COLOR_DEF = Colores.BLANCO;
	
	private final Consumo CONSUMOENERGETICO_DEF = Consumo.F;
	
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
	
	public Electrodomestico(double precioBase, Colores color, Consumo consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(Consumo consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
