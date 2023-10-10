package Logica;

public class Dama extends Pieza{

	public Dama(int fila, int columna) {
		super(fila, columna);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularcasilla() {
		if (this.Fila == 1 && this.Columna ==1|| 
				this.Fila==1 && this.Columna == 8||
				this.Fila == 8 && this.Columna ==1||
				this.Fila == 8 && this.Columna ==8){
				return 21;
			}else if (this.Fila ==8 || 
				this.Columna == 8|| 
				this.Fila==1 || 
				this.Columna == 1) {
				return 21;
			}else if (this.Fila == 2 && this.Columna ==2||
						this.Fila == 2 && this.Columna ==3||
						this.Fila == 2 && this.Columna ==4||
						this.Fila == 2 && this.Columna ==5||
						this.Fila == 2 && this.Columna ==6||
						this.Fila == 2 && this.Columna ==7||
						this.Fila == 7 && this.Columna ==2||
						this.Fila == 7 && this.Columna ==3||
						this.Fila == 7 && this.Columna ==4||
						this.Fila == 7 && this.Columna ==5||
						this.Fila == 7 && this.Columna ==6||
						this.Fila == 7 && this.Columna ==7||
						this.Fila == 2 && this.Columna ==2||
						this.Fila == 3 && this.Columna ==2||
						this.Fila == 4 && this.Columna ==2||
						this.Fila == 5 && this.Columna ==2||
						this.Fila == 6 && this.Columna ==2||
						this.Fila == 7 && this.Columna ==2||
						this.Fila == 2 && this.Columna ==7||
						this.Fila == 3 && this.Columna ==7||
						this.Fila == 4 && this.Columna ==7||
						this.Fila == 5 && this.Columna ==7||
						this.Fila == 6 && this.Columna ==7||
						this.Fila == 7 && this.Columna ==7) {
				return 23;
			}else if(this.Fila == 3 && this.Columna ==3||
						this.Fila == 3 && this.Columna ==4||
						this.Fila == 3 && this.Columna ==5||
						this.Fila == 3 && this.Columna ==6||
						
						this.Fila == 6 && this.Columna ==3||
						this.Fila == 6 && this.Columna ==4||
						this.Fila == 6 && this.Columna ==5||
						this.Fila == 6 && this.Columna ==6||
						
						this.Fila == 3 && this.Columna ==3||
						this.Fila == 4 && this.Columna ==3||
						this.Fila == 5 && this.Columna ==3||
						this.Fila == 6 && this.Columna ==3||
						this.Fila == 3 && this.Columna ==6||
						this.Fila == 4 && this.Columna ==6||
						this.Fila == 5 && this.Columna ==6||
						this.Fila == 6 && this.Columna ==6) {
				return 25;
			}else {
			return 27;
			}
	}
	}


