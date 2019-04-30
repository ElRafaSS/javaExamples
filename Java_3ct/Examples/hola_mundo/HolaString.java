public class HolaString
{
	public static void main( String[] args)
	{
		int val = 0;
		HolaString operaciones = new HolaString(); 
		
		for(byte i=0; i<20; i++ )
		{
			if( i<10 )
			{
				val = operaciones.sumar( val, 4 );
				System.out.println( "Val = "+ val );
			}
		    else
			{
				val = operaciones.restar( val, 1);
				System.out.println( "Val = "+val );
			}
		}
		
	}
	
	public int sumar( int myVal, int sum )
	{
		int suma = ( myVal + sum );
		return suma;
	}
	
	public int restar( int myVal, int rest )
	{
		return (myVal-rest);
	}
}