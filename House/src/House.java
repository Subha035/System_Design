import java.util.ArrayList;
import java.util.List;


public class House {
    private int id;
    private int houseNo;
    private Owner owner;
    private List<Room> room;

    public  House(int id, int houseNo, Owner owner, Room room){
        this.id = id;
        this.houseNo = houseNo;
        this.owner = owner;
        this.room = new ArrayList<>();
    }

    public  Owner getOwnerName(){
        return  owner;
    }
    public void addRoom(Room rooms){
        room.add(rooms);
    }

    public int roomCount(){
        return  room.size();
    }

    public Room getBiggestRoom(){
        Room size = room.get(0);
        for(Room rooms : room){
            if(rooms.getRoomSize() > size.getRoomSize() ){
                size = rooms;
            }
        }
        return size;
    }

//    public int getHouseCount(String name){
//        House houseNum;
//        if(owner.getOwnerName() == name ){
//            System.out.println(houseNo);
//            houseNum = houseNum.houseNo;
//        }
//        return houseNum.roomCount();
//    }
}
