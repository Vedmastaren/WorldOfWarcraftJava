package WorldOfWarcraftJava.src;/*
1. Välja olika klasser
    Warrior
    Paladin
    Priest
    Mage
    Rogue
    Warlock
    Druid
    Hunter
    Shaman

2. Olika krafter för olika klasser
3. Olika fiender
4. Använda olika vapen (klasser kan bar använda en specifik sorts vapen)
 */

public class Main
{
    public static void main(String[] args)
    {
        System.out.println((Math.floor(Math.random() * 35) + 15));



        boolean runProgram = true;
        while(runProgram)
        {

            //Input från användaren = choice
            String choice = "";

            switch (choice)
            {
                case "1": //Warrior

                    break;

                case "2": //Paladin

                    break;

                case "3": //Priest

                    break;

                case "4": //Druid

                    break;

                case "5": //Warlock

                    break;

                case "6": //Hunter

                    break;

                case "7": //Rogue

                    break;

                case "8": //Mage

                    break;

                case "9": //Shaman

                    break;

                case "10":

                    runProgram = false;

                    break;
                default:
                    break;


            }
        }
    }
}