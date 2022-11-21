public class Movie extends Product{
   protected MovieGenre genre;
    protected String title;



    public Movie() {

    }


    public void setTitle(String title) {
        this.title = title;
    }

    public Movie(String title, MovieGenre genre, int price,int productId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.productId = productId;
    }

    public void setMovieGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre getMovieGenre() {
        return genre;
    }


    public void printDetails(){
        System.out.println("Here are the details of the movie : ");
        super.printDetails();
        System.out.println("Title : " + title);
        System.out.println("Author : " +genre);
        System.out.println("");

    }
}
