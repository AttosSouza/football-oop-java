package main.java.com.souza.model;

public class Coach extends Employee {
    private String strategy;
    public static final double PERCENTAGE_BONUS = 0.15;

    public Coach(String name, int age, double salary, String strategy) {
        super(name, age, salary);
        this.strategy = strategy;
    }

    @Override
    public void performRole() {
        System.out.println(this.name+ " is a coach who likes to play: " + strategy);
    }

    @Override
    public double bonusCalculator() {
        System.out.println("Adding a " + (PERCENTAGE_BONUS * 100) + "% bonus to the coach's contract");
        double bonus = this.salary * PERCENTAGE_BONUS;
        double totalWithBonus = this.salary + bonus;
        return totalWithBonus;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
