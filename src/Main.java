import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("New Harbor","Jane Smith",200);
        Book book2 = new Book("Behind the Door","John Anish",100);
        Movie movie1 = new Movie("Movie1", MovieGenre.DOCUMENTARY,300,42312);
        Movie movie2 = new Movie("Movie2",MovieGenre.COMEDY,400,421321);
        ArrayList<Product> products = new ArrayList<>();
        products.add(book1);
        products.add(book2);
       products.add(movie1);
       products.add(movie2);


        ChildrensBook childrensBook = new ChildrensBook("from 4 years","ChildrensBook","Author1",100);
        products.add(childrensBook);

        for (Product a: products) {

                a.printDetails();

        }
       // Product book3 = new Book();
       // Product movie3 = new Movie();



    }
}