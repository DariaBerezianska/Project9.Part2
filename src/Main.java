class Movie {
    private String title;
    private String genre;
    private int yearOfRelease;
    private int viewingTime;
    private double filmRating;
    private double myFilmRating;

    public Movie(String title, int yearOfRelease, String genre, double myFilmRating) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.myFilmRating = myFilmRating;
    }

    public void setFilmRating(double filmRating) {
        this.filmRating = filmRating;
    }

    public double getFilmRating() {
        return filmRating;
    }

    public void setViewingTimeInMinutes(int viewingTime) {
        this.viewingTime = viewingTime;
    }

    public int getViewingTimeInMinutes() {
        return viewingTime;
    }

    public void printDetails() {
        System.out.println("Title: " + title
                + ", genre: " + genre
                + ", year of release: " + yearOfRelease
                + ", my rating of this movie: " + myFilmRating + "/10"
        );
    }

    public double viewingTimeInHours() {
        return Math.round(viewingTime / 60.0);
    }
}

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Sniper", 2022, "war", 7.4);
        movie1.printDetails();
        movie1.setFilmRating(6.2);
        System.out.println("People rated this movie " + movie1.getFilmRating() + "/10");
        movie1.setViewingTimeInMinutes(111);
        System.out.println("You will spent " + movie1.getViewingTimeInMinutes() + " minutes and " + movie1.viewingTimeInHours() + " hours to watch this film");
        System.out.println("========");
        Movie movie2 = new Movie("Through My Window", 2022, "drama", 6.1);
        movie2.printDetails();
        movie2.setFilmRating(5.4);
        System.out.println("People rated this movie " + movie2.getFilmRating() + "/10");
        movie2.setViewingTimeInMinutes(116);
        System.out.println("You will spent " + movie2.getViewingTimeInMinutes() + " minutes and " + movie2.viewingTimeInHours() + " hours to watch this film");
        System.out.println("========");
        Movie movie3 = new Movie("The Green Mile", 1999, "fantasy/drama", 10);
        movie3.printDetails();
        movie3.setFilmRating(8.6);
        System.out.println("People rated this movie " + movie3.getFilmRating() + "/10");
        movie3.setViewingTimeInMinutes(189);
        System.out.println("You will spent " + movie3.getViewingTimeInMinutes() + " minutes and " + movie3.viewingTimeInHours() + " hours to watch this film");
    }
}