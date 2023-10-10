package Logica;

public abstract class Pieza {
	protected int Fila;
	protected int Columna;
	public Pieza(int fila, int columna) {
		super();
		Fila = fila;
		Columna = columna;
	}
public abstract int calcularcasilla();
}
