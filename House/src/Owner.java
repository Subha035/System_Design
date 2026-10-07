import java.util.ArrayList;
import java.util.List;

public class Owner {
    private int id;
    private String ownerName;
    private List<House> houses;

    public  Owner(int id , String ownerName){
        this.id = id;
        this.ownerName = ownerName;
        this.houses = new ArrayList<>();
    }

    public int getOwnerId(){
        return id;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public int getHouseCount(){
        return houses.size();
    }
}
