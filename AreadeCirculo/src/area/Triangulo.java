package area;
import java.util.*;

public class Triangulo {

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		
		System.out.print("--------- Area de un triangulo ---------- \n");
		
		
		System.out.print("Introduce la base  del triangulo:");
		double b= s.nextDouble();

		System.out.print("Introduce el altura:");
		double a= s.nextDouble();
		double area=(b*a);
		System.out.print("Area del Tringulo es:" +area);
	}
	

}
