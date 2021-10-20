package Es.Studium.Recursividad;

public class Ej1
{

	public static void main(String[] args)
	{
		int n;
		n = sumaRec(100);
		System.out.println("La suma recursiva de los 100 primeros números vale "+n);
		int suma = 0;
		for(int i=1;i<=100;i++)
		{
			suma = suma + i;
		}
		System.out.println("La suma iterativa de los 100 primeros números vale "+suma);
	}

	static int sumaRec(int a)
	{
		int resultado;
		if(a == 1)
		{
			resultado = 1;
		}
		else
		{
			resultado = a + sumaRec(a-1);
		}
		return resultado;
	}
}
/*
public class Ej1
{

	public static void main(String[] args)
	{
		int n;
		n = sumaRec(100);
		System.out.println("La suma de los 100 primeros números vale " + n);

	}
	public static int sumaRec(int a)
	{
		int resultado;
		if (a ==1)
		{
			resultado=1;
		}
		else
		{
			resultado = a + sumaRec(a-1);
		}
		return resultado;
	}
}
*/