
public class Classwork7
{
      public static void main(String[] args) //void means no return statement needed
      {
          System.out.println(findSum(2,3));
          System.out.println(canIVote(17));
          System.out.println(iCanVote(19));
          System.out.println(outputDerivative("x^3", 12));
          //"calling" the methods
      }
      
      public static double findSum(int a, int b) //public static type returned name(given)
      {
          return a+b;
      }
      
      public static String canIVote(int age)
      {
          if (age >= 18)
            return "You can vote!";
          else
            return "You can't vote!";
      }
      
      public static boolean iCanVote(int age)
      {
          if (age>=18)
            return true;
          else
            return false;
      }
      
      public static double outputDerivative(String inputFunction, double inputValue)
      {
          if (inputFunction == "x^2")
            return 2*inputValue;
          else if (inputFunction == "x^3")
            return 3*Math.pow(inputValue, 2);
          else if (inputFunction == "x^4")
            return 4*Math.pow(inputValue, 3);
          else
            return 0;
       }
}
