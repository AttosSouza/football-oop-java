package main.java.com.souza.model;

public class Player extends Employee {
    private String position;
    public static final double PERCENTAGE_BONUS = 0.20;

    public Player(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public void performRole() {
        System.out.println(this.name + " plays as " + position);
    }

    @Override
    public double bonusCalculator() {
        System.out.println("Adding a " + (PERCENTAGE_BONUS * 100) + "% bonus to the player's contract");
        double bonus = this.salary * PERCENTAGE_BONUS;
        double totalWithBonus = this.salary + bonus;
        return totalWithBonus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
