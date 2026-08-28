
import java.util.Scanner;

public class evenorodd{
    public static boolean iseven(int n)
    {
        return(n&1)==0;
    }
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        

        n=s.nextInt();
        System.out.println();
        if(iseven(n))
            
                System.out.println(n+" is even");
        else
                System.out.println(n+" is odd");
        s.close();
    }
        
}