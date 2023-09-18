import java.util.Scanner;
public class Druid
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        double autoattack = (Math.floor(Math.random() * 5 + 5));
        boolean catForm = false;
        boolean bearForm = false;
        boolean travelForm = false;

        System.out.println("Enter a number to change form (1 = bear-, 2 = cat-, 3 = travelform: ");
        int choice = scan.nextInt();
        if(choice == 1)
        {
            catForm = true;

        }
        else if (choice == 2)
        {
            bearForm = true;
        }
        else if (choice == 3)
        {
            travelForm = true;
        }
    }
}



