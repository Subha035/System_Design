public class Address {
    private int id;
    private String name;

    public Address(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getAddressId(){
        return this.id;
    }

    public String getAddressName() {
        return this.name;
    }
}
