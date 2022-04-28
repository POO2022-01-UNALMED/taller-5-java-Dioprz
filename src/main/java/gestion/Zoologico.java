package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
	}
	
	public Zoologico (String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void agregarZonas(Zona newZona) {
		this.zonas.add(newZona);
	}
	
	public int cantidadTotalAnimales() {
		int numZonas = zonas.size();
		int totalAnimales = 0;
		
		for (int i = 0; i < numZonas;i++ ) {
			totalAnimales += zonas.get(i).cantidadAnimales();
		}
		return totalAnimales;
	}
}
