public class faculty {
 //private:
 int rno;
 int dd;

//public:
    faculty(int r,int d)
    {
        //if(d<0) {System.out.println("Negative number. cannot accept."); return;}
               rno=r;
                dd=d;
     }
     boolean overdue()
     {
        if(dd>180)
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
                
                    System.out.println("Fine is: $"+(od*15));
            }
        else
            System.out.println("No Overdue");
     }
    }