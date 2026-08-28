import java.time.*;
import java.util.Scanner;

class emp
{
    int ID; String name; LocalTime in,out;
    Scanner s=new Scanner(System.in);

    void info()
    {
        System.out.print("Enter ID:");ID=s.nextInt();
        System.out.print("Enter Name:");name=s.next();
    }
    void login()
    {
        System.out.print("Enter login time: ");
        int h=s.nextInt();int m=s.nextInt();int ss=s.nextInt();
        in=LocalTime.of(h,m,ss);
    }
    void logout()
    {
        System.out.print("Enter logout time: ");
        int h=s.nextInt();int m=s.nextInt();int ss=s.nextInt();
        out=LocalTime.of(h,m,ss);
    }
    void check()
    {
        Duration p=Duration.between(in, out);
        LocalTime t=LocalTime.of(8, 0, 0);
        if(p.toHours()<t.getHour())
        {
            System.out.print("Attendance not sufficient!!");
        }
        else
            System.out.print("Attendance sufficient!!");
    }
}
public class att
{
    public static void main(String[] args)
    {
        emp e=new emp();int ch;Scanner s=new Scanner(System.in);int i=0;
        
        do{
            //System.out.println("ATTENDANCE CHECKER:\n\t1.Enter Info\n\t2.LogIn\n\t3.LogOut\n\t4.Check Attendance\n\t5.Exit");
            System.out.println("ATTENDANCE CHECKER:\n\t1.Enter Info\n\t2.LogIn\n\t3.LogOut\n\t4.Check Attendance\n\t5.Exit");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    e.info();
                    i++;
                    break;
                case 2:
                    System.out.print("Enter ID: ");int id=s.nextInt();
                    for(int j=0;j<=i;j++)
                    /*{
                        /*if(e[j].ID==id)
                        {
                            e[j].login();break;
                        }
                    }*/e.login();break;
                case 3:
                    System.out.print("Enter ID: ");int id2=s.nextInt();
                    /*for(int j=0;j<=i;j++)
                    {
                        /*if(e[j].ID==id2)
                        {
                            e[j].logout();break;
                        }
                    }*/e.logout();break;
                case 4:
                    System.out.print("Enter ID: ");int id3=s.nextInt();
                    /*for(int j=0;j<=i;j++)
                    {
                        if(e[j].ID==id3)
                        {
                            e[j].check();break;
                        }
                    }*/e.check();break;
                default:
                     System.out.print("INVALID");
            }
        }while(ch!=5);
    }
}