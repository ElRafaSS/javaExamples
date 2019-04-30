import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner numeros = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
				
		short a;
		short b;
		int suma;
		int resta;
		
		System.out.println("Ingrese un numero: ");
		a = numeros.nextShort();
		System.out.println("Ingrese otro numero: ");
		b = numeros.nextShort();
				
	    suma = calculadora.sumar(a,b);
		resta = calculadora.restar(a,b );
		
		System.out.println("La suma de ambos numeros es: "+suma);
        System.out.println("La resta de ambos numeros es: "+resta);		
	}
	
	public static int sumar (short a, short b )
	{
		int suma = a+b;
		return suma;
		
	}
	
	public static int restar ( short a, short b)
	{
		int resta = a-b;
		return resta;
	}
}