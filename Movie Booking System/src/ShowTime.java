import java.util.ArrayList;
import java.util.List;

public class ShowTime {
    private int id;
    private String time;
    private List<Movie> movie;

    public ShowTime(int id, String  time, Movie movie){
        this.id = id;
        this.time = time;
        this.movie = new ArrayList<>();
    }

    public  String getShowTime(){
        return  this.time;
    }
    public int getShowId(){
        return this.id;
    }
}
