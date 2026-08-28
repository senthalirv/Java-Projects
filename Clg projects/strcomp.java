
import java.util.Scanner;

public class strcomp {
    public static void main(String[] args) {

        int q,p;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no. people participating in quiz: ");
        q=s.nextInt();

        System.out.print("\nEnter no. people participating in quiz: ");
        p=s.nextInt();
        s.nextLine(); //for buffer issue

        String quiz[]=new String[q];
        String pp[]=new String[p];

        for(int i=0;i<q;i++)
            {
                System.out.print("\nEnter name "+(i+1)+" for quiz: ");
                quiz[i]=s.nextLine();
            }

        for(int i=0;i<p;i++)
            {
                    System.out.print("\nEnter name "+(i+1)+" for paper presentation: ");
                    pp[i]=s.nextLine();
                }


                System.out.println("The common names: ");
        for(int i=0;i<q;i++)
            {
                for(int j=0;j<p;j++)
                    {
                        if(quiz[i].equalsIgnoreCase(pp[j]))
                            {
                                System.out.println(quiz[i]);
                            }
                    }
            }
            s.close();
    }
    
}
