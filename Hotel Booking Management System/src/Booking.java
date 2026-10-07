import java.util.ArrayList;
import java.util.List;

public class Booking {
    private int id;
    private Payment payment;
    private String guestName;
    private Hotel hotel;
    private List<Room> room;
    private int noOfDays;
    private List<Room> bookedRooms;

    public Booking(int id, Payment payment, String guestName, Hotel hotel, Room room, int noOfDays, List<Room> bookedRooms){
        this.id = id;
        this.payment = payment;
        this.guestName = guestName;
        this.hotel = hotel;
        this.room = new ArrayList<>();
        this.noOfDays = noOfDays;
        this.bookedRooms = (bookedRooms != null) ? new ArrayList<>(bookedRooms) : new ArrayList<>();
    }
//    public int getBookingId(){
//        return id;
//    }
//    public Payment getPayment(){
//        return payment;
//    }
//    public String getGuestName(){
//        return  guestName;
//    }
//    public int getNoOfDays(){
//        return noOfDays;
//    }
//
//    public Hotel getHotel() {
//        return hotel;
//    }
//
    public List<Room> getRoom(){
        return room;
    }
//
//    public List<Room> getBookedRoom(){
//        return bookedRooms;
//    }

    public String getRoomType(int id){
        String str = "";
        for(int i = 0 ; i < room.size(); i++){
            if(id == room.get(i).getRoomId()){
                 str = room.get(i).getRoomType();
            }
        }
        return str;
    }



    public void showDetails(){
        System.out.println();
        System.out.println();
        System.out.println("Booking Id : "+this.id);
        System.out.println("Name : "+this.guestName);
        System.out.println("Payment Id : "+ this.payment.getPaymentId());
        System.out.println("Payment Type : "+this.payment.getPaymentType());
        System.out.println("Hotel Name : "+this.hotel.getHotelName());
        System.out.println("Hotel ID : "+this.hotel.getHotelId());
        System.out.println("Room : ");
        System.out.println("{");
        for(Room  r :bookedRooms){
            System.out.print(" "+r.getRoomId() +" : "+r.getRoomType());
            System.out.println();
        }
        System.out.println("}");

        System.out.println("No of Day's Want to stay : "+this.noOfDays);

    }
}
