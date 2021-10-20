package Es.Studium.Recursividad;

import java.util.Scanner;

public class ej4
{

	public static void main(String[] args)
	{
		int n, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el valor de n que sea par: ");
		n = teclado.nextInt();
		if(n%2==0)
		{
			resultado = calcularSuma(n);
			System.out.println("La suma de los pares es "+ resultado);
		}
		else
		{
			System.out.println("Error, ingresa numero par ");
		}
		teclado.close();
	}
	static int calcularSuma(int x)
	{
		int resultado;
		if(x == 2)
		{
			resultado = 2;
		}
		else
		{
			resultado = x + calcularSuma(x-2);
		}
		return resultado;
	}

}
