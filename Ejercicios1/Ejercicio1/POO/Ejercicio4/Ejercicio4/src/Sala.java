import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Sala {
	
	private String sala[][]= new String[8][9];
	
	public Sala(){
		this.sala = butacas();
	}
	
	public  String[][] butacas(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				sala [i][j]= "libre";
			}
		}
		return sala;
	}
	
	public  String[][] ocuparButaca (int fila, int columna){
		if(sala [fila][columna]== "libre"){sala [fila][columna]= "ocupado";}
		else if(sala [fila][columna]== "ocupado"){
			do {
				fila = ThreadLocalRandom.current().nextInt(0,8);
				columna = ThreadLocalRandom.current().nextInt(0,9);				
			} while (sala [fila][columna]== "ocupado");
			sala [fila][columna]= "ocupado";
		}
		return sala;
	}

	@Override
	public String toString() {
		
		int [] filas = {8,7,6,5,4,3,2,1};
		String[] columnas = {"A","B","C","D","E","F","G","H","I"};			
		String butacas[][]= new String[8][9];
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				butacas[i][j]=filas[i] + columnas [j] +": "+ sala[i][j];	
			}			
		}
		
		return "Sala "+ "\n"+ Arrays.toString(butacas[0])+ "\n"+ Arrays.toString(butacas[1])+ "\n" +
					Arrays.toString(butacas[2])+ "\n"+ Arrays.toString(butacas[3])+ "\n" + 
					Arrays.toString(butacas[4])+ "\n"+ Arrays.toString(butacas[5])+ "\n" +
					Arrays.toString(butacas[6])+ "\n"+ Arrays.toString(butacas[7])+ "\n";			
	}
}