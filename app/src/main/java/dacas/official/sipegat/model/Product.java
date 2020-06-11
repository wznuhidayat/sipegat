package dacas.official.sipegat.model;

public class Product {
    private String productName;
    private int imageProduct;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(int imageProduct) {

        this.imageProduct = imageProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
