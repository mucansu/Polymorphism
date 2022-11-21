public class Book extends Product{

       protected String author;
    protected String title;
    public Book(int productId) {
        this.productId = productId;
    }



    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
                this.title = title;
        }

        public void setAuthor(String author) {
                this.author = author;
        }


        public String getTitle() {
                return title;
        }

        public String getAuthor() {
                return author;
        }


        public void printDetails2(){
            System.out.println("Here are the details of the book : ");
            super.printDetails();
            System.out.println("Title : " + title);
            System.out.println("Author : " + author);
            System.out.println("");
        }
}
