import main.java.com.souza.model.Coach;
import main.java.com.souza.model.Player;
import main.java.com.souza.model.Stadium;
import main.java.com.souza.model.Team;
import main.java.com.souza.service.BonusCalculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach("Carlo Ancelotti", 65,910.000, "Balanced");
        Stadium stadium = new Stadium("Santiago Bernabéu", 81.000);
        Team team = new Team("Real Madrid CF", stadium);

        Player player = new Player("Vinicius Júnior", 24, 343.000, "Foward");
        Player player2 = new Player("Rodrygo Goes", 23, 240.385, "Foward");

        Player[] players = {player, player2};

        team.setCoach(coach);
        team.setPlayers(players);
        team.teamInfo();

        System.out.println("-------------------------------");
        BonusCalculator.calculateBonus(player);

    }
}