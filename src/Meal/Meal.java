package Meal;

public class Meal {
    private String entree;
    private double cost;
    
    public Meal(String name, double dollars) {
        entree = name;
        cost = dollars;
    }
    
    public String toString() {
        return entree + " meal, $" + cost;
    }
    
    public static void main(String[] args) {
        System.out.println(new Meal("hamburger", 7.99));
        System.out.println(new DeluxeMeal("burrito", "chips", "lemonade", 7.49));
    }
}
