import java.util.Scanner;

public class PG {
     //private:
         int rno;
         int dd;

    //public:
    Scanner s=new Scanner(System.in);
            PG()
            {
                
                System.out.println("Enter Rollnumber and Due date: ");
                       rno=s.nextInt();
                        dd=s.nextInt();if(dd<0) {System.out.println("Negative number. cannot accept."); return;}
            }
            boolean overdue()
             {
                if(dd>30)
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
