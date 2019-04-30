public class LowerToUpperClass
{
    public String processString( String s)
	{
		String texto;
		String textoUpper;
		int lengthS;
		
		lengthS = s.length();
		//System.out.println(lengthS);
		texto = s.substring((lengthS-3),(lengthS-0));
		
		
		textoUpper = texto.toUpperCase();
		
		
	    return textoUpper;
	}

}