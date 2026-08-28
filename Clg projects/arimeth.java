public class arimeth
{
    public static void main(String[] args)
    {
        byte b=127;
        short s=300;
        int i=1000;
        long l=10000;
        float f=3.14f;
        double d=2.71828;

        System.out.println("Byte value: "+b);
        System.out.println("Short value: "+s);
        System.out.println("Integer value: "+i);
        System.out.println("Long value: "+l);  
        System.out.println("Float value: "+f);
        System.out.println("Double value: "+d);

        System.out.println("Arithmetic Operations:");
        System.out.println("Addition i+s: "+(i+s));
        System.out.println("The data type of the result of addition is: Integer");
        System.out.println("Subtraction l-i: "+(l-i));
        System.out.println("The data type of the result of subtraction is: Long");
        System.out.println("Multiplication f*d: "+(f*d));
        System.out.println("The data type of the result of multiplication is: Float");
        System.out.println("Division d/f: "+(d/f));
        System.out.println("The data type of the result of division is: Double");
    }
}