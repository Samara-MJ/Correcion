package Logica;

public class Peon extends Pieza {

	public Peon(int fila, int columna) {
		super(fila, columna);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularcasilla() {
		if (this.Fila ==2) {
			return 2;
		}else {
		return 1;
	}

}}
