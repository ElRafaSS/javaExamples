import java.util.*;
public class AreaTriangulo
{
	public static void main(String[] args )
	{
		short b;
		short h;
		short c;
		int option = 0;
		
		Scanner scan = new Scanner(System.in);
		Triangulo miTriangulo = new Triangulo();
		
		System.out.println("\nCalculo de area y perimetro de un triangulo rectangulo\n");
		


		while( option !=3 )
		{
			
			System.out.println("\nIngresa el numero que corresponda\n1->Area\n2->Perimetro\n3->Terminar programa");
			option = scan.nextInt();
			
			
			
			
			switch( option )
			{
				case 1:
				{
					System.out.println("\n\n\n\n\nArea\n");
					System.out.println("Ingresa la base: ");
					b = scan.nextShort();
					System.out.println("Ingresa la altura: ");
					h = scan.nextShort();					
					System.out.println("\n--->El area del triangulo es: "+miTriangulo.area(b, h));	
					break;
				}
				case 2:
				{
					System.out.println("\n\n\n\n\nPerimetro\n");
					System.out.println("Ingresa la base: ");
					b = scan.nextShort();
					System.out.println("Ingresa la altura: ");
					h = scan.nextShort();					
					System.out.println("\nIngrese la hipotenusa: ");
					c = scan.nextShort();
					System.out.println("\n--->El perimetro del triangulo es: "+miTriangulo.perimetro(b, h, c) );
					
					break;
				}
				case 3:
				{
					System.out.println("\nBye, bye...");
					break;
				}
				default :
				{
					System.out.println("\nNo manches, esta no es una opcion valida");
					break;
				}
			}
		}
		

		

		
		
	}
}