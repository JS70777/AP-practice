import java.util.Arrays;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D) {
        int[] out = new int[arr2D.length];
        int i = 0;
        for(int[] row: arr2D) {
            out[i++] = arraySum(row);
        }
        return out;
    }
    public static boolean isDiverse(int[][] arr2D) {
        int[] rowSums = rowSums(arr2D);
        for(int i = 0; i < rowSums.length - 1; i++) {
            for(int j = i + 1; j < rowSums.length; j++) {
                if(rowSums[i] == rowSums[j]) {return false;}
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 3};
        System.out.println(arraySum(arr1));
        
        int[][] mat1 = {arr1, {10, 10, 4, 6, 2}, {5, 3, 5, 9, 6}, {7, 6, 4, 2, 1}};
        System.out.println(Arrays.toString(rowSums(mat1)));
        
        int[][] mat2 = {{1, 1, 5, 3, 4}, {12, 7, 6, 1, 9}, {8, 11, 10, 2, 5}, {3, 2, 3, 0, 6}};
        System.out.println(isDiverse(mat1));
        System.out.println(isDiverse(mat2));
    }
}
