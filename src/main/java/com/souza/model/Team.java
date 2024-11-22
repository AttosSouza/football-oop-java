package main.java.com.souza.model;

import java.util.Arrays;

public class Team {
    private String name;
    private Coach coach;
    private Stadium stadium;
    private Player[] players;
    private Fan[] fans;

    public Team(String name, Stadium stadium) {
        this.name = name;
        this.coach = coach;
        this.stadium = stadium;
        this.players = players;
        this.fans = fans;
    }

    public String getName() {
        return name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void teamInfo() {
        System.out.println("Team: " + this.name);
        System.out.println("Coach: " + coach.getName());
        System.out.println("Stadium: " + stadium.getName());
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println("- " + player.getName() + " (" + player.getPosition() + ")");
        }
    }

}
