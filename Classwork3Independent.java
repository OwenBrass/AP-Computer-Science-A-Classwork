import java.util.Scanner;
/**
 * Write a description of class Classwork2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork3Independent
{
    public static void main(String[] args)
    {
             //Construct a scanner object
        //Scanner mySpecialScan = new Scanner(System.in);
        
        //Give the user a prompt
        //System.out.println("Enter your age:");
        
        //double userInput = mySpecialScan.nextDouble();
        
        //double comparisonData = 36/userInput;
        
        //System.out.println("Ms. Kennedy is " + comparisonData + " times your age.");
       
        //your example: give the user a prompt
        //
        //EXAMPLE 2
        Scanner mySpecialScan = new Scanner(System.in);
        System.out.println("SKYRIM");
        System.out.println("Press A to start");
        Scanner input = new Scanner(System.in);
         String userInput = input.nextLine();
        if (userInput.equals("A")){
            System.out.println("Bethesda Game Studios...");
            System.out.println("...Presents...");
            System.out.println("...The Elder Scrolls V...");
            System.out.println("SKYRIM");
            System.out.println("Hey you, you're finally awake. \nYou were trying to cross the border, right? Same as us. \nAnd that thief over there.");
            System.out.println("Damn you Stormcloaks! Skyrim was fine before you got here.  \nEmpire was nice and lazy.  \nIf it weren't for you, I could have stolen that horse and been halfway to Hammerfell by now.");
            System.out.println("Shut up back there!");
            System.out.println("What's wrong with him, huh?");
            System.out.println("Watch your tongue!  \nYou're speaking to Ulfric Stormcloak, the true High King.");
            System.out.println("The Jarl of Windhelm?  \nYou're the leader of the rebellion. \nBut if they've captured you...oh gods, where are they taking us?");
            System.out.println("I don't know where we're going, but Sovngarde awaits.");
            System.out.println("Name your character: ");
            Scanner name = new Scanner(System.in);
            String userName = name.nextLine();
            System.out.println("Hello, " + userName + ", welcome to Skyrim.");
            System.out.println("Would you like to follow Hadvar or Ralof?");
            Scanner follow = new Scanner(System.in);
            String followHorR = follow.nextLine();
            System.out.println("Congratulations, you have escaped Helgen.");
            System.out.println("Would you like to go to Riverwood or explore the forest?");
            Scanner forest = new Scanner(System.in);
            String forestOrRiverwood = forest.nextLine();
            if (forestOrRiverwood.equals("Riverwood")){
                System.out.println("You have made it safely to Riverwood.");
            }else if (forestOrRiverwood.equals("forest")){
                System.out.println("You have discovered a bandit hideout.  Would you like to attack?");
                Scanner attack = new Scanner(System.in);
                String attackOrNot = attack.nextLine();
                if (attackOrNot.equals("yes")){
                    System.out.println("I'm sorry. You have died in combat.");
                }else if (attackOrNot.equals("no")){
                    System.out.println("The bandits see you running and shoot you with arrow.  You have died in combat");
                }
            }
        }else{
            System.out.println("You have quit the game.");
        }      
        
      
        
        //EXAMPLE 2 DONE
        
        //EXAMPLE 3
        
        
  
    }
    
} 

