import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private List<Room> room;
    private Location location;


    public Hotel(int id, String name, Room room, Location location){
        this.id = id;
        this.name = name;
        this.room = new ArrayList<>();
        this.location = location;
    }

    public void addRoom(Room rooms){
        room.add(rooms);
    }

    public  int roomCount(){
        return room.size();
    }

    public  int getHotelId(){
        return id;
    }
    public String getHotelName()
    {
        return  name;
    }

    public Location getLocation(){
        return location;
    }

    public List<Room> room(){
        return room;
    }
    public void getRoom(){
        for(int i = 0 ; i < room.size() ; i++){
            System.out.println(room.get(i).getRoomId()+" - "+ room.get(i).getRoomType()+" - "+room.get(i).getRoomPrice());
        }
    }
}
