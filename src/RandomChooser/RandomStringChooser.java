package RandomChooser;

public class RandomStringChooser {
    private String[] words;
    
    public RandomStringChooser(String[] wordArray) {
        words = wordArray;
    }
    
    public String getNext() {
        int i = (int) (Math.random() * words.length + 1);
        String[] newWords = new String[words.length - 1];
        int k = 0;
        for(int j = 0; j < newWords.length; j++) {
            if(j != i) {
            
            }
        }
        return
    }
}
