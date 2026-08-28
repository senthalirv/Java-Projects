public class termax {
    public static void main(String[] args) {
        int a=10;int b=20;int c=5;
        System.out.println("Numbers are: "+a+" "+b+" "+c);
        int max=a>b?a:b;
        max=max>c?max:c;
        System.out.println("Maximum is: "+max);
    }
}
