public class DVD {

    //Fields:
    private String title; //Title of this DVD
    private String releaseDate; //Release date of this DVD
    private String rating; //MPAA rating of this DVD
    private String director; //Director of this DVD
    private String studio; //The studio of this DVD

    public DVD(String dvdTitle, String dvdReleaseDate, String dvdRating, String dvdDirector, String dvdStudio) {
        setTitle(dvdTitle);
        setReleaseDate(dvdReleaseDate);
        setRating(dvdRating);
        setDirector(dvdDirector);
        setStudio(dvdStudio);
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public String getStudio() {
        return studio;
    }

    public void setTitle(String newTitle) {
        title = newTitle.toUpperCase();
    }

    public void setReleaseDate(String newReleaseDate) {
        releaseDate = newReleaseDate;
    }

    public void setRating(String newRating) {
        rating = newRating;
    }

    public void setDirector(String newDirector) {
        director = newDirector;
    }

    public void setStudio(String newStudio) {
        studio = newStudio;
    }

    public String toString() {
        return "DVD Title: " + this.title + "\n"
        + "DVD Release Date: " + this.releaseDate + "\n"
        + "DVD Rating: " + this.rating + "\n"
        + "DVD Director: " + this.director + "\n"
        + "DVD Studio: " + this.studio + "\n";
    }

}