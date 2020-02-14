import java.util.*;
public class PinewoodDerby
{
    public String processInput(ArrayList<String[]> input){
        int num = Integer.parseInt(input.get(0)[0]);
        ArrayList<String> heatList = new ArrayList<String>();
        int[][] participants = new int[(input.size()-1)/2][5];
        int[][] rankings = new int[(input.size()-1)/2][5];
        for(int i=1; i<(double)input.size()/2; i++){
            heatList.add(input.get(i)[0]);
            for(int j=1; j<=5; j++){
                participants[i-1][j-1] = Integer.parseInt(input.get(i)[j]);
                rankings[i-1][j-1] = Integer.parseInt(input.get(i+(input.size()-1)/2)[j]);
            }
        }
        for(int p=0; p<participants.length; p++){
            for(int q=0; q<participants[0].length; q++){
                
            }
        }
        return "";
    }
    
}
