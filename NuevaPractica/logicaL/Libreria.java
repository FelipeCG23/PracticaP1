package logicaL;

import java.util.HashMap;

public class Libreria {
	private String nombre;
	private String direccion;
	private HashMap<String, Libro> libros;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public HashMap<String, Libro> getLibros() {
		return libros;
	}
	public void setLibros(HashMap<String, Libro> libros) {
		this.libros = libros;
	}
	public Libreria(String nombre, String direccion, HashMap<String, Libro> libros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = libros;
	}
	
	public void agregarLibro(String titulo, String autor, String publisher, int anioPublicacion, int precio, int numPaginas,
			int codigo) throws Exception {
		if(this.libros.containsKey(titulo) ) {
			throw new Exception("El libro " + titulo + " ya lo tenemos");
		} else {
			Libro l = new Libro(titulo, autor, publisher, anioPublicacion, precio, numPaginas, codigo);
			this.libros.put(titulo, l);
		}
	}
	
	public void venderLibro(String titulo) throws Exception {
		if(!this.libros.containsKey(titulo)) {
			throw new Exception("No tenemos el libro " + titulo);
		} else {
			this.libros.remove(titulo);
		}
	}
	
	public int consultarPrecio(String titulo) throws Exception {
		if(!this.libros.containsKey(titulo)) {
			throw new Exception("No tenemos el libro " + titulo);
		} else {
			return this.libros.get(titulo).getPrecio();
		}
	}
	
}
