import java.util.Scanner;

public class mateven {
    public static void main(String[] args) {
        int s1,s2;
        Scanner s=new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        s1=s.nextInt();
        System.out.print("\nEnter size of array 2: ");
        s2=s.nextInt();

        int a[]=new int[s1];
        int b[]=new int[s2];
        int c[]=new int[100];

        for(int i=0;i<s1;i++)
            {
                System.out.print("\nEnter element "+(i+1)+" for array 1: ");
                a[i]=s.nextInt();
            }

        for(int i=0;i<s2;i++)
                {
                    System.out.print("\nEnter element "+(i+1)+" for array 2: ");
                    b[i]=s.nextInt();
                }


        int k=0;
        for(int i=0;i<s1;i++)
            {
                if((a[i]%2)==0)
                    {
                        c[k]=a[i];
                        k++;
                    }
            }

            for(int i=0;i<s2;i++)
                {
                    if((b[i]%2)==0)
                        {
                            c[k]=b[i];
                            k++;
                        }
                }

                k--;
                System.out.println("Array of even values: ");
            for(int i=0;i<k;i++)
                {
                    System.out.print(c[i]+" ");
                }
                s.close();
    }
}
