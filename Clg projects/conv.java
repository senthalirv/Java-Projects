public class conv
{
	public static void main(String[] args)
	{
		byte b = 127;
		int i;

		float f;
		double d;
		char c;

		i=b;
		System.out.println("here:"+i);

		f=i;
		System.out.println("here:"+f);

		d=f;
		System.out.println("here:"+d);

		i=(int)d;//explicit
		System.out.println("here:"+i);

		c=(char) i;//explicit
		System.out.println("here:"+c);
	}
}