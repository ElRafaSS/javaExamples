public class SaludarDespedir
{
	int val = 0; 
	
    public static void main(String[] args)
	{
		
		SaludarDespedir sum = new SaludarDespedir();
		SaludarDespedir res = new SaludarDespedir();
		System.out.println("Empezamos con 0\n");
		
		for(int i=0; i<10; i++)
		{
			System.out.println( "Suma: "+sum.sumar( 1 ) );
		}
		
		System.out.println( "\n" );

		for(int i=0; i<10; i++)
		{
			System.out.println( "Resta: "+sum.restar( 1 ) );
		}		
		
	
	}
	
	public int sumar( int add)
	{
		val = val + add;
		return val;
		
	}
	
	public int restar( int rest )
	{
		val = val - rest;
		return val;
	}

}