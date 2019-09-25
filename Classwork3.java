import java.util.Scanner;
public class Classwork3
{
   public static void main(String[] args)
   {
    /** Objective #1: Write an application to accept a side length for a prism,
        * and output the volume of a cube.
        *
        * Precondition: The user enters a number for the side length, and not a special character or letter
        * Postcondition: The program outputs a volume if the user enters a positive number. If the user
        *       does not enter a positive number, the program responds with "Invalid Input"
        */
    Scanner oneRingToRuleThemAll = new Scanner(System.in);
    
    //System.out.print("Enter the side length of your cube.");
    //double s = oneRingToRuleThemAll.nextDouble();
    //if (s>0)
    //{
     //   double oneRingToFindThem = Math.pow(s,3);
     //   System.out.println("Volume: " + oneRingToFindThem);
    //}
    //else
    //System.out.println("Invalid entry");
    
    

    /** Objective #2: Write an application to solve a quadratic equation, which accepts a, b and c
        * from a user, and outputs one of the solutions to the equation.
        * 
        * Precondition: user enters numbers, no special characters or letters
        * Postcondition: If there are two solutions, program outputs "two solutions."  If there is one solution
        *           the program outputs "one solution."  If there are no solutions, program outputs "no solution"
        */      
       
       System.out.println("Enter a: ");
       double a = oneRingToRuleThemAll.nextDouble();
       
       System.out.println("Enter b: ");
       double b = oneRingToRuleThemAll.nextDouble();
       
       System.out.println("Enter c: ");
       double c = oneRingToRuleThemAll.nextDouble();
       
       double oneRingToBringThemAll = b*b-4*a*c;
       if (oneRingToBringThemAll < 0)
       System.out.println("No real solutions.");
       else if (oneRingToBringThemAll == 0)
       System.out.println("One solution.");
       else
       System.out.println("Two solutions.");
    
    
  
    
    }
}
