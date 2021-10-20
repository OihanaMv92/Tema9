package Es.Studium.Recursividad;

import java.util.Scanner;

public class FibonacciEj3
{

	public static void main(String[] args)
	{
		int n, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el valor de n: ");
		n = teclado.nextInt();
		resultado = calcularFibonacci(n);
		System.out.println("El valor de la funcion Fibonacci para el n dado es "+resultado);
		teclado.close();
	}
	static int calcularFibonacci(int x)
	{
		int resultado;
		if(x== 0)
		{
			resultado = 0;
		}
		else
		{
			if(x==1)
			{
				resultado =1;
			}
			else
			{
				resultado = calcularFibonacci(x-1)+ calcularFibonacci(x-2);
			}
		}
		return resultado;

	}

}
