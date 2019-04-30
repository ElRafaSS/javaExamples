public class MiArray
{
	public int[] array;
	public int total;
	
	public MiArray( int length )
	{
		array = new int[length];
	}
	
	public void setTotal( int total )
	{
		this.total = total;
	}
	
	public void setArr( int idx, int val )
	{
		array[idx] = val;
	}
	
	public int getSum( int length )
	{
		int suma=0;
		for(int i=0; i<length; i++)
		{
		    suma = suma + array[i];
		}
		return suma;
	}	
	

}