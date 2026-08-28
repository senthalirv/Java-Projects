public class powotwo {
    public static void main(String[] args) {
        int n=5;
        if (n>0 && (n&(n-1))==0)
            System.out.println(n+" is power of two");
        else
            System.out.println(n+" is not power of two");
    }
}
