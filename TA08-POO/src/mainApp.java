
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo una objeto Persona
		Persona yo = new Persona("Facundo Silva", 22, "55555555A", Sexo.H, 78.2, 1.74);
		//Le seteo un nombre, cambiando el asignado mediante el constructor
		yo.setNombre("Facundo Silva Castillo");
		//Muestro por pantalla todos los datos de la Persona
		System.out.println("Nombre: "+yo.getNombre()+", Edad: "+yo.getEdad()+", DNI: "+yo.getDNI()+", Sexo: "+yo.getSexo()+", Peso: "+yo.getPeso()+", Altura: "+yo.getAltura());
		
		//Creo un objeto contraseña y muestro la contraseña que me ha generado
		Password prova = new Password(8);
		//Muestro la contraseña usando el getter
		System.out.println("Contraseña generada: "+prova.getContraseña());

		
		//Creo un objeto Electrodomestico usando el constructor que recibe todos los datos
		Electrodomestico lavadora = new Electrodomestico(419.99, "asdfsdaf" , 'A',35.32);
		//Muestro sus atributos por pantalla
		System.out.println("Precio: "+lavadora.getPrecioBase()+", Color: "+lavadora.getColor()+", Consumo: "+lavadora.getConsumoEnergetico()+", Peso: "+lavadora.getPeso());
		
		
		//Creo un objeto serie y le asigno los datos mediante el constructor que recibe todos los datos
		Serie got = new Serie("Game of thrones", 8, "fantasia", "Benioff & Weiss");
		//Muestro sus atributos por pantalla
		System.out.println("Título: "+got.getTitulo()+", Temporadas: "+got.getTemporadas()+", Género: "+got.getGenero()+", Creador/es: "+got.getCreador());
		
	}

}
