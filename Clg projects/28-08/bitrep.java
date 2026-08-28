public class bitrep {
    public static void main(String[] args) {
        int a[]={2,4,3,2,3};
        int ans=0;
        for(int i:a)
            {
                ans^=i;
            }
            System.out.println("Single element: "+ans);
    }
}
