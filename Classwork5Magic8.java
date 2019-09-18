import java.util.Scanner;
public class Classwork5Magic8
{
    public static void main(String[] args)
    {
    /*   EXERCISE 3  
     *  System.out.println("Ask me a question.");
           Scanner question = new Scanner (System.in);
           String userQuestion = question.nextLine();
           double randNum = (int)(Math.random()*7)+1;
        if (randNum == 1)
        {System.out.println("Yes.");}
        else if (randNum == 2)
        {System.out.println("No.");}
        else if (randNum == 3)
        {System.out.println("Ask again later.");}
        else if (randNum == 4)
        {System.out.println("That's an inappropriate question.");}
        else if (randNum == 5)
        {System.out.println("I don't know.  You should probably look it up.");}
        else if (randNum == 6)
        {System.out.println("The probability of that occurring is very low.");}
        else if (randNum == 7)
        {System.out.println("Go ask someone else.");}
        */
       
       
       
       //EXERCISE 4
      /* System.out.println("How many sides do you want your dice to have?");
       Scanner sides = new Scanner (System.in);
       double numSides = sides.nextDouble();
       double randNum = (int)(Math.random()*(numSides))+1;
       if (numSides == 0 || numSides < 0)
       {System.out.println("Invalid entry");}
       else
       {System.out.println("Your program just rolled a " + randNum);}
       */
      
      
      //EXERCISE 5
      System.out.println("Welcome to the electron locator");
      System.out.println("What is the atomic number of the element in question?");
      Scanner element = new Scanner (System.in);
      double atomNum = element.nextDouble();
      double randNum = (int)(Math.random()*atomNum)+1;
      if (atomNum == 0 || atomNum < 0)
      {System.out.println("Invalid entry");}
      else if (randNum <= 2)
      {System.out.println("You have located an electron in the 1s orbital.");}
      else if (randNum > 2 && randNum <= 4)
      {System.out.println("You have located an electron in the 2s orbital.");}
      else if (randNum > 4 && randNum <= 8)
      {System.out.println("You have located an electron in the 2p orbital.");}
      else if (randNum > 8 && randNum <= 10)
      {System.out.println("You have located an electron in the 3s orbital.");}
}
}
