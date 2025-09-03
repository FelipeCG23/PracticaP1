package logicaL;

public class Libro {
	private String titulo;
	private String autor;
	private String publisher;
	private int anioPublicacion;
	private int precio;
	private int numPaginas;
	private int codigo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Libro(String titulo, String autor, String publisher, int anioPublicacion, int precio, int numPaginas,
			int codigo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.publisher = publisher;
		this.anioPublicacion = anioPublicacion;
		this.precio = precio;
		this.numPaginas = numPaginas;
		this.codigo = codigo;
	}
}
