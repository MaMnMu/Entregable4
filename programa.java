import java.util.Scanner;

public class Programa
{
	public static String mostrar(double nums[])
	{
		String texto = "";
		for (int i = 0; i < nums.length; i++)
			texto = texto + nums[i] + ", ";
		return texto;
	}
	
	public static double suma(double nums[])
	{
		double suma = 0;
		for (int i = 0; i < nums.length; i++)
			suma = suma + nums[i];
		return suma;
	}
	
	public static double media(double suma, double nums[])
	{
		return suma / nums.length;
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño de la lista");
		int n = sc.nextInt();
		double nums[] = new double[n];
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Introduzca un numero a la lista");
			nums[i] = sc.nextDouble();
		}
		System.out.println("Lista: " + mostrar(nums));
		System.out.println("La suma de los numeros de la lista es " + suma(nums));
		System.out.println("La media de los numeros de la lista es " + media(suma(nums), nums));
	}
}