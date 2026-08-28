import java.util.Scanner;

abstract class room
{
    String name;
    String category;
    final int id;
    final static int tax = 12;
    int bill;
    static int no_booking;

    room(int id)
    {
        this.id=id;
    } 

    abstract int charges();

    void display()
    {
        System.out.println("name: "+name);
        System.out.println("category:"+category);
        System.out.println("Booking id: "+id);
        System.out.println("No of booking: " + no_booking);
        System.out.println("bill amount: "+ bill);
    }
}

class standard extends room
{
    standard(int id)
    {
        super(id);
    }
    int charges()
    {
        int bill = 10000;
        no_booking++;
        super.display();
        return bill;
    }
}

class deluxe extends room
{
    deluxe(int id)
    {
        super(id);
    }
    int charges()
    {
        int bill = 20000;
        no_booking++;
        super.display();
        return bill;
    }
}

class suite extends room
{
    suite(int id)
    {
        super(id);
    }
    int charges()
    {
        int bill = 30000 + ((tax/100)*30000);
        no_booking++;
        super.display();
        return bill;
    }
}

public class Demo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        standard std = new standard(303);
        deluxe d = new deluxe(101);
        suite s = new suite(201);
        int ch;
        do 
        { 
            System.out.println("1. standard rooms");
            System.out.println("2. Deluxe");
            System.out.println("3. Luxury");
            System.out.println("0. exit");
            System.out.println("enter category");
            ch = sc.nextInt();
            if(ch==0)
                break;
            else if(ch == 1)
            {
                //System.out.println("enter name: ");
                // name = sc.next();
                // System.out.println("category: standard");
                std.charges();
                std.display();
            }
            else if(ch== 2)
            {
                d.charges();
            }
            else if(ch==3)
            {
                s.charges();
            }
            else
            {
                System.out.println("Invalid input");
            }
            System.out.println("enter choice: ");
        } while (ch<3);
        sc.close();
    }
}