import java.util.ArrayList;
import java.util.List;

public class Match {
    private int id;
    private List<Innings> innings;
    private Stadium stadiumName;
    private Team team1;
    private Team team2;
    private MatchStatus matchStatus;

    public Match(int id, Innings innings, Stadium stadiumName, Team team1, Team team2, MatchStatus matchStatus){
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.innings = new ArrayList<>();
        this.stadiumName = stadiumName;
        this.matchStatus = matchStatus;
    }

    public int getMatchId() {
        return this.id;
    }
    public void addInnings(Innings inningss){
        innings.add(inningss);
    }

    public List<Innings> getInnings() {
        return this.innings;
    }

    public Stadium getStadiumName() {
        return this.stadiumName;
    }

    public Team getTeam1() {
        return this.team1;
    }

    public Team getTeam2() {
        return this.team2;
    }
    public MatchStatus getMatchStatus(){
        return this.matchStatus;
    }
    public void printMatchDetails(){
        System.out.println("Stadium Name : "+ this.stadiumName.getStadiumName()+ "("+this.stadiumName.getStadiumAddress().getAddressName()+")");
        System.out.println("Team 1 Name : "+ this.team1.getTeamName());
        System.out.println("Team 2 Name : "+ this.team2.getTeamName());
        System.out.println(this.innings.get(0).getBattingTeam().getTeamName()+" total Run : "+ this.innings.get(0).getInningsTotalRun());
        System.out.println(this.innings.get(1).getBattingTeam().getTeamName()+" total Run : "+ this.innings.get(1).getInningsTotalRun());

        if(this.innings.get(0).getInningsTotalRun() > this.innings.get(1).getInningsTotalRun()){
            System.out.println("Winner team is : "+this.innings.get(0).getBattingTeam().getTeamName());
        } else if(this.innings.get(0).getInningsTotalRun() < this.innings.get(1).getInningsTotalRun()){
            System.out.println("Winner team is : "+this.innings.get(1).getBattingTeam().getTeamName());
        } else {
            System.out.println("Match Tie..");
        }


    }
}
