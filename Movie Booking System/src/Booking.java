public class Booking {
    private int id;
    private Movie movieName;
    private CinemaHall cinemaHall;
    private User user;
    private Seat seat;
    private Payment payment;
    private int noOfSeat;
    private ShowTime showTime;

    public Booking(int id, Movie movieName, CinemaHall cinemaHall, User user, ShowTime showTime, Seat seat, Payment payment, int noOfSeat) {
        this.id = id;
        this.movieName = movieName;
        this.cinemaHall = cinemaHall;
        this.user = user;
        this.seat = seat;
        this.payment = payment;
        this.noOfSeat = noOfSeat;
        this.showTime = showTime;
    }


    public void printDeatils(){
        System.out.println("Id : "+ this.id);
        System.out.println("User name : "+ user.getUserName());
        System.out.println("Cinema Hall Name "+this.cinemaHall.getCinemaHallname());
        System.out.println("Cinema Hall Address : "+ this.cinemaHall.getCinemaHallAddress().getCityName());
        System.out.println("Movie Name : "+this.movieName.getMovieName());
        System.out.println("Movie Language : "+this.movieName.getMovielanguage());
        System.out.println("Movie Duration : "+ this.movieName.getMovieDuration());
        System.out.println("Show Time : "+this.showTime.getShowTime());
        System.out.println("Seat Type : "+ this.seat.getSeatType());
        System.out.println("Seat Price : "+ this.seat.getSeatPrice());
        System.out.println("Payment Type : "+ this.payment.getPaymentType());
    }
}
