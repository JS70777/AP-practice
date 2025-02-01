package StringCoder;

public class StringPart {
    private int start;
    private int length;
    
    public StringPart(int start, int length) {
        this.start = start;
        this.length = length;
    }
    
    public String toString() {
        return start + ", " + length;
    }
    
    public int getStart() {return start;}
    public int getLength() {return length;}
}
