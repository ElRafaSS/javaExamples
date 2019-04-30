import java.util.*;
public class LowerToUpper
{
	public static void main( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		LowerToUpperClass changeString = new LowerToUpperClass();
		String miString;
		String upperString;
		
		
		System.out.println("\nIntroduce una cadena de texto:\n");
		miString = scan.nextLine();
		
		upperString = changeString.processString( miString );
		
		System.out.println("\n-> "+upperString);
	}
}