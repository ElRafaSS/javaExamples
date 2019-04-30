import java.util.Scanner;
public class Main
{
	public static int  arrL;
	public static MiArray miArray;
	public static Scanner scan = new Scanner(System.in);
	
	public static void main ( String[] args )
	{
		System.out.println("Ingresa el tamanio del array:");
		arrL = scan.nextInt();
		miArray = new MiArray( arrL );
		
		//miArray.setTotal(1);

		fillArray( arrL );
		sumarArray();
		//showArraySum();
	}
	

	
	public static void fillArray( int length )
	{
		for(int i=0; i<length; i++)
		{
			System.out.println("arr["+i+"] = ");
			int val = scan.nextInt();
			
		    miArray.setArr(i,val);
		}
	}
	
	public static void sumarArray()
	{
		
		System.out.println( miArray.getSum( arrL ) );
	}
	
	public static void showArraySum()
	{}
    

}