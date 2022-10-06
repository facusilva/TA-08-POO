import java.util.Random;

public class Password {

	private int longitud;
	
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generatePassword(longitud);
	}
	
	private String generatePassword(int longitud) {
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String pwd = "";
		Random rand = new Random();
		for(int i = 0;i<longitud;i++) {
			int x = rand.nextInt(chars.length());
			pwd = pwd+chars.charAt(x);
		}
		
		return pwd;
	}
	
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
