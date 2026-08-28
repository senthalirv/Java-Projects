import java.util.Scanner;

class CreditLimitException extends Exception
{
    CreditLimitException(String message)
    {
        super(message);
    }
    public String tostring()
    {
        return("Credit Exception raised");
    }
}
public class q1
{
    static void withdraw(int amount) throws CreditLimitException
    {
        if(amount>10000)
            {
                //CreditLimitException ae = new CreditLimitException("Credit Exception Raised");
                throw new CreditLimitException("Credit Exception Raised");
            }
        else
            System.out.println("Withdraw amount: "+amount);
    }
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter amount: ");
        a=s.nextInt();
        try{
            withdraw(a);
        }
        catch(CreditLimitException ae)
        {
            System.out.println(ae);
        }
    }
}