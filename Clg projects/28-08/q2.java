
import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidHeightException extends Exception
{
    InvalidHeightException(String message)
    {
        super(message);
    }
    public String tostring()
    {
        return("Invalid Height Exception raised");
    }
}

public class q2 {
    /*int checkunit(int arr[],int n)
    {
        
            return count;
    }*/

    public static void main(String[] args) {
        int build[]=new int[20];
        int bn;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter number of buildings (max = 20): ");bn=s.nextInt(); 
        try
        {
            if(bn>20)
                throw new ArrayIndexOutOfBoundsException();
            if(bn<0)
                throw new NegativeArraySizeException();
            if(('1'<=bn&&bn>='9'))
                throw new InputMismatchException();
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Out of Bound Exception raised ");
            return;
        }
        catch (NegativeArraySizeException nae) 
        {
            System.out.println("Negative Array Size Exception raised ");
            return;
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Input Mismatch Exception raised");
            return;
        }
        
        for(int i=0;i<bn;i++)
        {
                System.out.println("Enter building ["+(i+1)+"] height: ");
                build[i]=s.nextInt();
        }
        try{
        for(int i=0;i<bn;i++)
            {
                if(build[i]<0)
                    {
                        throw new InvalidHeightException("InvalidHeightException");
                    }}
        }
                catch(InvalidHeightException ae)
                {
                    System.out.println(ae);
                }
                int count=0;
        for(int i=0;i<bn;i+=2)
            {
                int min=0;
                if(build[i]>build[i+2])
                    {
                        min+=build[i+2];
                    }
                else if(build[i]<build[i+2])
                    {
                        min+=build[i];
                    }
                if(build[i]==build[i+2])
                    {
                        count=count+(build[i]-build[i+1]);
                    }
                else if(build[i+2]<build[i+1])
                    {
                        continue;
                    }
                else
                    count=count+(min=build[i+1]);

            }

            System.out.println("Units is: "+count);
            }
            
        
        


            
    }

