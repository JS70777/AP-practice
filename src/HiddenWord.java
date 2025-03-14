import java.util.Scanner;

public class HiddenWord {
    private final String hidden;
    
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
                    out += '_';
                } else {
                    out += '-';
                }
            }
        }
        return out;
    }
    
    
    public static void main(String[] args) {
        String word = "TAPER";
        HiddenWord puzzle = new HiddenWord(word);
        Scanner scan = new Scanner(System.in);
        String in = "";
        while(!in.equals(word)) {
            in = scan.nextLine();
            if(in.length() == word.length()) {
                System.out.println(puzzle.getHint(in));
            } else {
                System.out.println("Wrong length");
            }
        }
    }
}
