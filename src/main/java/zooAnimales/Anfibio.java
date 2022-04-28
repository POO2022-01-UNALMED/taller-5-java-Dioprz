package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList<>(); 
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
		Anfibio.listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}

	public void setColorPiel(String ColorPielNuevo) {
		this.colorPiel = ColorPielNuevo;
	}	

	public boolean getVenenoso() {
		return this.venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}

	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio nuevoR = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas += 1;
		return nuevoR;
	}

	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio nuevaSal = new Anfibio(nombre,edad,"oceano",genero,"negro",true);
		salamandras += 1;
		return nuevaSal;
	}

	public static int cantidadAnfibios(){
		return listado.size();
	}

	public String movimiento() {
        return "saltar";
    }
}

