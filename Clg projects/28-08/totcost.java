
import java.util.Scanner;

public class totcost {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a[][]={{11,35,12},{14,45,18}};
        String g[]={"women","men"};
        int cost[][]={{2000},{100},{1000}};
        int bill[][]=new int[2][1];

        for(int i=0;i<2;i++)
            {
                for(int j=0;j<1;j++)
                    {
                        bill[i][j]=0;
                        for(int k=0;k<3;k++)
                            {
                                bill[i][j]+=(a[i][k]*cost[k][j]);
                            }
                    }
            }

        for(int i=0;i<2;i++)
            {
                for(int j=0;j<1;j++)
                    {
                        System.out.println(g[i]+" = "+bill[i][j]);
                    }
            }
            s.close();
    }
}
