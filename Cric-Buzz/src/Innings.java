import java.util.ArrayList;
import java.util.List;

public class Innings {
    private int id;
    private Team bowling;
    private Team batting;
    private int totalRun;
    private int totalWicket;
    private List<Over> over;

    public Innings(int id, Team bowling, Team batting, int totalRun, int totalWicket, Over overs) {
        this.id = id;
        this.bowling = bowling;
        this.batting = batting;
        this.totalRun = totalRun;
        this.totalWicket = totalWicket;
        this.over = new ArrayList<>();
    }

    public int getInningsId() {
        return this.id;
    }

    public Team getBowlingTeam() {
        return this.bowling;
    }

    public Team getBattingTeam() {
        return this.batting;
    }

    public int getInningsTotalRun() {
        return this.totalRun;
    }

    public int getInningsTotalWicket() {
        return this.totalWicket;
    }
    public void addOver(Over overs){
        over.add(overs);
    }

    public List<Over> getOvers() {
        return this.over;
    }
}
