import java.util.Scanner;
public class Classwork5
{
    public static void main(String[] args)
    {
        for(int i=0; i < 50; i += 1)
        {
           double randNum = (int)(Math.random()*6)+1;
           double secRandNum = (int)(Math.random()*6)+1;
           double sumRandNum = randNum + secRandNum;
           System.out.println("You just rolled a sum of: " + sumRandNum);
           //System.out.println(randNum); 
           //Math.random can output zero, can never output 1 (i.e. from 0 to 0.9999999...)
           //System.out.println("You just rolled a: " + randNum);
        if (sumRandNum == 7 || sumRandNum == 11)
        {System.out.println("You win!");}
        else if (sumRandNum == 2 || sumRandNum == 3 || sumRandNum == 12)
        {System.out.println("You lose!");}
        else
        {System.out.println("Keep playing!");}
    }
}
}
