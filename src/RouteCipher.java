import java.util.Arrays;

public class RouteCipher {
    private String[][] letterBlock;
    private int numRows;
    private int numCols;
    public RouteCipher(int rows, int cols) {
        letterBlock = new String[rows][cols];
        numRows = rows;
        numCols = cols;
    }
    
    private void fillBlock(String str) {
        int k = 0;
        for(int r = 0; r < numRows; r++) {
            for(int c = 0; c < numCols; c++) {
                if(k >= str.length()) {
                    letterBlock[r][c] = "A";
                } else {
                    letterBlock[r][c] = str.substring(k, k + 1);
                }
                k++;
            }
        }
    }
    private String encryptBlock() {
        String crypt = "";
        for(int i = 0; i < numCols; i++) {
            for(String[] row: letterBlock) {
                crypt += row[i];
            }
        }
        return crypt;
    }
    public String encryptMessage(String message) {
        String crypt = "";
        int increment = numRows * numCols;
        for(int i = 0; i < (int) (message.length() / increment + 0.9999); i++) {
            int iTwo = (i + 1) * increment;
            iTwo = Math.min(iTwo, message.length());
            fillBlock(message.substring(i * increment, iTwo));
            crypt += encryptBlock();
        }
        return crypt;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(new RouteCipher(2, 4).encryptMessage("Surprise"));
    }
}
