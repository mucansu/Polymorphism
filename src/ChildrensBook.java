public class ChildrensBook extends Book{
    private String recommendedAgeInfo;

    public ChildrensBook(String recommendedAgeInfo, String title, String author, int price) {
        super(title, author, price);
        this.recommendedAgeInfo = recommendedAgeInfo;

    }
    public void printDetails(){
        super.printDetails();
        System.out.println(recommendedAgeInfo);
    }
}
