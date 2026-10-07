import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Location location1 = new Location("Digha","West Bengal");
        Location location2 = new Location("Puri","Odisha");
        Location location3 = new Location("NJP","West Bengal");
        Location location4 = new Location("Mayapur","West Bengal");

        // Adding All hotel into ArrayList

        ArrayList<Location> locationList = new ArrayList<>();


        locationList.add(location1);
        locationList.add(location2);
        locationList.add(location3);
        locationList.add(location4);



        Room room1 = new Room(1, "Standard", 100.00);
        Room room2 = new Room(2, "Premium", 200.00);
        Room room3 = new Room(3, "Delux", 300.00);
        Room room4 = new Room(4, "Delux", 350.00);
        Room room5 = new Room(5, "Premium", 250.00);

        Hotel hotel1 = new Hotel(101, "H1",room1, location1);
        Hotel hotel2 = new Hotel(102, "H2",room2, location2);
        Hotel hotel3 = new Hotel(103, "H3",room3, location3);
        Hotel hotel4 = new Hotel(104, "H4",room4, location4);
        Hotel hotel5 = new Hotel(105, "H5",room5, location1);



        Payment payment1 = new Payment(111, "Prepaid");
        Payment payment2 = new Payment(222, "Postpaid");


        //Hotel 1 Room Add:

        hotel1.addRoom(room1);
        hotel1.addRoom(room2);
        hotel1.addRoom(room3);
        hotel1.addRoom(room4);
        hotel1.addRoom(room5);
        hotel1.addRoom(room1);

        // hotel 2 room add :
        hotel2.addRoom(room1);
        hotel2.addRoom(room2);
        hotel2.addRoom(room3);
        hotel2.addRoom(room5);


        // hotel 3 room add :
        hotel3.addRoom(room1);
        hotel3.addRoom(room2);
        hotel3.addRoom(room3);
        hotel3.addRoom(room4);
        hotel3.addRoom(room5);
        hotel3.addRoom(room3);


        // hotel 4 room add :

        hotel4.addRoom(room1);
        hotel4.addRoom(room5);
        hotel4.addRoom(room2);
        hotel4.addRoom(room3);

        // hotel 5 room add :
        hotel5.addRoom(room1);
        hotel5.addRoom(room5);
        hotel5.addRoom(room2);
        hotel5.addRoom(room3);


        ArrayList<Hotel> hotelArrayList = new ArrayList<>();
        hotelArrayList.add(hotel1);
        hotelArrayList.add(hotel2);
        hotelArrayList.add(hotel3);
        hotelArrayList.add(hotel4);
        hotelArrayList.add(hotel5);

        List<Room> bookedRoom = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String email = sc.nextLine();
        System.out.println("Enter Your Password : ");
        String passWord = sc.nextLine();
        System.out.println("Enter Your User Name : ");
        String userName = sc.nextLine();
//
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        Account account = new Account(email, passWord, userName);

        System.out.println("Enter Your Location :");
        System.out.println("Enter Only - Digha , Puri , NJP, Mayapur");
        String  location = sc.nextLine();
       for(int i = 0 ; i < hotelArrayList.size() ; i++){
           if(hotelArrayList.get(i).getLocation().getLocation().equals(location)){
               System.out.println(hotelArrayList.get(i).getHotelId()+" - "+hotelArrayList.get(i).getHotelName());
           }
       }
       // To get Hotel Id for User :
        System.out.println("Enter hotel id : ");
       int hotelid = sc.nextInt();

       // To fetch hotel from List
       Hotel hotel = null;
       for(int i = 0 ; i < hotelArrayList.size() ; i++){
           if(hotelArrayList.get(i).getHotelId() == hotelid){
               hotel = hotelArrayList.get(i);
           }
       }

        Room room = null;
        int roomId = 0;
        String input;

        int k = 1;

        System.out.println("How many room you want ?");
        int num = sc.nextInt();
       while(k <= num) {
           for (int i = 0; i < hotelArrayList.size(); i++) {
               if (hotelArrayList.get(i).getHotelId() == hotelid) {
                   hotelArrayList.get(i).getRoom();
               }
           }

           if(k == 1 ) {
               System.out.println();
               System.out.println("Enter Room  which you want : ");
               roomId = sc.nextInt();
           } else{
               System.out.println();
               System.out.println("Enter another Room  which you want : ");
               roomId = sc.nextInt();
           }

           for (int i = 0; i < hotelArrayList.size(); i++) {
               for (int j = 0; j < hotelArrayList.get(i).room().size(); j++) {
                   if (hotelArrayList.get(i).room().get(j).getRoomId() == roomId) {
                       room = hotelArrayList.get(i).room().get(j);
                       hotelArrayList.get(i).room().remove(room);
                   }
               }
           }
           bookedRoom.add(room);
           k++;
       }

        System.out.println("How much Day you want to stay ?");
       int noOfDay = sc.nextInt();

    }
}