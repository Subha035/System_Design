import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static int houseCountByOwnerName(List<House> houses , int ownerName){
//        int count = 0;
//
//        for(House house : houses){
//            if(house.getOwnerName().getOwnerId()== ownerName)
//                count++;
//        }
//        return count;
//    }
    public static void main(String[] args) {
        Owner owner1 = new Owner(101, "Subhadeep");
        Owner owner2 = new Owner(102, "Suman");


        Room room1 = new Room(001, 1, "Bed Room", 5.00, 6.50);
        Room room2 = new Room(002, 2, "Kitchen Room", 3.00, 2.75);
        Room room3 = new Room(003, 3, "Dinning Room", 8.00, 13.50);
        Room room4 = new Room(004, 4, "Common Room", 4.12, 7.30);
        Room room5 = new Room(005, 5, "Drawing Room", 5.80, 9.50);

        House house1 = new House(1, 1, owner1,room1);
        House house2 = new House(2, 2, owner2, room2);
        House house3 = new House(3, 3, owner2, room2);

        house1.addRoom(room1);
        house1.addRoom(room2);

        house2.addRoom(room3);
        house2.addRoom(room4);
        house2.addRoom(room5);

//        List<House> house = new ArrayList<>();
//        house.add(house1);
//        house.add(house2);
//        house.add(house3);

//        int ownerId = 102;
//        int count = houseCountByOwnerName(house , ownerId);



        System.out.println("Biggest Room is Room No : "+house1.getBiggestRoom().getRoomId() +" - "+ house1.getBiggestRoom().getRoomType());
        System.out.println("Owner name of the house is : "+house1.getOwnerName().getOwnerName());
        System.out.println("Total Room in house is : "+house1.roomCount());
//        System.out.println("Total house of "+ownerId +" : "+count);


    }

}