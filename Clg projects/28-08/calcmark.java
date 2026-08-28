
import java.util.Scanner;


class stud
{
    protected int rno;
    //protected int sub[][]=new int[3][4];

    public stud(int r)
    {
        rno=r;
    }
    
    double cmark()
    {return 0;}

    //double cmark(int a1,int a2,int ca,int ese)
    //{return 0;}

    
}
class fulltime extends stud
{

    public fulltime(int r)
    {
        super(r);
    }
    Scanner s=new Scanner(System.in);
    protected int sub[][]=new int[3][4];
    double cmark(/*int a1,int a2, int ca,int ese*/)
    {
        System.out.print("Enter subject code: ");
        int x=s.nextInt();
        x--;
        return ((0.20*sub[x][0])+(0.20*sub[x][1])+(0.20*sub[x][2])+(0.40*sub[x][3]));
    }

    public void gmark(/*int a1,int a2,int ca,int ese*/)
    {
        //System.out.print("Enter mark for subject 1: ");
        for(int i=0;i<3;i++)
            {
                System.out.print("Enter mark for subject "+(i+1)+": ");
                for(int j=0;j<4;j++)
                    {
                        sub[i][j]=s.nextInt();
                    }
            }
    }
}


class parttime extends stud
{

    public parttime(int r)
    {
        super(r);
    }
    Scanner s=new Scanner(System.in);
    protected int sub[][]=new int[3][3];
    double cmark()
    {
        System.out.print("Enter subject code: ");
        int x=s.nextInt();
        x--;
        return ((0.20*sub[x][0])+(0.40*sub[x][1])+(0.40*sub[x][2]));
    }

    public void gmark()
    {
        
        for(int i=0;i<3;i++)
            {
                System.out.print("Enter mark for subject "+(i+1)+": ");
                for(int j=0;j<3;j++)
                    {
                        sub[i][j]=s.nextInt();
                    }//System.out.print("Enter mark for subject "+i+": ");
            }
    }

    public void display(parttime P)
    {
        System.out.println("Student details for "+P.rno+":\n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                {
                    double x=P.cmark();
                    System.out.println(x);
                }
            
        }
        
        
    }
}
public class calcmark {
    
    public static void main(String[] args) {

        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Catagory:\n1.Part time\n2.Full time\n");
        int ch=s.nextInt();
        int n;
        System.out.println("Enter size: ");
        n=s.nextInt();
        
        parttime[] pt = new parttime[n];
        fulltime[] ft = new fulltime[n];
        double x;
        switch(ch)
        {
            
            case 1:
                for(int i=0;i<n;i++)
                    {
                        System.out.println("Enter roll number for student "+(i+1)+": ");
                        int rr=s.nextInt();
                        pt[i]=new parttime(rr);
                    }
                        /*pt[0].gmark();
                        x= pt[0].cmark();
                        System.out.print(x);*/
                        break;

            case 2:
                
            for(int i=0;i<n;i++)
                {
                    System.out.println("Enter roll number for student "+(i+1)+": ");
                    int rr=s.nextInt();
                    ft[i]=new fulltime(rr);
                }
                /*ft[0].gmark();
                x= ft[0].cmark();
                System.out.print(x);*/

                /*System.out.print("\nEnter roll number to see grade: ");
                int rr2=s.nextInt();
                for(int i=0;i<n;i++)
                    {
                        if(s[i].rno==rr2)
                            {

                            }
                    }*/
                break;
        }
       

    }
}
