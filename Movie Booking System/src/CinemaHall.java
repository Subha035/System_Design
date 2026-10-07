import java.util.ArrayList;
import java.util.List;

public class CinemaHall {
    private int id;
    private String name;
    private List<Movie> movie;
    private City address;
    private List<Seat> seat;
    private List<ShowTime> showTime;

    public CinemaHall(int id, String name, Movie movie, City address, Seat seat, ShowTime showTime) {
        this.id = id;
        this.name = name;
        this.movie = new ArrayList<>();
        this.address = address;
        this.seat = new ArrayList<>();
        this.showTime = new ArrayList<>();
    }

    public int getCinemaHallid() {
        return this.id;
    }

    public String getCinemaHallname() {
        return this.name;
    }

    public List<Movie> printMovieList() {
        for (int i = 0; i < movie.size(); i++) {
            System.out.println(movie.get(i).getMovieId() + ". " + movie.get(i).getMovieName());
        }
        return movie;
    }

    public List<Movie> getMovieList() {
        return movie;
    }

    public List<Seat> printSeatList() {
        for (int i = 0; i < seat.size(); i++) {
            System.out.println(seat.get(i).getSeatId() + ". " + seat.get(i).getSeatType() + " - " + seat.get(i).getSeatPrice());
        }
        return seat;
    }

    public List<ShowTime> printShowTime(){
        for(int i = 0 ; i < showTime.size() ; i++){
            System.out.println(showTime.get(i).getShowId()+". "+ showTime.get(i).getShowTime());
        }
        return showTime;
    }

    public List<ShowTime> getShowTime(){
        return showTime;
    }

    public List<Seat> getSeatList() {
        return seat;
    }

    public void addMovie(Movie movies) {
        movie.add(movies);
    }

    public void addSeat(Seat seats) {
        seat.add(seats);
    }

    public City getCinemaHallAddress() {
        return this.address;
    }

    public void addShow(ShowTime showTimes) {
        showTime.add(showTimes);
    }
}
