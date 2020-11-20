package gui.ceng.mu.edu.mymoviebrowser;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


public class Movie implements Parcelable {
    private String name;
    private String director;
    private int year;
    private List<String> stars = new ArrayList<>();
    private String description;

    public Movie(String pulp_fiction, String director, int year, List<String> stars, String description) {
        this.director = director;
        this.year = year;
        this.stars = stars;
        this.description = description;
    }

    protected Movie(Parcel in) {
        name = in.readString();
        director = in.readString();
        year = in.readInt();
        stars = in.createStringArrayList();
        description = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(director);
        dest.writeInt(year);
        dest.writeStringList(stars);
        dest.writeString(description);
    }
}
