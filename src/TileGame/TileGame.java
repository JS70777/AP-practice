package TileGame;

import java.util.ArrayList;

public class TileGame {
    private ArrayList<NumberTile> board;
    
    public TileGame() {
        board = new ArrayList <>();
    }
    
    public String toString() {
        String str = "";
        for(NumberTile nt: board) {
            str += "[" + nt + "] ";
        }
        return str;
    }
    
    private int getIndexForFit(NumberTile tile) {
        if(board.isEmpty()) {
            return 0;
        }
        if(board.get(0).getLeft() == tile.getRight()) {
            return 0;
        } else if(board.get(board.size() - 1).getRight() == tile.getLeft()) {
            return board.size();
        }
        for(int i = 1; i < board.size(); i++) {
            if(board.get(i - 1).getRight() == tile.getLeft()
            && board.get(i).getLeft() == tile.getRight()) {
                return i;
            }
        }
        return -1;
    }
    public boolean insertTile(NumberTile tile) {
        int index = -1;
        int rotations = 0;
        while(index == -1 && rotations <= 4) {
            tile.rotate();
            rotations++;
            index = getIndexForFit(tile);
        }
        if(index == -1) {
            return false;
        } else {
            board.add(index, tile);
            return true;
        }
    }
    
    public static void main(String[] args) {
        TileGame tg = new TileGame();
        tg.board.add(new NumberTile(4, 4, 3, 7));
        tg.board.add(new NumberTile(3, 6, 4, 3));
        tg.board.add(new NumberTile(4, 1, 2, 3));
        tg.board.add(new NumberTile(2, 3, 2, 5));
        tg.board.add(new NumberTile(2, 5, 9, 2));
        
        System.out.println(tg);
        
        System.out.println(tg.insertTile(new NumberTile(0, 0, 0, 0)));
        
        System.out.println(tg);
    }
}
