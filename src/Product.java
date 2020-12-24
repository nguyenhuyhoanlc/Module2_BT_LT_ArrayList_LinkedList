public class Product {
    private String nameProduct;
    private int priceProduct;
    private int numberID;

    public Product(){

    }

    public Product(String nameProduct, int priceProduct, int numberID) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.numberID = numberID;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public int getNumberID() {
        return numberID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", numberID=" + numberID +
                '}';
    }
}
