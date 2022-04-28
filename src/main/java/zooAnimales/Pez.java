package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {

	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez () {
		super();
		Pez.listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamasNuevo) {
		this.colorEscamas = colorEscamasNuevo;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public void setCantidadAletas(int CantidadAletasNuevo) {
		this.cantidadAletas = CantidadAletasNuevo;
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez nuevoSalm = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones += 1;
		return nuevoSalm;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez nuevoBac = new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos += 1;
		return nuevoBac;
	}
	public static int cantidadPeces(){
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	
}
