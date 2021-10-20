package Es.Studium.Recursividad;

import java.util.Scanner;

public class Sucesion
{

	public static void main(String[] args)
	{
		int n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el valor de n: ");
		n = teclado.nextInt();
		mostrarSuc(n);
		teclado.close();
	}
	static void mostrarSuc(int n) {
		if(n == 0)
		{
			System.out.println("El valor es 0. ");
		}
		else {
			mostrarSuc(n-1);
			System.out.println("El valor es: "+ n*(n-1));
		}
	}
}
