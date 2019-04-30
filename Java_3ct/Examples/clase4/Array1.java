import java.util.Scanner;

public class Array1
{
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Ingresa el tamanio del array");
		int arrLength = scan.nextInt();
		
		int[] newArr = new int [ arrLength ];
		
		System.out.println("Introduce los numeros:");
		
		fileArray( newArr );
		
		orderArray("asc", newArr);
		showArray( newArr );
		orderArray("des", newArr);
		showArray( newArr );	
	}
	
	
	public static void fileArray( int[] arr )
	{
		for(int i=0; i<arr.length; i++ )
		{
			System.out.println("netx:");
			arr[i] = scan.nextInt();
		}
	}
	
	public static void showArray( int[] arr )
	{
		System.out.println("");
		for(int i=0; i<arr.length; i++ )
		{
			System.out.print(arr[i]);
		}
	}
	
	
	public static void orderArray( String order, int[] arr)
	{
		switch ( order )
		{
			case "asc":
			{
				int val;
				System.out.print("\n\nascendente");
				for(int j =0; j<(arr.length-1); j++ )
				{
					for(int i =0; i<(arr.length-1); i++ )
					{
						val = arr[i];
						if( arr[i] > arr[i+1])
						{
							arr[i]= arr[i+1];
							arr[i+1]= val;
						}
					}
				}
				break;
			}
			case "des":
			{
				int val;
				System.out.print("\n\ndescendente:");
				for(int j =0; j<(arr.length-1); j++ )
				{
					for(int i =0; i<(arr.length-1); i++ )
					{
						val = arr[i];
						if( arr[i] < arr[i+1])
						{
							arr[i]= arr[i+1];
							arr[i+1]= val;
						}
					}
				}
				break;
			}
			default:
			{
				System.out.println("no existe");
				break;
			}
		}
		
	}
}