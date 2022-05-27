import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class DVDCollection {
    
    //Data Fields

    /**The current number of DVDs in the array */
    private int numdvds;

    /**The array to contain the DVDs */
    private DVD[] dvdArray;

    /**The name of the data file that contains dvd data */
    private String sourceName;

    /**Boolean flag to indicate whether the DVD collection was
     * modified since it was last saved */
    private boolean modified;

    /**
     * Constructs an empty directory as an array
     * with an initial capacity of 7. When we try to 
     * insert into a full array, we'll double the size of
     * the array first.
     */
    public DVDCollection() {
        numdvds = 0;
        dvdArray = new DVD[7];
    }

    public String toString() {
        //Return a string containing all the DVDs in the
        //order they are stored in the array along with
        //the values for numdvds and the length of the array.
        String dvdString = "";
        dvdString += ("numbdvds = " + numdvds + '\n');
        dvdString += ("dvdArray.length = "+ dvdArray.length + '\n');
        for(int i = 0; i < numdvds; i++) {
            dvdString += ("dvdArray[" + i + "] = " + dvdArray[i].toString() + '\n');
        }
        return dvdString;
    }

    public void addOrModifyDVD(String title, String releaseDate, String rating, String director, String studio) {
        //If the array is full and a new DVD needs to be added,
        //double the size of the array first
        if(validRating(rating))
    }
}
