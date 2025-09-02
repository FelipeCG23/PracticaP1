package logica;

public class Cuenta {
	private int numero;
	private int clave;
	private String titular;
	private int saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public Cuenta(int numero, int clave, String titular) {
		this.numero = numero;
		this.clave = clave;
		this.titular = titular;
		this.saldo = 0;
	}
}
