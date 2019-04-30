import java.util.*;

public class TresEdades
{
	public static void main( String[] args )
	{
		Scanner scan = new Scanner( System.in );
		
		System.out.println("Ingresa la edad de Hugo:");
		int edad1 = scan.nextInt();
		System.out.println("Ingresa la edad de Paco:");
		int edad2 = scan.nextInt();
		System.out.println("Ingresa la edad de Luis:");
		int edad3 = scan.nextInt();
		
		if( ( edad1 > edad2 )&&( edad1 > edad3 ) )
		{
			System.out.println("Hugo es el mayor");
			if( edad2 > edad3 )
			{
				System.out.println("Paco es el de enmedio");
				System.out.println("Luis es el menor");
			}
		    else if( edad2 < edad3 )
			{
				System.out.println("Luis es el de enmedio");
				System.out.println("Paco es el menor");
			}
			else
			{
				System.out.println("Paco y Luis Tienen la misma edad");
			}
		}
		else if( ( edad2 > edad1 )&&( edad2 > edad3 ) )
		{
			System.out.println("Paco es el mayor");
			if( edad1 > edad3 )
			{
				System.out.println("Hugo es el de enmedio");
				System.out.println("Luis es el menor");
			}
		    else if( edad1 < edad3 )
			{
				System.out.println("Luis es el de enmedio");
				System.out.println("Hugo es el menor");
			}
			else
			{
				System.out.println("Hugo y Luis Tienen la misma edad");
			}
		}
	    else if( ( edad3 > edad1 )&&( edad3 > edad2 ) )
		{
			System.out.println("Luis es el mayor");
			if( edad1 > edad2 )
			{
				System.out.println("Hugo es el de enmedio");
				System.out.println("Paco es el menor");
			}
		    else if( edad1 < edad2 )
			{
				System.out.println("Paco es el de enmedio");
				System.out.println("Hugo es el menor");
			}
			else
			{
				System.out.println("Hugo y Paco Tienen la misma edad");
			}
		}
	    else
		{
			System.out.println("Estos tres cabrones tiene la misma edad");
		}
	}
}