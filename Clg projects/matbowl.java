public class matbowl {
    public static void main(String[] args) {

        int a[][] = {
                {2,5},
                {4,3},
                {3,7},
                {5,8},
                {9,6},
                {11,11}
        };

       
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j][0] > a[j+1][0]){
                    int t1=a[j][0];
                    int t2=a[j][1];

                    a[j][0]=a[j+1][0];
                    a[j][1]=a[j+1][1];

                    a[j+1][0]=t1;
                    a[j+1][1]=t2;
                }
            }
        }

        int count=1;
        int last=0;

        for(int i=1;i<a.length;i++){
            if(a[i][0]>a[last][0] && a[i][1]>a[last][1]){
                count++;
                last=i;
            }
        }

        System.out.println("Maximum number of bowls: "+count);
    }
}