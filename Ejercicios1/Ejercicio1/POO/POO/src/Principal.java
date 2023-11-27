import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int cantidadAGenerar;
		int nAlumnosFaltan = 0 ;
		boolean faltaProfesor =false;
		
		System.out.println("Cuantos profesores vas a generar?");
		cantidadAGenerar = lector.nextInt();
		
		Profesor[] profesores = new Profesor[cantidadAGenerar];
		
		System.out.println("Cuantos alumnos vas a generar?");
		cantidadAGenerar = lector.nextInt();

		Alumno[] alumnos = new Alumno[cantidadAGenerar];
		
		System.out.println("Cuantas aulas vas a generar?");
		cantidadAGenerar = lector.nextInt();
		Aula[] aulas = new Aula[cantidadAGenerar];
		System.out.println();
		
		Aleatorio.getGenerarAlumnos(alumnos);
		Aleatorio.getProfesores(profesores);
		Aleatorio.getAulas(aulas, profesores, alumnos);
		
		for(int i=0; i< alumnos.length; i++) {
			System.out.println("Alumno: " +alumnos[i].getNombre() + " Su edad: " + alumnos[i].getEdad() + " sexo: " + alumnos[i].getSexo());
		}
		System.out.println();
		for(int i=0; i< aulas.length; i++) {

			System.out.println("Aula de " +aulas[i].getMateriaImpartida());
		}
		System.out.println();


		for(int i=0; i< profesores.length; i++) {

			System.out.println("Profesor "+profesores[i].getNombre() + " imparte la materia " + profesores[i].getMateria() + " su edad es: "+ profesores[i].getEdad());

		}
		
		
		aulas[0].verAlumnos(1).getNombre();
	}

}