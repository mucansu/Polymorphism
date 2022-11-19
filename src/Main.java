import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("New Harbor");
        book1.setAuthor("Jane Smith");
        book1.setPrice(200);
        Book book2 = new Book();
        book2.setTitle("Behind the Door");
        book2.setAuthor("John Anish");
        book2.setPrice(100);
        Movie movie1 = new Movie();
        movie1.setTitle("Movie1");
        movie1.setMovieGenre(String.valueOf(MovieGenre.DOCUMENTARY));
        movie1.setPrice(300);
        Movie movie2 = new Movie();
        Book[] books = new Book[2];
        books[0] = book1;
        books[1] = book2;
        Movie[] movies = new Movie[2];
        movies[0] = movie1;
        movies[1] = movie2;

        for (Book a: books) {
           a.printBookDetails();
        }
        for (Movie m : movies) {
            m.printMovieDetails();
        }
    }




}