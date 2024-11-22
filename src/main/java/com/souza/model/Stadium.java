package main.java.com.souza.model;

public class Stadium {
    private String name;
    private double capacity;

    public Stadium(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void hostMatch() {
        System.out.println("The match is being hosted at " + this.name + " with a capacity of " + this.capacity + " fans.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
