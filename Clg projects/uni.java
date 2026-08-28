import java.util.Scanner;
public class uni
{
	public static void main(String[] args)
	{
		Scanner S= new Scanner(System.in);
		char c=S.next().charAt(0);
		int i;

		i=c;
		System.out.println("Unicode value: "+i);
		
		i=i+5;
		c=(char)i;
		System.out.println("Resulting Character: "+c);		
	}
}