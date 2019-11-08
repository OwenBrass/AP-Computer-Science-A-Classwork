/**
 * @author Owen Brass
 */
public class MiddleEarthFortress
{
    private double towerHeight;
    private double wallHeight;
    private double gateStrength;
    private String location;
    private String name;
    private String occupyingForces;
    private String leader;
    private boolean palantir;
    private boolean keep;
    private boolean grondAttacking;
    
    /**
     * No args constructor for MiddleEarthFortress class
     */
    public MiddleEarthFortress(){
        towerHeight = 60;
        wallHeight = 35;
        gateStrength = 100000;
        location = "Rohan";
        name = "Helm's Deep";
        occupyingForces = "Rohan";
        leader = "King Theoden";
        palantir = true;
        keep = true;
        grondAttacking = false;
    }
     /**
     * Constructor will take 10 parameter variables
     * @param towerHeight highest point in fortress (feet)
     * @param wallHeight height of surrounding walls (feet)
     * @param gateStrength maximum force that gate can endure (Newtons)
     * @param location province or nation in Middle Earth
     * @param name name of fortress
     * @param occupyingForces military forces currently occupying fortress
     * @param leader King or Lord of the fortress
     * @param palantir does the fortress currently have a Palantir?
     * @param keep does the fortress have a keep?
     * @param grondAttacking is Grond currently attacking the fortress?
     */
    public MiddleEarthFortress(double t, double w, double g, String l, String n, String f, String lead, boolean p, boolean k, boolean grond){
        towerHeight = t;
        wallHeight = w;
        gateStrength = g;
        location = l;
        name = n;
        occupyingForces = f;
        leader = lead;
        palantir = p;
        keep = k;
        grondAttacking = grond;
    }
    /**
     * Mutator method for changing towerHeight
     * @param t the towerHeight to which we are changing
     */
    public void setTowerHeight(double t){
        towerHeight = t;
    }
        /**
     * Mutator method for changing wallHeight
     * @param w the wallHeight to which we are changing
     */
    public void setWallHeight(double w){
        wallHeight = w;
    }
        /**
     * Mutator method for changing gateStrength
     * @param t the towerHeight to which we are changing
     */
    public void setGateStrength(double g){
        gateStrength = g;
    }
        /**
     * Mutator method for changing location
     * @param l the location to which we are changing
     */
    public void setLocation(String l){
        location = l;
    }
        /**
     * Mutator method for changing name
     * @param n the name to which we are changing
     */
    public void setName(String n){
        name = n;
    }
        /**
     * Mutator method for changing occupyingForces
     * @param f the occupyingForces to which we are changing
     */
    public void setForces(String f){
        occupyingForces = f;
    }
        /**
     * Mutator method for changing leader
     * @param l the leader to which we are changing
     */
    public void setLeader(String lead){
        leader = lead;
    }
        /**
     * Mutator method for changing palantir
     * @param p the palantir to which we are changing
     */
    public void setPalantir(boolean p){
        palantir = p;
    }
        /**
     * Mutator method for changing keep
     * @param k the keep to which we are changing
     */
    public void setKeep(boolean k){
        keep = k;
    }
        /**
     * Mutator method for changing grondAttacking
     * @param g the grondAttacking to which we are changing
     */
    public void setGrond(boolean grond){
        grondAttacking = grond;
    }
    
     /**
     * Accessor method for towerHeight
     */
    public double getTowerHeight(){
        return towerHeight;
    }
         /**
     * Accessor method for wallHeight
     */
    public double getWallHeight(){
        return wallHeight;
    }
         /**
     * Accessor method for gateStrength
     */
    public double getGateStrength(){
        return gateStrength;
    }
         /**
     * Accessor method for location
     */
    public String getLocation(){
        return location;
    }
         /**
     * Accessor method for name
     */
    public String getName(){
        return name;
    }
         /**
     * Accessor method for occupyingForces
     */
    public String getOccupyingForces(){
        return occupyingForces;
    }
         /**
     * Accessor method for leader
     */
    public String getLeader(){
        return leader;
    }
         /**
     * Accessor method for palantir
     */
    public boolean getPalantir(){
        return palantir;
    }
         /**
     * Accessor method for keep
     */
    public boolean getKeep(){
        return keep;
    }
         /**
     * Accessor method for grondAttacking
     */
    public boolean getGrond(){
        return grondAttacking;
    }
    
    /**
     * toString method to describe the fortress
     */
    public String toString(){
        String military = name + " is occupied by " + occupyingForces + " who are led by " + leader;
        String characteristics = name+ " has a tower height, wall height, and gate strength of " + towerHeight + ", "+wallHeight+", and "+gateStrength+", respectively";
        String trueOrFalseP = name + "has a palantir: " + palantir;
        String trueOrFalseK = name + "has a keep: " + keep;
        String trueOrFalseG = name + "is being attacked by Grond and is therefore about to be defeated: " + grondAttacking;
        String allData = military + "/n" + characteristics + "/n" + trueOrFalseP + "/n" + trueOrFalseK + "/n" + trueOrFalseG;
        return allData;
    }
}
