public abstract class Product {

    protected int price;
    protected int productId;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void printDetails(){
        System.out.println("Price : " + price);
        System.out.println("Product ID : " + productId);
    }



}
