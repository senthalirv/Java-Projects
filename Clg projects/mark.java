
import java.util.Scanner;

public class mark
{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        System.out.print("Enter mark: ");
        int m=S.nextInt();

        boolean result=m>=50;

        System.out.println("Student passed: "+result);

        S.close();
    }
}