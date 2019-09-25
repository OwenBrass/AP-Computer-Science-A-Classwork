import java.util.Scanner;
public class Classwork4 //class header
{ //need curly brackets, everything inside is part of the class
        public static void main(String[] args) //method header, keyword is sometimes "void"
        {
            Scanner name = new Scanner (System.in);
            System.out.println("What's your name?");
            String userName = name.nextLine();
            if (userName.equals("Aragorn son of Arathorn") || userName.equals("Gimli son of Gloin"))
                System.out.println("You are awesome");
            else if (userName.equals("Witch King of Angmar")|| userName.equals("Sauron"))
                System.out.println("You are evil, but still awesome");
            else
                System.out.println("You are pretty cool, but you would be cooler if you were a character from the Lord of the Rings.");
                
}
}