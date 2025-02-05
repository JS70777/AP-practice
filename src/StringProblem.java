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
    
    }
    
    public static void main(String[] args) {
        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("ABRACADABRA"));
        System.out.println(scrambleWord("WHOA"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("EGGS"));
        System.out.println(scrambleWord("A"));
        System.out.println(scrambleWord(""));
    }
}
