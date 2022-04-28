package zooAnimales;
import java.util.ArrayList;


public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones; 
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(){
		super();
		Ave.listado.add(this);
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}

	public String getColorPlumas() {
		return this.colorPlumas;
	}

	public void setColorPlumas(String colorPlumasNuevo) {
		this.colorPlumas = colorPlumasNuevo;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave nuevoHalcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones += 1;
		return nuevoHalcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave nuevoAguila = new Ave(nombre,edad,"montanas",genero,"blanco");
		aguilas += 1;
		return nuevoAguila;
	}
	
	public static int cantidadAves(){
		return listado.size();
	}
	
	public String movimiento() {
        return "volar";
    }
}
