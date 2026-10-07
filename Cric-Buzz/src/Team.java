import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String name;
    private List<Player> player;

    public Team(int id, String name, Player player) {
        this.id = id;
        this.name = name;
        this.player = new ArrayList<>();
    }
    public int getTeamId(){
        return  this.id;
    }
    public String getTeamName(){
        return  this.name;
    }
    public void addPlayer(Player players){
        player.add(players);
    }

    public List<Player> getPlayer(){
        return this.player;
    }
    public void printPlayerList(){
        for(int i = 0 ; i < player.size() ; i++){
            System.out.println(i+1 +". "+player.get(i).getPlayerName()+" ("+player.get(i).getPlayerRole()+")");
        }
    }
}
