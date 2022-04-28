package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		super();
		Reptil.listado.add(this);
	}

	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}

	public String getColorEscamas() {
		return this.colorEscamas;
	}

	public void setColorEscamas(String colorEscamasNuevo) {
		this.colorEscamas = colorEscamasNuevo;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}

	public void setLargoCola(int largoColaNuevo) {
		this.largoCola = largoColaNuevo;
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil nuevoIguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas += 1;
		return nuevoIguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil nuevoSerpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes += 1;
		return nuevoSerpiente;
	}

	public static int cantidadReptiles(){
		return listado.size();
	}

	public String movimiento() {
		return "reptar";
	}
	
}
