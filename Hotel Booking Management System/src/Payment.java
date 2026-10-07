public class Payment {
    private int id;
    private String type;

    public Payment(int id, String type){
        this.id = id;
        this.type = type;
    }
    public int getPaymentId(){
        return id;
    }

    public String getPaymentType(){
        return  type;
    }
}
