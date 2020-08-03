package dacas.official.sipegat.model;

public class Product {
    private String productName,DescProduct;
    private int imageProduct;
    private int price;


    public Product(String productName, int price,String desc) {
        this.productName = productName;
        this.price = price;
        this.DescProduct = desc;
    }

    public Product() {

    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescProduct() {
        return DescProduct;
    }

    public void setDescProduct(String descProduct) {
        DescProduct = descProduct;
    }
    @Override
    public String toString(){
        return " "+productName+"\n"+" "+price+"\n"+" "+DescProduct;
    }
}
