package TestTesting;

public class Testing {
    private static int q19() {
        int[][] vals = {{1, 2, 3}, {4, 5, 6}};
        int x = 0;
        for(int i = 0; i < vals.length; i++) {
            for(int j = 0; j < vals[0].length; j++) {
                if(j == 0) {
                    vals[i][j] *= 2; //does this work?
                }
                x += vals[i][j];
            }
        }
        return x;
    }
    private static String removeSubString(String fullString, String subString) {
        int x = fullString.indexOf(subString);
        while(x >= 0) {
            fullString = fullString.substring(0, x) + fullString.substring(x + subString.length());
            x = fullString.indexOf(subString);
            System.out.println(x+subString.length() + ", " + fullString.length());
        }
        return fullString;
    }
    private static String q28() {return removeSubString("sing the song", "ng");}
    
    public static void main(String[] args) {
    }
}
