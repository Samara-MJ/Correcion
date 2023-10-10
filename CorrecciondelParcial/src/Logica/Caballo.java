package Logica;

public class Caballo extends Pieza{

	public Caballo(int fila, int columna) {
		super(fila, columna);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularcasilla() {
		if (this.Fila == 1 && this.Columna ==1|| 
				this.Fila==1 && this.Columna == 8||
				this.Fila == 8 && this.Columna ==1||
				this.Fila == 8 && this.Columna ==8){
				return 2;
			}else if (this.Fila ==8 || 
				this.Columna == 8|| 
				this.Fila==1 || 
				this.Columna == 1) {
				return 4;
			}else if (this.Fila == 2 && this.Columna ==2||
						this.Fila == 2||
						this.Fila == 7||
						this.Columna ==2||
						this.Columna ==7) {
				return 6;
			}else {
				return 8;
			}
	}
}

