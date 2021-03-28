import java.util.Scanner;

public class Programav1 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int i = 0, suma = 0;
		while (i < 5)
		{
			System.out.println("Introduzca un numero a sumar (5 en total)");
			int nums = sc.nextInt();
			suma = suma + nums;
			i++;
		}
		System.out.println("La suma de los numeros es " + suma);
	}
}