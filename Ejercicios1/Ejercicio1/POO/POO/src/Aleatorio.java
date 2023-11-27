public class Aleatorio extends Falta{
	public Aleatorio(boolean falta, int faltas, boolean darClase) {
		super(falta, faltas, darClase);
	}

	private final static String nombreChicos[] = { "Juan", "Alberto", "Francisco", "Ruben", "Felix", "Cristian" };
	private final static String nombreChicas[] = { "Sofia", "Cristina", "Sara", "Carla", "Carlota", "Ana" };
	private final static String SEX[] = { "chico", "chica" };
	private final static String[] MATERIAS = { "Introduccion_a_la_programacion", "Ingenieria_de_software", "Sistemas_operativos_de_redes" };

	public static int generarNumeroAleatorio(int minimo, int maximo) {
		int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	public static Alumno[] getGenerarAlumnos(Alumno[] alumnos) {
		for (int i = 0; i < alumnos.length; i++) {
			if (getSexo().equals("chico")) {
				alumnos[i] = new Alumno(getNombre("chico"), getEdad("alumno"), "chico", getNota());
			} else {
				alumnos[i] = new Alumno(getNombre("chica"), getEdad("alumno"), "chica", getNota());
			}
		}
		return alumnos;
	}

	public static Profesor[] getProfesores(Profesor[] profesores) {

		for (int i = 0; i < profesores.length; i++) {
			if (getSexo().equals("chico")) {
				profesores[i] = new Profesor(getNombre("chico"), getEdad("profesor"), "chico", getMateria());
			} else {
				profesores[i] = new Profesor(getNombre("chica"), getEdad("profesor"), "chica", getMateria());
			}
		}
		return profesores;
	}

	public static Aula[] getAulas(Aula[] aulas, Profesor[] profesores, Alumno[] alumnos) {
		Alumno[] alumnosintro = new Alumno[getMaximoEstudiantesAula(alumnos)];
		Alumno[] alumnosinge = new Alumno[getMaximoEstudiantesAula(alumnos)];
		Alumno[] alumnossis = new Alumno[getMaximoEstudiantesAula(alumnos)];
		Profesor profesor;

		for (int i = 0; i < aulas.length; i++) {
			profesor = profesores[generarNumeroAleatorio(0, profesores.length - 1)];
			if (profesor.getMateria().equals("Introduccion_a_la_programacion")) {
				for (int j = 0; j < alumnosintro.length; j++) {
					alumnosintro[j] = getAlumno(alumnos);
					
				}
				aulas[i] = new Aula(i, alumnosintro.length, "Introduccion_a_la_programacion", alumnosintro, profesor);
			} else if (profesor.getMateria().equals("Ingenieria_de_software")) {
				for (int j = 0; j < alumnosinge.length; j++) {
					alumnosinge[j] = getAlumno(alumnos);
					
				}
				aulas[i] = new Aula(i, alumnosinge.length, "Ingenieria_de_software", alumnosinge, profesor);
			} else if (profesor.getMateria().equals("Sistemas_operativos_de_redes")) {
				for (int j = 0; j < alumnossis.length; j++) {
					alumnossis[j] = getAlumno(alumnos);

				}
				aulas[i] = new Aula(i, alumnossis.length, "Sistemas_operativos_de_redes", alumnossis, profesor);
			}

		}

		return aulas;
	}

	public static String getNombre(String nombreGenero) {
		String nombre;
		if (nombreGenero.equals("chico")) {
			nombre = nombreChicos[generarNumeroAleatorio(0, nombreChicos.length - 1)];
		} else {
			nombre = nombreChicas[generarNumeroAleatorio(0, nombreChicos.length - 1)];
		}
		return nombre;
	}

	public static int getEdad(String edadProfesorOAlumno) {
		int edad;
		if (edadProfesorOAlumno.equals("profesor")) {
			edad = generarNumeroAleatorio(30, 50);
		} else {
			edad = generarNumeroAleatorio(14, 16);
		}
		return edad;
	}

	public static String getSexo() {
		String sexo = SEX[generarNumeroAleatorio(0, SEX.length - 1)];
		return sexo;
	}

	public static String getMateria() {
		String materia = MATERIAS[generarNumeroAleatorio(0, MATERIAS.length - 1)];
		return materia;
	}

	public static int getNota() {
		return generarNumeroAleatorio(0, 10);
	}

	public static int getMaximoEstudiantesAula(Alumno[] alumnos) {
		int maximo = generarNumeroAleatorio(5,10);
		return maximo;
	}

	public static Alumno getAlumno(Alumno[] alumnos) {
		Alumno alumno = alumnos[generarNumeroAleatorio(0, alumnos.length - 1)];
		return alumno;
	}

	public Profesor getProfesor(Profesor[] profesores) {
		Profesor profesor = profesores[generarNumeroAleatorio(0, profesores.length - 1)];
		return profesor;
	}
	
	public static boolean faltaProfesor() {
		boolean falta=false;
		if(generarNumeroAleatorio(0,100) <=20) {
			falta = true;
		}
		return falta;
	}
	public static boolean faltaAlumno() {
		boolean falta=false;
		if(generarNumeroAleatorio(0,100) <=50) {
			falta = true;
		}
		return falta;
	}
	
}