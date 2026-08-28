public class bitswap
{
    public static void main(String[] args)
    {
        int a=2;int b=3;

        System.out.println("Before: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);


    }
}