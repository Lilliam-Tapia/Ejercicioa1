import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double a,b,c;
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Introduzca el valor de a: ");
		a = lector.nextDouble();
		System.out.print("Introduzca el valor de b: ");
		b = lector.nextDouble();
		System.out.print("Introduzca el valor de c: ");
		c = lector.nextDouble();
		
		Raices ecuacion=new Raices(a,b,c);
		ecuacion.calcular();
	}

}