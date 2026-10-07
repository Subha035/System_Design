public class Ball {
    private int id;
    private boolean isOut;
    private int run;
    private Player batsman;
    private Player bowler;

    public Ball (int id, boolean isOut, int run, Player batsman, Player bowler) {
        this.id = id;
        this.isOut = isOut;
        this.run = run;
        this.batsman = batsman;
        this.bowler = bowler;
    }

    public int getBallId(){
        return  this.id;
    }
    public boolean getBallIsOut(){
        return this.isOut;
    }

    public int getBallRun(){
        return  this.run;
    }
    public String getBowlerName(){
        return this.bowler.getPlayerName();
    }
    public  String getBatsmanName(){
        return this.batsman.getPlayerName();
    }
}
