package area;
import java.util.*;

public class Rectangulo {

	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("--------- Area de un rectangulo ---------- \n");
		
		
		System.out.print("Introduce el lado del cuadrado:");
		double l= scanner.nextDouble();

		System.out.print("Introduce el ancho:");
		double a= scanner.nextDouble();
		double area=(l*a);
		System.out.print("Area del circulo es:" +area);
	}

}
