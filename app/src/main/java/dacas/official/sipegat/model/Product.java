package dacas.official.sipegat.model;

public class Product {
    private String kodeProduct;
    private String productName;
    private String imageProduct;
    private int price;
    public Product(String kode, String name, int price, String img){
            this.kodeProduct = kode;
            this.productName = name;
            this.price = price;
            this.imageProduct = img;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {

        this.imageProduct = imageProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKodeProduct() {
        return kodeProduct;
    }

    public void setKodeProduct(String kodeProduct) {
        this.kodeProduct = kodeProduct;
    }
}
