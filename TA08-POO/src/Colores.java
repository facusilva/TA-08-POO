
public enum Colores {
	//declaro los colores enumerables y el string retorno
	BLANCO("blanco"), 
	NEGRO("negro"), 
	ROJO("rojo"), 
	AZUL("azul"), 
	GRIS("gris");
	
	//atributos del enum
	String color;
	
	//declaro el constructor
	Colores(String color) {
		this.color = color;
	}
}
