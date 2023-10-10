package Presentacion;
import Logica.Pieza;
import Logica.Peon;
import Logica.Torre;
import Logica.Alfil;
import Logica.Dama;
import Logica.Rey;
import Logica.Caballo;

public class Principal {
	
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		Pieza p;
		p = new Rey(1, 8);
		System.out.println(p.calcularcasilla());
		
		p = new Peon(2,8);
		System.out.println(p.calcularcasilla());
		
		p= new Alfil(1,8);
		System.out.println(p.calcularcasilla());
		
		p = new Dama(1,8);
		System.out.println(p.calcularcasilla());
		
		p= new Caballo(1,8);
		System.out.println(p.calcularcasilla());
		
		p= new Torre(1,8);
		System.out.println(p.calcularcasilla());
	
		
	}
	
	
}
