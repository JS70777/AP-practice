package TileGame;

public class NumberTile {
    private int left;
    private int up;
    private int right;
    private int down;
    
    public NumberTile(int l, int u, int r, int d) {
        left = l;
        up = u;
        right = r;
        down = d;
    }
    
    public int getLeft() {
        return left;
    }
    public int getRight() {
        return right;
    }
    public String toString() {
        return left + " (" + up + ", " + down + ") " + right;
    }
    
    public void rotate() {
        int temp = left;
        left = down;
        down = right;
        right = up;
        up = temp;
    }
    
    public static void main(String[] args) {
        NumberTile nt = new NumberTile(4, 4, 3, 7);
        for(int i = 0; i < 4; i++) {
            nt.rotate();
            System.out.println(nt);
        }
    }
}
