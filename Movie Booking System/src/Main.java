import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

 
        
        
        // Create Object of Payment Class
        
        Payment payment1 = new Payment(101, "Credit Card");
        Payment payment2 = new Payment(102, "Debit Card");
        Payment payment3 = new Payment(103, "UPI");

        ArrayList<Payment> paymentArrayList = new ArrayList<>();
        paymentArrayList.add(payment1);
        paymentArrayList.add(payment2);
        paymentArrayList.add(payment3);


        
        // Create Object of Payment Class
        
        Movie movie1= new Movie(1001, "Dhurandhar", "2 hours 00 minutes", "Hindi");
        Movie movie2 = new Movie(1002, "Lapata Ladies", "1 hours 50 minutes", "Hindi");
        Movie movie3 = new Movie(1003, "Toxic", "2hours 10 minutes", "Hindi");
        
        // Insert all movie into a ArrayList
        
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(movie1);
        movieArrayList.add(movie2);
        movieArrayList.add(movie3);
        
        
        // Create Object of City Class
        City city1 = new City(001, "aa");
        City city2 = new City(002, "bb");
        City city3 = new City(003, "cc");

        // Insert all City into ArrayList
        ArrayList<City> cityArrayList = new ArrayList<>();
        cityArrayList.add(city1);
        cityArrayList.add(city2);
        cityArrayList.add(city3);





        // Create Object of Seat Class

        Seat seat1 = new Seat(1, "Recliner", 799.00);
        Seat seat2 = new Seat(2, "Luxury", 499.00);
        Seat seat3 = new Seat(3, "Standard ", 299.00);
        Seat seat4 = new Seat(4, "Couples", 999.00);
        Seat seat5 = new Seat(5, "Motion ", 849.00);



        // Insert all seat into ArrayList 
        ArrayList<Seat> seatArrayList= new ArrayList<>();
        seatArrayList.add(seat1);
        seatArrayList.add(seat2);
        seatArrayList.add(seat3);
        seatArrayList.add(seat4);
        seatArrayList.add(seat5);


        // Create Object of Showtime Class

        ShowTime showTime1 = new ShowTime(1, "9.00 PM", movie1);
        ShowTime showTime2 = new ShowTime(2, "12.00 PM", movie2);
        ShowTime showTime3 = new ShowTime(3, "3.00 PM", movie3);
        ShowTime showTime4 = new ShowTime(4, "6.00 PM", movie3);
        ShowTime showTime5 = new ShowTime(5, "3.00 PM", movie2);
        ShowTime showTime6 = new ShowTime(6, "9.00 AM", movie1);


        // Insert All Showtime into Array List
        ArrayList<ShowTime> showArrayList = new ArrayList<>();
        showArrayList.add(showTime1);
        showArrayList.add(showTime2);
        showArrayList.add(showTime3);
        showArrayList.add(showTime4);
        showArrayList.add(showTime5);
        showArrayList.add(showTime6);


        // Create Object for CinemaHall Class

        CinemaHall cinemaHall1 = new CinemaHall(001, "PVR-INOX-1", movie1, city3, seat5, showTime1);
        CinemaHall cinemaHall2 = new CinemaHall(002, "PVR-INOX-2", movie3, city1, seat4, showTime2);
        CinemaHall cinemaHall3 = new CinemaHall(003, "PVR-INOX-3", movie2, city3, seat3, showTime6);
        CinemaHall cinemaHall4 = new CinemaHall(004, "PVR-INOX-4", movie1, city1, seat2, showTime5);
        CinemaHall cinemaHall5 = new CinemaHall(005, "PVR-INOX-5", movie1, city2, seat1, showTime4);
        CinemaHall cinemaHall6 = new CinemaHall(006, "PVR-INOX-6", movie3, city3, seat5, showTime3);
        CinemaHall cinemaHall7 = new CinemaHall(007, "PVR-INOX-7", movie3, city2, seat4, showTime2);
        CinemaHall cinemaHall8 = new CinemaHall(010, "PVR-INOX-8", movie1, city1, seat3, showTime1);

        cinemaHall1.addMovie(movie1);
        cinemaHall1.addMovie(movie2);
        cinemaHall2.addMovie(movie3);
        cinemaHall2.addMovie(movie1);
        cinemaHall3.addMovie(movie2);
        cinemaHall3.addMovie(movie3);
        cinemaHall4.addMovie(movie1);
        cinemaHall4.addMovie(movie2);
        cinemaHall5.addMovie(movie3);
        cinemaHall5.addMovie(movie1);
        cinemaHall6.addMovie(movie2);
        cinemaHall6.addMovie(movie3);
        cinemaHall7.addMovie(movie1);
        cinemaHall7.addMovie(movie2);
        cinemaHall8.addMovie(movie3);
        cinemaHall8.addMovie(movie1);

        // Add Show Time into Cinema Hall

        cinemaHall1.addShow(showTime1);
        cinemaHall1.addShow(showTime2);
        cinemaHall1.addShow(showTime3);

        cinemaHall2.addShow(showTime4);
        cinemaHall2.addShow(showTime5);
        cinemaHall2.addShow(showTime6);

        cinemaHall3.addShow(showTime1);
        cinemaHall3.addShow(showTime2);
        cinemaHall3.addShow(showTime3);

        cinemaHall4.addShow(showTime4);
        cinemaHall4.addShow(showTime5);
        cinemaHall4.addShow(showTime6);

        cinemaHall5.addShow(showTime1);
        cinemaHall5.addShow(showTime2);
        cinemaHall5.addShow(showTime3);

        cinemaHall6.addShow(showTime4);
        cinemaHall6.addShow(showTime5);
        cinemaHall6.addShow(showTime6);

        cinemaHall7.addShow(showTime1);
        cinemaHall7.addShow(showTime2);
        cinemaHall7.addShow(showTime3);

        cinemaHall8.addShow(showTime4);
        cinemaHall8.addShow(showTime5);
        cinemaHall8.addShow(showTime6);


        // Add Seat into Cinema Hall

        cinemaHall1.addSeat(seat1);
        cinemaHall1.addSeat(seat2);
        cinemaHall1.addSeat(seat3);
        cinemaHall1.addSeat(seat4);

        cinemaHall2.addSeat(seat1);
        cinemaHall2.addSeat(seat2);
        cinemaHall2.addSeat(seat3);
        cinemaHall2.addSeat(seat5);

        cinemaHall3.addSeat(seat1);
        cinemaHall3.addSeat(seat2);
        cinemaHall3.addSeat(seat4);
        cinemaHall3.addSeat(seat5);

        cinemaHall4.addSeat(seat1);
        cinemaHall4.addSeat(seat3);
        cinemaHall4.addSeat(seat4);
        cinemaHall4.addSeat(seat5);

        cinemaHall5.addSeat(seat2);
        cinemaHall5.addSeat(seat3);
        cinemaHall5.addSeat(seat4);
        cinemaHall5.addSeat(seat5);

        cinemaHall6.addSeat(seat1);
        cinemaHall6.addSeat(seat2);
        cinemaHall6.addSeat(seat3);
        cinemaHall6.addSeat(seat4);

        cinemaHall7.addSeat(seat1);
        cinemaHall7.addSeat(seat2);
        cinemaHall7.addSeat(seat3);
        cinemaHall7.addSeat(seat5);

        cinemaHall8.addSeat(seat1);
        cinemaHall8.addSeat(seat2);
        cinemaHall8.addSeat(seat4);
        cinemaHall8.addSeat(seat5);


        ArrayList<CinemaHall> cinemaHallArrayList = new ArrayList<>();
        cinemaHallArrayList.add(cinemaHall1);
        cinemaHallArrayList.add(cinemaHall2);
        cinemaHallArrayList.add(cinemaHall3);
        cinemaHallArrayList.add(cinemaHall4);
        cinemaHallArrayList.add(cinemaHall5);
        cinemaHallArrayList.add(cinemaHall6);
        cinemaHallArrayList.add(cinemaHall7);
        cinemaHallArrayList.add(cinemaHall8);




        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = sc.nextLine();

        // Create Object of User Class




        CinemaHall hall = null;
        Movie movie = null;
        Seat seat = null;
        Payment payment = null;

        User user2 = new User(102, name);

        System.out.println("Enter Location only from bellow option :");
        for(int i = 0 ; i < cityArrayList.size() ; i++){
            System.out.print(cityArrayList.get(i).getCityName()+" ");
        }
        System.out.println();

        // Get Location input from user
        System.out.println("Enter Location :");
        String location = sc.nextLine();
        ShowTime showTime = null;
        String city = null;

        // Matching if user location is existed or not

        for (int i = 0 ; i < cityArrayList.size(); i++) {

            if (cityArrayList.get(i).getCityName().equals(location)) {
                city = cityArrayList.get(i).getCityName();
            }
        }

        if (city == null){
            System.out.println("Oops! you entered Wrong City. please try again ...");
            return;
        }
                // Fetch All Cinema Hall name & id those are exist in user given location

                for(int j = 0 ; j < cinemaHallArrayList.size() ; j++){

                    if(cinemaHallArrayList.get(j).getCinemaHallAddress().getCityName().equals(city)){
                        System.out.println(cinemaHallArrayList.get(j).getCinemaHallid()+". "+cinemaHallArrayList.get(j).getCinemaHallname() );
                    }
                }



        System.out.println("Enter Cinema Hall Id :");
        int hallIdx = sc.nextInt();
        for(int i = 0 ; i < cinemaHallArrayList.size() ; i++){
            if(cinemaHallArrayList.get(i).getCinemaHallid() == hallIdx && cinemaHallArrayList.get(i).getCinemaHallAddress().getCityName() == city){
                hall = cinemaHallArrayList.get(i);
            }
        }
        if (hall == null){
            System.out.println("Oops!🥲 you entered Wrong Hall Cinema Id. please try again ...");
            return;
        }

        // Print all cinema those are exist in cinema-hall

        for(int i = 0 ; i < cinemaHallArrayList.size() ; i++){
            if(cinemaHallArrayList.get(i)==hall ){
                cinemaHallArrayList.get(i).printMovieList();
            }
        }

        System.out.println("Enter Movie ID : ");
        int movieId = sc.nextInt();
        for(int i = 0 ; i < movieArrayList.size() ; i++){
            if(movieArrayList.get(i).getMovieId() == movieId && hall.getMovieList().contains(movieArrayList.get(i))){
                movie = movieArrayList.get(i);
            }
        }
        if (movie == null){
            System.out.println("Oops! 🙄 you entered Wrong Movie Id. please try again ...");
            return;
        }

        for(int i = 0 ; i < cinemaHallArrayList.size() ; i++){
            if(cinemaHallArrayList.get(i) == hall){
                cinemaHallArrayList.get(i).printShowTime();
            }
        }
        System.out.println("Enter Show Time id ");
        int showId = sc.nextInt();

        for(int i = 0 ; i < showArrayList.size() ; i++){
            if(showArrayList.get(i).getShowId() == showId && hall.getShowTime().contains(showArrayList.get(i))){
                showTime = showArrayList.get(i);
            }
        }

        if(showTime == null){
            System.out.println("Oops! 🥲 you entered Wrong Show Time  Id. please try again ...");
            return;
        }

        // Print all seat those are present in cinema hall

        for(int i = 0 ; i < cinemaHallArrayList.size() ; i++){
            if(cinemaHallArrayList.get(i) == hall){
                cinemaHallArrayList.get(i).printSeatList();
            }
        }

        // Take seat  from User
        int seatId = sc.nextInt();
        for(int i = 0 ; i < seatArrayList.size(); i++){
            if(seatArrayList.get(i).getSeatId() == seatId && hall.getSeatList().contains(seatArrayList.get(i))){
                seat = seatArrayList.get(i);
            }
        }

        if (seat == null){
            System.out.println("Oops! 🥲 you entered Wrong Seat Id. please try again ...");
            return;
        }

        // print All payment method

        for(int i = 0 ; i < paymentArrayList.size() ; i++){
            System.out.println(paymentArrayList.get(i).getPaymentId()+". "+paymentArrayList.get(i).getPaymentType());
        }
        // Take payment input from user
        System.out.println("Enter Payment Id type which you want to Use :");
        int paymentId = sc.nextInt();

        for(int i = 0 ; i < paymentArrayList.size() ; i++){
            if(paymentId == paymentArrayList.get(i).getPaymentId()){
                payment = paymentArrayList.get(i);
            }
        }

        if (payment == null){
            System.out.println("Oops! 🥲 you entered Wrong Payment Id. please try again ...");
            return;
        }


        Booking booking = new Booking(1, movie, hall, user2, showTime, seat, payment, 1);
        booking.printDeatils();
        sc.close();
    }
}