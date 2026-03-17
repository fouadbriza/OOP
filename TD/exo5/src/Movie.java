public class Movie {
    private String title;
    private int productionYear;
    private String director;
    private String[] actors;
    private String synopsis;

    public Movie(String title, int productionYear, String director,
                 String[] actors, String synopsis) {
        this.title = title;
        this.productionYear = productionYear;
        this.director = director;
        this.actors = actors;
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getDirector() {
        return director;
    }

    public String[] getActors() {
        return actors;
    }

    public String getSynopsis() {
        return synopsis;
    }
}