
/**
 * Write a description of class Manwe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manwe extends Vala
{
    private String location;
    private boolean isUseless;
    private int numberOfEagles;
    
    public Manwe(){
        super();
        location = "Taniquetel";
        isUseless = true;
        numberOfEagles = 30;
    }
    public Manwe(String n, String d, int r, String l, boolean u, int e){
        super(n,d,r);
        location = l;
        isUseless = u;
        numberOfEagles = e;
    }
    
    public void descendFromThrone(){
        location = "Valmar";
    }
    public void doLiterallyNothingForTheEntireNovel(){
        super.setRank(14);
        super.setDomain("nothing");
        String newName = getName() + " the Useless";
        super.setName(newName);
    }
    public void summonEagles(){
        numberOfEagles += 70;
    }
    
    public String toString(){
        return super.toString() + "  I currently reside upon " + location + ", I command " + numberOfEagles + " Great Eagles, and it is "+ isUseless + " that I am useless.";
    }
}
