public class AdditionPattern {
    private int start;
    private int num;
    private int increment;
    
    public AdditionPattern(int starting, int add) {
        start = starting;
        num = start;
        increment = add;
    }
    
    public int currentNumber() {return num;}
    public void next() {num += increment;}
    public void prev() {if(num != start) {num -= increment;}}
    
    public static void main(String[] args) {
        AdditionPattern plus3 = new AdditionPattern(2, 3);
        System.out.println(plus3.currentNumber());
        plus3.next();
        System.out.println(plus3.currentNumber());
        plus3.next();
        plus3.next();
        System.out.println(plus3.currentNumber());
        plus3.prev();
        plus3.prev();
        plus3.prev();
        System.out.println(plus3.currentNumber());
        plus3.prev();
        System.out.println(plus3.currentNumber());
    }
}
