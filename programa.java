import java.util.Scanner;

public class Programa
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int i = 0;
		double suma = 0;
		while (i < 5)
		{
			System.out.println("Introduzca un numero a sumar");
			double nums = sc.nextDouble();
			suma = suma + nums;
			i++;
		}
		System.out.println("La suma de los numeros es " + suma);
	}
}