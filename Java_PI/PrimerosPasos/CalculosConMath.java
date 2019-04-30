
public class CalculosConMath
{
    public static void main(String[] args)
	{
		//double raiz = 0;
		//raiz = Math.sqrt(4);
		double base = 5;
		double exponente = 3;
		int resultado = (int)Math.pow( base, exponente );
		System.out.println( "El resutado de "+base+" elevado a "+ exponente+" es "+resultado );
	}
}