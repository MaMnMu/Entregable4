import java.util.Scanner;

public class Programav1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		System.out.println("¿Cuantos numeros quieres sumar?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			System.out.println("Introduzca un numero a sumar");
			double nums = sc.nextDouble();
			suma = suma + nums;
		}
		System.out.println("La suma de los numeros es " + suma);
		System.out.println("La media de los numeros es " + suma / n);
	}
}