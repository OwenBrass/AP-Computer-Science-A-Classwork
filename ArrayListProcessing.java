import java.util.*;
public class ArrayListProcessing
{
    public static void main(String[] args)
    {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Softball");
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Soccer");
        sports.add("Skiing");
        sports.add("Rowing");
        //printElements(sports);
        //insertElement(sports,"Football");
        //System.out.println(returnElement(sports, 3));
        //removeThirdElement(sports);
        //System.out.println(searchForElement(sports,"Soccer"));
        //System.out.println(searchAndCountElement(sports,"Soccer"));
        //printElements(copyAndReturnList(sports));
        //reverseElements(sports);
        //shuffleElements(sports);
    }
    
    // Number 1
    public static void printElements(ArrayList<String> in)
    {
        for(int i=0; i<in.size(); i++){
            System.out.println(in.get(i));
        }
    }
    
    //Number 2
    public static void insertElement(ArrayList<String> in, String a)
    {
        in.add(0, a);
        printElements(in);
    }
    
    //Number 3
    public static String returnElement(ArrayList<String> in, int i)
    {
        return in.get(i);
    }
    
    //Number 4
    public static void removeThirdElement(ArrayList<String> in)
    {
        in.remove(2);
        printElements(in);
    }
    
    //Number 5
    public static int searchForElement(ArrayList<String> in, String a)
    {
        int location = 0;
        for(int i=0; i<in.size(); i++){
            if (in.get(i).equals(a)){
                location = i;
                i=in.size();
            }
        }
        return location;
    }
    
    //Number 6
    public static int searchAndCountElement(ArrayList<String> in, String a)
    {
        int count = 0;
        for(int i=0; i<in.size(); i++){
            if (in.get(i).equals(a)){
                count++;
            }
        }
        return count;
    }
    
    //Number 7
    public static ArrayList<String> copyAndReturnList(ArrayList<String> in)
    {
        ArrayList<String> out = new ArrayList<String>();
        for(int i=0; i<in.size(); i++){
            out.add(in.get(i));
        }
        return out;
    }
    
    //Number 8
    public static void shuffleElements(ArrayList<String> in)
    {
        int location;
        ArrayList<String> out = new ArrayList<String>();
        for(int i=0; i<in.size(); i++){
            location = (int)(i*(Math.random())+0.5);
            out.add(location, in.get(i));
        }
        printElements(out); 
    }
    
    //Number 9
    public static void reverseElements(ArrayList<String> in)
    {
        ArrayList<String> out = new ArrayList<String>();
        for(int i=0; i<in.size(); i++){
            out.add(in.get(in.size()-1-i));
        }
        printElements(out);
    }
}
