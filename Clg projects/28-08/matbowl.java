public class matbowl {
    public static void main(String[] args) {
        int a[][]={{2,5},{4,3},{3,7},{5,8},{9,6},{11,11}};
        
        int c=0;
        for(int i=1;i<a.length;i++)
            {
                for(int j=1;j<a[i].length;j++)
                    {
                        if((a[i][j]<a[i+1][j])&&(a[i][j]<a[i][j+1]))
                            {
                                c++;
                            }
                    }
            }

            System.out.println(c);
    }
}
