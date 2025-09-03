package uml;

public class notasUML {
	/* Tipos de relaciones:
	 * 1. Herencia --> Línea solida con una flecha hueca (un triangulo hueco).
	 * Apunta de la clase hija a la clase padre.
	 * Ejemplo: Clase Hija --> Clase PAdre (Circulo --> Figura)
	 * Todo circulo es una figura, pero no toda figura es un circulo.
	 * La clase hija hereda los atributos y metodos de la clase padre.
	 * La clase padre debe ser abstracta si tiene metodos abstractos.
	 * 
	 * 2. Implementación --> Línea discontinua con una flecha hueca (un triangulo hueco).
	 *  Apunta de la clase que implementa a la interfaz.
	 *  Las interfaces definen metodos que deben ser implementados por la clase
	 *  sin que la interfaz tenga una implementación.
	 *  No puede tener atributos, solo metodos y constantes (static final).
	 *  Los métodos son publicos y abstractos por defecto.
	 *  
	 *  3. Agregación --> Línea solida con un rombo hueco.
	 *  Apunta de la clase contenida a la clase que la contiene.
	 *  La clase contenida puede existir sin la clase que la contiene.
	 *  
	 *  4. Composición --> Línea solida con un rombo relleno.
	 *  Apunta de la clase contenida a la clase que la contiene.
	 *  La clase contenida no puede existir sin la clase que la contiene.
	 *  
	 *  5. Asociación --> Línea solida.
	 *  Apunta de una clase a otra.
	 *  La asociación puede tener un nombre y una multiplicidad.
	 *  Multiplicidades:
	 *  1 --> Exactamente uno.
	 *  0..1 --> Cero o 1.
	 *  * --> Muchos.
	 *  0..* --> Cero o muchos.
	 *  1..* --> Uno o muchos.
	 */
	 
}
