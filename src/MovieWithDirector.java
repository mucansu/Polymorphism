public class MovieWithDirector extends Movie {
    String director;
    public MovieWithDirector(String title, MovieGenre genre, int price,int productId, String director) {
        super(title, genre, price, productId);
    this.director = director;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Director : " + director);
        System.out.println("");
    }

}
