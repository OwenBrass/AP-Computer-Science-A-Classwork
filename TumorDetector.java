
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
          for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if (a[i][j]!=b[i][j]){
                    same = false;
                    i=a.length;
                    j=a[0].length;
                    //System.out.println("Check1");
                }
                else{
                    same=true;
                    //System.out.println("Check2");
                }
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
        int[][] scanPart = new int[tumor.length][tumor[0].length];
        for(int i=0; i<scan.length-tumor.length+1; i++){
            for(int j=0; j<scan[0].length-tumor[0].length+1; j++){
                for(int p=0; p<tumor.length; p++){
                    for(int q=0; q<tumor[0].length; q++){
                        scanPart[p][q]=scan[i+p][j+q];
                    }
                }
                if(arrayMatch(tumor,scanPart)==true){
                    report += "\nPossible tumor at ("+i+","+j+", 0)";
                }
                else if(arrayMatch(tumor,arrayRotateCC(scanPart))==true){
                    report += "\nPossible tumor at ("+i+","+j+", 270)";
                }
                else if(arrayMatch(tumor,arrayRotateCC(arrayRotateCC(scanPart)))==true){
                    report += "\nPossible tumor at ("+i+","+j+", 180)";
                }
                else if(arrayMatch(tumor,arrayRotateCC(arrayRotateCC(arrayRotateCC(scanPart))))==true){
                    report += "\nPossible tumor at ("+i+","+j+", 90)";
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
        int[][] patient2 = {{0,0,0,0,1,0},{0,0,0,0,1,1},{1,1,1,0,1,0},{0,1,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        int[][] tum2 = {{0,1,0},{0,1,1},{0,1,0}};
        System.out.println(detectTumor(patient2,tum2));
    }
}

