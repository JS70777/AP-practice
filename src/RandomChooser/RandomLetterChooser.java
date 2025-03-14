package RandomChooser;

public class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }
    public static String[] getSingleLetters(String str) {
        String[] out = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            out[i] = str.charAt(i) + "";
        }
        return out;
    }
    
    public static void main(String[] args) {
        RandomStringChooser rlc = new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++)
        {
            System.out.print(rlc.getNext());
        }
    }
}
