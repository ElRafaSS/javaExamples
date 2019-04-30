import java.util.*;
public class SaludoMetodo
{
	public static void main( String[] args )
	{
		Scanner      scan  = new Scanner(System.in);		
		SaludoMetodo sld   = new SaludoMetodo();	
		SaludoMetodo medad = new SaludoMetodo();
		
		System.out.println("Ingresa la edad de Luis: ");
		int edad = scan.nextInt();
		
		System.out.println("Ingresa la edad de Juan");
		int edad2 = scan.nextInt();
				 
	    if(edad < edad2 )
		{
			System.out.println("Luis es menor");
		}
		else if( edad2 < edad )
		{
			System.out.println("Juan es menor");
			
		}
		else
		{
			System.out.println("Luis y juan tienen la misma edad");
		}
				 
				 
		//sld.saludar(new String("Hola parametro"));
		//medad.muestraEdad(edad);	
	}
	
	public void saludar( String saludo )
	{
		System.out.println(saludo);
	}
	
	public void muestraEdad(int edad)
	{
		System.out.println(edad);
	}
}