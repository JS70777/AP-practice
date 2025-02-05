package Meal;

public class DeluxeMeal extends Meal {
    private String side;
    private String drink;
    
    public DeluxeMeal(String main, String side, String drink, double dollars) {
        super(main, dollars + 3.0);
        this.side = side;
        this.drink = drink;
    }
    
    public String toString() {
        return "deluxe " + super.toString();
    }
}
