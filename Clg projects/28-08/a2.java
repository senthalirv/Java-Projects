import java.util.Scanner;

public class a2 {
   public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of array 1 (entry): ");
        n1=sc.nextInt();
        System.out.print("\nEnter size of array 2 (exit): ");
        n2=sc.nextInt();

        int entry[]=new int[n1];
        int exit[]=new int[n2];
        int c[]=new int[100];

        for(int i=0;i<n1;i++)
            {
                System.out.println("\nEnter element for entry");
                entry[i]=sc.nextInt();
            }

        for(int i=0;i<n2;i++)
                {
                    System.out.println("\nEnter element for exit");
                    exit[i]=sc.nextInt();
                }
        int k = 0;
        for(int i =0;i<n1;i++)
            {
                int flag = 0;
                for(int j = 0;j<n2;j++)
                    {
                        if(entry[i]==exit[j])
                            {
                                flag = 1;
                                break;
                            }
                    }
                    if(flag==0)
                        {
                            c[k]=entry[i];
                            k++;
                        }
                    
            }
        // there in entry, not in exit
        System.out.println("entried, not exited");
        for(int i =0;i<k; i++)
            {
                System.out.println(c[i]);
            }
        // exited not entry
        int l = k;
        for(int j = 0;j<n2;j++)
            {
                int flag = 0;
                for(int i = 0;i<n1;i++)
                    {
                        if(exit[j]==entry[i])
                            {
                                flag = 1;
                                break;
                            }
                    }
                if(flag==0)
                {
                    c[l]=exit[j];
                    l++;
                }
                    
            }
        System.out.println("exited, not entried");

        for(int i = k;i<l;i++)
            {
                System.out.println(c[i]);
            }
   }
}
