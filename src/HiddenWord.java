public class HiddenWord {
    private String hidden;
    
    public HiddenWord(String str) {
        hidden = str;
    }
    
    public String getHint(String guess) {
        String out = "";
        for(int i = 0; i < hidden.length(); i++) {
            char c = guess.charAt(i);
            if(c == hidden.charAt(i)) {
                out += c;
            } else {
                if(hidden.indexOf(c) > -1) {
                    out += '+';
                } else {
                    out += '*';
                }
            }
        }
        return out;
    }
    
    
    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }
}
