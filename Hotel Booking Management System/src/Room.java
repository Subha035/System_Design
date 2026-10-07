public class Room {
    private int id;
    private String type;
    private double price;

    public Room(int id, String type, double price){
        this.id = id;
        this.type = type;
        this.price= price;
    }

    public int getRoomId(){
        return id;
    }

    public String getRoomType(){
        return type;
    }
    public double getRoomPrice(){
        return price;
    }
}
