public class Seat {
    private int id;
    private String type;
    private double price;

    public Seat(int id, String  type, double price){
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public int getSeatId(){
        return this.id;
    }

    public String getSeatType(){
        return  this.type;
    }

    public double getSeatPrice(){
        return  this.price;
    }
}
