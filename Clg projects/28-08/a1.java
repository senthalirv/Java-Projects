import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int n;
        System.out.println("Enter n (size of array)");
        n=sc.nextInt();
        int a[];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter val");
            a[i]=sc.nextInt();
        }
        int occ;
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                    if(a[i]==a[j])
                    {
                            occ++;
                            break;
                    }
            }
        }

    }
}
