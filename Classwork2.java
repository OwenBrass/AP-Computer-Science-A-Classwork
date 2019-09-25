import java.util.Scanner;
/**
 * Write a description of class Classwork2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classwork2
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
        System.out.println("Welcome to the Spring Calculator");
        System.out.println("Enter spring constant:");
        
        double userInputK = mySpecialScan.nextDouble();
        
        System.out.println("Enter deflection:");
        
        double userInputX = mySpecialScan.nextDouble();
        
        double forceExerted = (userInputK)*(userInputX);
        
        double elasticPotentialEnergy = (1/2.0)*(userInputK)*Math.pow(userInputX,2);
        
        System.out.println("Force exerted: " + forceExerted);
        
        System.out.println("Elastic potential energy: " + elasticPotentialEnergy);
        
        System.out.println("Enter mass undergoing harmonic motion: ");
        
        double userInputM = mySpecialScan.nextDouble();
        
        double frequency = (1/(2.0*3.141594))*Math.sqrt((userInputK)/(userInputM));
        
        double period = 1/(frequency);
        
        System.out.println("Frequency: " + frequency);
        System.out.println("Period: " + period);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Do you love springs?");
        String userInput = input.nextLine();
        if (userInput.equals("Yes")){
            System.out.println("Congratulations! You will be a mechanical engineer.");
        }else{
            System.out.println("You will not be a mechanical engineer. Goodbye.");
        }      
      
        
        
        //EXAMPLE 2 DONE
        
        //EXAMPLE 3
        
        
  
    }
    
} 

