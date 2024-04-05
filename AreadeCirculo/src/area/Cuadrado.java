package area;
import java.util.*;

public class Cuadrado {

	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		
		System.out.print("--------- Area de un Cuadrado ------- \n");
		
		
		System.out.print("Introduce el lado del cuadrado:");
		double l= s.nextDouble();
		double area=(l*l);
		System.out.print("Area del circulo es:" +area);

	}

}
