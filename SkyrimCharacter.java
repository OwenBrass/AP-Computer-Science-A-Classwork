
public class SkyrimCharacter
{
    //instance variables are the adjectives to describe your object
    private String race;
    private String name;
    private double height;
    private String charClass;
    
    // constructor definition
    public SkyrimCharacter(String charRace, String charName, double charHeight, String characterClass)
    {
        race = charRace;
        name = charName;
        height = charHeight;
        charClass = characterClass;
    }
    //mutator method for changing private data
    public void setRace(String r)
    {
        race = r;
        
    }
    //accessor method for accessing the private data
    public String getRace()
    {
        return race;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    
    public void setHeight(double h)
    {
        height = h;
    }
    public double getHeight()
    {
        return height;
    }
    
    public void setCharClass(String c)
    {
        charClass = c;
    }
    public String getCharClass()
    {
        return charClass;
    }
}
