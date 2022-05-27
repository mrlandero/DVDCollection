public class DVD {

    //Fields:
    private String title; //Title of this DVD
    private String rating; //MPAA rating of this DVD
    private int runningTime; //Director of this DVD

    public DVD(String dvdTitle, String dvdRating, int dvdRunningTime) {
        setTitle(dvdTitle);
        setRating(dvdRating);
        setRunningTime(dvdRunningTime);
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setTitle(String newTitle) {
        title = newTitle.toUpperCase();
    }

    public void setRating(String newRating) {
        rating = newRating;
    }

    public void setRunningTime(int newRunningTime) {
        runningTime = newRunningTime;
    }

    public String toString() {
        return "DVD Title: " + this.title + "\n"
        + "DVD Rating: " + this.rating + "\n"
        + "DVD Running Time: " + this.runningTime + "\n";
    }

}