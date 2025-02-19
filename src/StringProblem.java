import java.util.ArrayList;
import java.util.List;
public class StringProblem {
    public static String scrambleWord(String word) {
        String out = "";
        for(int i = 0; i < word.length(); i++) {
            if(word.length() != i + 1 && word.charAt(i) == 'A' && word.charAt(i + 1) != 'A') {
                out += word.charAt(i + 1);
                out += word.charAt(i);
                i++;
            } else {
                out += word.charAt(i);
            }
        }
        return out;
    }
    public static void scrambleOrRemove(List<String> wordList) {
        for(int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            String scramble = scrambleWord(word);
            if(scramble.equals(word)) {
                wordList.remove(word);
                i--;
            } else {
                wordList.set(i, scramble);
            }
        }
    }
    
    public static void main(String[] args) {
        List<String> wordList = new ArrayList <>();
        wordList.add("TAN");
        wordList.add("ABRACADABRA");
        wordList.add("WHOA");
        wordList.add("APPLE");
        wordList.add("EGGS");
        scrambleOrRemove(wordList);
        System.out.println(wordList);
    }
}
