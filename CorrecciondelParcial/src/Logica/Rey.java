package Logica;

public class Rey extends Pieza{

	public Rey(int fila, int columna) {
		super(fila, columna);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularcasilla() {
		if (this.Fila == 1 && this.Columna ==1|| 
			this.Fila==1 && this.Columna == 8||
			this.Fila == 8 && this.Columna ==1||
			this.Fila == 8 && this.Columna ==8) {
			return 3;
		}else if (this.Fila ==8 || this.Columna == 8 || this.Fila==1 || this.Columna == 1) {
			return 5;
		}else {
		return 8;
		}
	}

}
