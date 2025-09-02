package Presentacion;

import logica.Banco;

public class Principal {
	private Banco miBanco;
	
	public Principal() {
		this.miBanco = new Banco("Banco DPOO");
		try {
			this.miBanco.crearCuenta(1, 1234, "Juan Perez");
			this.miBanco.crearCuenta(2, 4321, "Maria Gomez");
			//this.miBanco.crearCuenta(1,  0212, "Pedro Ruiz");
			this.miBanco.depositar(1, 1234, 1000);
			this.miBanco.depositar(2, 4321, 2000);
			System.out.println("Saldo cuenta 1: " + this.miBanco.consultarSaldo(1, 1234));
			System.out.println("Saldo cuenta 2: " + this.miBanco.consultarSaldo(2, 4321));
			this.miBanco.retirar(1, 1234, 500);
			System.out.println("Saldo cuenta 1 despues de retirar 500: " + this.miBanco.consultarSaldo(1, 1234));
			//this.miBanco.retirar(2, 4321, 2500);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	
}
