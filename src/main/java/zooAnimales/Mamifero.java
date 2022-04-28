package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero(){
		super();
		Mamifero.listado.add(this);
	}
	
	public Mamifero (String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	
	public boolean getPelaje() {
		return this.pelaje;
	}

	public void setPelaje(boolean pelajeNuevo) {
		this.pelaje = pelajeNuevo;
	}
	
	public int getPatas() {
		return this.patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}

	public static int cantidadMamiferos(){
		return listado.size();
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero nuevoCaballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos += 1;
		return nuevoCaballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero nuevoLeon = new Mamifero(nombre,edad,"selva",genero,true,4);
		leones += 1;
		return nuevoLeon;
	}
}
