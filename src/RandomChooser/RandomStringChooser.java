package RandomChooser; //inheritance hw

public class RandomStringChooser {
    private String[] words;
    
    public RandomStringChooser(String[] wordArray) {
        words = wordArray;
    }
    
    public String getNext() {
        if(words.length < 1) {
            return "NONE";
        }
        int i = (int) (Math.random() * words.length);
        String out = words[i];
        String[] newWords = new String[words.length - 1];
        int k = 0;
        for(int j = 0; j < words.length; j++) {
            if(j != i) {
                newWords[k++] = words[j];
            }
        }
        words = newWords;
        return out;
    }
    
    public static void main(String[] args) {
        RandomStringChooser rsc = new RandomStringChooser(new String[] {"wheels", "on", "the", "bus"});
        for (int k = 0; k < 6; k++)
        {
            System.out.println(rsc.getNext() + " ");
        }
    }
}
