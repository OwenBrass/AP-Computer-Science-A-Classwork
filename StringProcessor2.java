
public class StringProcessor2
{
    public static String withoutEnds(String str)
    {
      return str.substring(1,str.length()-1);
        
    }
    public static String front2(String str)
    {
       return str.substring(str.length()-2, str.length())+str.substring(0,str.length()-2);  
    }
    public static String firstFour(String str)
    {
        if(str.length()==3)
            return str + "#";
        else if (str.length()==2)
            return str + "##";
        else if (str.length()==1)
            return str + "###";
        else if (str.length()==0)
            return str + "####";
        else
            return str.substring(0,4);
    }
    public static boolean frontAgain(String str)
    {
       if(str.substring(0,2).toLowerCase().equals(str.substring(str.length()-2,str.length()).toLowerCase()))
          return true;
       else
          return false;
    }
}
