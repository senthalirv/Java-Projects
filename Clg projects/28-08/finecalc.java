
import java.util.Scanner;

public class finecalc {
public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    int ugsize;int pgsize;int rssize;int facsize;

    int ch;
    System.out.println("Enter Category \n1.UG\n2.PG\n3.Research Scholars\n4.Faculty");
    ch=s.nextInt();
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println();
    switch(ch)
    {
    case 1:
        System.out.print("Enter size of UG students: ");
        ugsize=s.nextInt();

        UG ugs[]=new UG[ugsize];int nr,nd;
        System.out.println("Enter roll number and due date of each student: ");
        for(int i=0;i<ugsize;i++)
            {
                nr=s.nextInt();
                nd=s.nextInt();
                if(nd<0) {System.out.println("Negative number. cannot accept."); return;}

                ugs[i]=new UG(nr,nd);
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            char ch2;
            System.out.print("Do you want to check overdue? (Y/N)");
            ch2=s.next().charAt(0);
            
            if(ch2=='Y'||ch2=='y')
                {
                    System.out.println("Enter Rollnumber: ");
                    int n=s.nextInt();
                    for(int i=0;i<ugsize;i++)
                        {
                            if(n==(ugs[i].rno))
                                {
                                    ugs[i].fine(((ugs[i].dd)-15));
                                }
                        }
                }
                else
                    {//ugs[0].fine(((ugs[0].dd)-15));
                    break;}
                    break;

    case 2:
        System.out.print("Enter size of PG students: ");
        pgsize=s.nextInt();

        PG pgs[]=new PG[pgsize];//int pr,pd;
        //System.out.println("Enter roll number and due date of each student: ");
        for(int i=0;i<pgsize;i++)
            {
                pgs[i]=new PG();
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            char ch3;
            System.out.print("Do you want to check overdue? (Y/N)");
            ch3=s.next().charAt(0);
            
            if(ch3=='Y'||ch3=='y')
                {
                    System.out.println("Enter Rollnumber: ");
                    int n=s.nextInt();
                    for(int i=0;i<pgsize;i++)
                        {
                            if(n==(pgs[i].rno))
                                {
                                    pgs[i].fine(((pgs[i].dd)-30));
                                }
                        }
                }
                else
                    {//ugs[0].fine(((ugs[0].dd)-15));
                    break;}
                    break;
    
    case 3:
        System.out.print("Enter size of scholars: ");
        rssize=s.nextInt();

        RS rs[]=new RS[rssize];int rr,rd;
        System.out.println("Enter roll number and due date of each scholar: ");
        for(int i=0;i<rssize;i++)
            {
                rr=s.nextInt();
                rd=s.nextInt();
                if(rd<0) {System.out.println("Negative number. cannot accept."); return;}

                rs[i]=new RS(rr,rd);
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            char ch4;
            System.out.print("Do you want to check overdue? (Y/N)");
            ch4=s.next().charAt(0);
            
            if(ch4=='Y'||ch4=='y')
                {
                    System.out.println("Enter Rollnumber: ");
                    int n=s.nextInt();
                    for(int i=0;i<rssize;i++)
                        {
                            if(n==(rs[i].rno))
                                {
                                    rs[i].fine(((rs[i].dd)-60));
                                }
                        }
                }
                else
                    {//ugs[0].fine(((ugs[0].dd)-15));
                    break;}
                    break;
    
    case 4:
        System.out.print("Enter size of Faculty: ");
        facsize=s.nextInt();

        faculty fs[]=new faculty[facsize];int fr,fd;
        System.out.println("Enter roll number and due date of each memeber: ");
        for(int i=0;i<facsize;i++)
            {
                fr=s.nextInt();
                fd=s.nextInt();
                if(fd<0) {System.out.println("Negative number. cannot accept."); return;}

                fs[i]=new faculty(fr,fd);
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            char ch5;
            System.out.print("Do you want to check overdue? (Y/N)");
            ch5=s.next().charAt(0);
            
            if(ch5=='Y'||ch5=='y')
                {
                    System.out.println("Enter Rollnumber: ");
                    int n=s.nextInt();
                    for(int i=0;i<facsize;i++)
                        {
                            if(n==(fs[i].rno))
                                {
                                    fs[i].fine(((fs[i].dd)-180));
                                }
                        }
                }
                else
                    {//ugs[0].fine(((ugs[0].dd)-15));
                    break;}
                    break;

    default:
        System.out.println("Invalid Choice");
        break;
    }
}
}
