import java.util.Random;

public class Password {
	
	//defino los atributos de la clase
	private int longitud;
	
	private String contraseña;
	
	//constructor con valores por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	//constructor donde el usuario decide la longitud de la contraseña
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generatePassword(longitud);
	}
	
	//recibo la longitud de la contraseña por parámetros y genero y devuelvo una contraseña aleatoria
	private String generatePassword(int longitud) {
		//defino los carácteres que podrá tener la contraseña
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
		String pwd = "";
		Random rand = new Random();
		//hago un bucle que iterará el número de veces equivalente a la longitud de la contraseña y seleccionará un carácter de una posición aleatoria
		//de la cadena de carácteres disponibles y lo concatenará a un string, el resultado de esto es la contraseña aleatoria
		for(int i = 0;i<longitud;i++) {
			int x = rand.nextInt(chars.length());
			pwd = pwd+chars.charAt(x);
		}
		
		return pwd;
	}
	
	//GETTERS Y SETTERS
	public String getContraseña() {
		return contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
