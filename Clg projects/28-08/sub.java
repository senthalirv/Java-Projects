import java.time.*;
import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LocalDate d1=LocalDate.of(2000, 1, 1);LocalDate d2=LocalDate.of(2000, 1, 31);
        Period valid = Period.between(d1,d2);

        //System.out.println("Validity Date: "+valid.getDays());

        System.out.println("Enter Entry Date: ");int dd=s.nextInt();int mm=s.nextInt();int yy=s.nextInt();
        LocalDate ed=LocalDate.of(yy, mm, dd);
        System.out.println("Day is: "+ed.getDayOfMonth());
        //LocalDate exd= ed+valid;
        System.out.println("Expiry date: ");
    }
}
