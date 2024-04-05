package calculadoraBasic;
import java.util.*;

public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("--------- Calculadora Basica  ---------- \n");
		System.out.print("--------- Orden de Operaciones  ---------- \n");
		System.out.print("--------- 1ª Suma  \n");
		System.out.print("--------- 2ª Resta  \n");
		System.out.print("--------- 3ª Multiplicacion  \n");
		System.out.print("--------- 1ª Divicion \n");
		
		System.out.print("Introduce primero digito :\n");
		double num1 = scanner.nextDouble();
	

		System.out.print("Introduce segundo digito :\n");
		double num2 = scanner.nextDouble();
		
		
		double suma=(num1+num2);
		double resta=(num1-num2);
		double multiplicacion=(num1*num2);
		double div=(num1/num2);
		System.out.print("el resultado de la suma es :"+suma+" \n");
		System.out.print("el resultado de la resta es :"+resta+ "\n");
		System.out.print("el resultado de la suma es :"+multiplicacion);
		System.out.print("el resultado de la d es :"+div);



	
	}
	
	

}
