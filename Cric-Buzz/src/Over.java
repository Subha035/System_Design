import java.util.ArrayList;
import java.util.List;

public class Over {
    private int id;
    private List<Ball> over;
    public Over(int id, Ball overs) {
        this.id = id;
        this.over = new ArrayList<>();
    }
    public int getOverId(){
        return this.id;
    }
    public void addBall(Ball balls){
        over.add(balls);
    }
    public List<Ball> getOvers(){
        return  this.over;
    }
}
