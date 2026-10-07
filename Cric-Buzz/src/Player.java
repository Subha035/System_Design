public class Player {
    private int id;
    private String name;
    private String role;

    public Player(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
    public int getPlayerId() {
        return this.id;
    }

    public String getPlayerName() {
        return this.name;
    }

    public String getPlayerRole() {
        return this.role;
    }

}
