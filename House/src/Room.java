public class Room {
    private int id;
    private int roomNo;
    private  String roomType;
    private double length;
    private double width;

    public Room(int id, int roomNo, String roomType, double length, double width){
        this.id = id;
        this.roomNo = roomNo ;
        this.roomType = roomType;
        this.length = length;
        this.width = width;
    }

    public int getRoomId(){
        return  id;
    }
    public int getRoomNo(){
        return  roomNo;
    }

    public String getRoomType(){
        return roomType;
    }
    public  double getRoomSize(){
        return length * width;
    }
}
