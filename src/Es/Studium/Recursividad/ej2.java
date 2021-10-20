package Es.Studium.Recursividad;


import java.util.Scanner;

public class ej2
{

	public static void main(String[] args)
	{
		int n, x, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		n = teclado.nextInt();
		System.out.println("Ingrese la potencia: ");
		x = teclado.nextInt();
		resultado = PotenciaRec(n,x);
		System.out.println("El valor de n elevado a x vale "+resultado);
		teclado.close();
	}




	static int PotenciaRec(int a, int x)
	{
		int resultado;
		if(x == 1)
		{
			resultado = a;
		}
		else
		{
			resultado = x* PotenciaRec(a,x-1);
		}
		return resultado;


	}
}
