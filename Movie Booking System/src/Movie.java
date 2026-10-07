public class Movie {
    private int id;
    private String name;
    private String duration;
    private String language;

    public  Movie(int id, String name, String duration , String language){
        this.id = id;
        this.name = name;
        this.duration = duration ;
        this.language = language;
    }

    public int getMovieId(){
        return this.id;
    }
    public String getMovieName(){
        return this.name;
    }

    public String getMovieDuration(){
        return this.duration;
    }

    public String getMovielanguage(){
        return  this.language;
    }
}
