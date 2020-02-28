
/**
 * Write a description of class Eldar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vala
{
    private String name;
    private String domain;
    private int rank;
    public Vala(){
        name = "Manwe";
        domain = "Wind, Air, and Sky";
        rank = 1;
    }
    public Vala(String n, String d, int r){
        name = n;
        domain = d;
        rank = r;
    }
    
    public String getName(){
        return name;
    }
    public String getDomain(){
        return domain;
    }
    public int getRank(){
        return rank;
    }
    
    public void setName(String n){
        name=n;
    }
    public void setDomain(String d){
        domain=d;
    }
    public void setRank(int r){
        rank=r;
    }
    
    public String toString(){
        return name + " Lord of " + domain + ", rank " + rank + " in power among the mighty Ainur who descended upon Arda.";
    }
}
