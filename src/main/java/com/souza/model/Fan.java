package main.java.com.souza.model;

public class Fan {
    private String name;
    private String favoritePlayer;

    public Fan(String name, String favoritePlayer) {
        this.name = name;
        this.favoritePlayer = favoritePlayer;
    }

    public void cheer() {
        System.out.println(this.name + " is cheering for " + favoritePlayer + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoritePlayer() {
        return favoritePlayer;
    }

    public void setFavoritePlayer(String favoritePlayer) {
        this.favoritePlayer = favoritePlayer;
    }
}
