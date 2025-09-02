package logica;

import java.util.HashMap;

public class Banco {
	private String nombre;
	private HashMap<Integer, Cuenta> cuentas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Banco(String nombre) {
		this.nombre = nombre;
		this.cuentas = new HashMap<Integer, Cuenta>();
	}
	
	public void crearCuenta(int numero, int clave, String titular) throws Exception{
		if(this.cuentas.containsKey(numero)) {
			throw new Exception("La cuenta " + numero + " ya existe");
		} else {
			Cuenta c = new Cuenta(numero, clave, titular);
			this.cuentas.put(numero, c);
		}
	}
	
	public int consultarSaldo(int numero, int clave) throws Exception {
		if(!this.cuentas.containsKey(numero)) {
			throw new Exception("La cuenta " + numero + " no existe");
		} else if(clave != this.cuentas.get(numero).getClave()) {
			throw new Exception("Clave incorrecta");
		} else {
			return this.cuentas.get(numero).getSaldo();
		}
	}
	
	public void depositar(int numero, int clave, int valor) throws Exception {
		if(!this.cuentas.containsKey(numero)) {
			throw new Exception("La cuenta " + numero + " no existe");
		} else if(clave != this.cuentas.get(numero).getClave()) {
			throw new Exception("Clave incorrecta");
		} else {
			Cuenta c = this.cuentas.get(numero);
			c.setSaldo(c.getSaldo() + valor);
		}
	}
	
	public void retirar(int numero, int clave, int valor) throws Exception {
		if(!this.cuentas.containsKey(numero)) {
			throw new Exception("La cuenta " + numero + " no existe");
		} else if(clave != this.cuentas.get(numero).getClave()) {
			throw new Exception("Clave incorrecta");
		} else if(this.cuentas.get(numero).getSaldo() < valor) {
			throw new Exception("Saldo en la cuenta " + numero + " insuficiente");
		} else {
			Cuenta c = this.cuentas.get(numero);
			c.setSaldo(c.getSaldo() - valor);;
		}
	}
	
	public void transferir(int numeroOrigen, int clave, int valor, int numeroDestino) throws Exception {
		if(!this.cuentas.containsKey(numeroOrigen)) {
		} else if(clave != this.cuentas.get(numeroOrigen).getClave()) {
			throw new Exception("Clave incorrecta");
		} else if(this.cuentas.get(numeroOrigen).getSaldo() < valor) {
			throw new Exception("Saldo en la cuenta " + numeroOrigen + " insuficiente");
		} else {
			if(!this.cuentas.containsKey(numeroDestino)) {
				throw new Exception("La cuenta " + numeroDestino + " no existe");
			} else {
				/// Versión larga:
				/// Cuenta cOrigen = this.cuentas.get(numeroOrigen);
				/// Cuenta cDestino = this.cuentas.get(numeroDestino);
				/// cOrigen.setSaldo(cOrigen.getSaldo() - valor);
				/// cDestino.setSaldo(cDestino.getSaldo() + valor);
				
				/// Versión corta:
				this.retirar(numeroOrigen,  clave,  valor);
				this.depositar(numeroDestino,  clave,  valor);
			}
		}
	}
}
