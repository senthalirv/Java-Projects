
import java.util.Scanner;

public class matadd {
    public static void main(String[] args) {
        int m,n;
        Scanner S=new Scanner (System.in);
        System.out.print("Enter row: ");
        m=S.nextInt();
        System.out.print("\nEnter col: ");
        n=S.nextInt();

        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];

        for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    {
                        System.out.print("\nEnter for ["+i+"]["+j+"] : ");
                        a[i][j]=S.nextInt();
                    }
            }

            for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            System.out.print("\nEnter for ["+i+1+"]["+j+1+"] : ");
                            b[i][j]=S.nextInt();
                        }
                }

                System.out.println();


                for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                            {
                                c[i][j]=a[i][j]+b[i][j];
                            }
                    }

                    System.out.println("Sum: ");

                    for(int i=0;i<m;i++)
                        {
                            for(int j=0;j<n;j++)
                                {
                                    System.out.print(c[i][j]+" ");
                                }
                                System.out.println();

                        }
                        S.close();
    }
}
