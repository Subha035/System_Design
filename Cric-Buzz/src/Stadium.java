public class Stadium {
    private  int id;
    private Address address;
    private String StadiumName;

    public Stadium(int id, Address address, String stadiumName) {
        this.id = id;
        this.address = address;
        this.StadiumName = stadiumName;
    }
    public int getStadiumId(){
        return this.id;
    }
    public Address getStadiumAddress(){
        return this.address;
    }
    public  String getStadiumName(){
        return this.StadiumName;
    }
}
