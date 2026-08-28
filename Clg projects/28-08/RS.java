//import java.util.Scanner;

public class RS {
 //private:
         int rno;
         int dd;

    //public:
    //Scanner s=new Scanner(System.in);
            RS(int r,int d)
            {
                //if(d<0) {System.out.println("Negative number. cannot accept."); return;}
                       rno=r;
                        dd=d;
             }
             boolean overdue()
             {
                if(dd>60)
                    {
                        //System.out.println("Overdue");
                        return true;
                    }
                else
                    {
                        //System.out.println("Not Overdue");
                        return false;
                    }
             }

             void fine(int od)
             {
                if(overdue())
                    {
                        if(od<30)
                            System.out.println("Fine is: $"+(od*10));
                        //else if(od>10&&od<35)
                            //System.out.println("Fine is: $"+(od*10));
                        else
                            System.out.println("Fine is: $"+(od*15));
                    }
                else
                    System.out.println("No Overdue");
             }
}
