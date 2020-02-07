
/**
 * Write a description of class TumorDetector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TumorDetector
{
    public static boolean arrayMatch(int[][] a, int[][] b){
        boolean same=false;
        for(int n=0; n<4; n++){
            int[][] c = new int[a.length][a[0].length];
            c=arrayRotateCC(a);  
          for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if (c[i][j]!=b[i][j]){
                    same = false;
                    i=a.length;
                    j=a[0].length;
                }
                else{
                    same=true;
                }
            }
        }
        if(same = true){
            n=4;
        }
    }
        return same;
    }
    public static int[][] arrayRotateCC(int[][] a){
        int[][] b = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                b[a.length-j-1][i] = a[i][j];
            }
        }
        return b;
    }
    public static String detectTumor(int[][] scan, int[][] tumor){
        String report = "";
        for(int i=0; i<scan.length-tumor.length; i++){
            for(int j=0; j<scan[0].length-tumor[0].length; j++){
                int[][] scanPart = new int[tumor.length][tumor[0].length];
                for(int p=0; p<tumor.length; p++){
                    for(int q=0; q<tumor[0].length; q++){
                        scanPart[p][q]=scan[i+p][j+q];
                    }
                }
                if(arrayMatch(scanPart,tumor)==true){
                    report += "\nPossible tumor at ("+i+","+j+")";
                }
            }
        }
        return report;
    }
    public static void main(String[] args){
        int[][] patient1 = {{0,0,0,0,1,1,0,0,1,1},{1,1,1,0,1,0,1,0,0,1},{0,0,1,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1},
        {1,1,0,0,0,0,0,1,0,0},{0,1,0,1,0,0,1,1,1,1},{1,1,1,1,1,0,0,1,1,0},{0,0,0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1}};
        int[][] tum1 = {{0,0,1,1},{0,0,1,0},{0,1,1,1},{0,0,1,1}};
        System.out.println(detectTumor(patient1,tum1));
    }
}
