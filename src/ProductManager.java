import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products=new ArrayList<>();

    public void addProduct(Product product){
        this.products.add(product);
    }

    public Product getProductBtID(int numberID){
        for (Product product : products) {
            if (product.getNumberID() == numberID) return product;
        }
        return null;
    }

    public Product getProductByName(String name){
        for (Product product : products){
            if (product.getNameProduct().equals(name)) return product;
        }
        return null;
    }

    public void setProductById(int numberID, String newName){
        this.getProductBtID(numberID).setNameProduct(newName);
    }

    public void removeProductById(int numberID){
        this.products.remove(getProductBtID(numberID));
    }

    public List<Product>getProducts(){
        return new ArrayList<>(this.products);
    }

    @Override
    public String toString() {
        String result="";
        for (Product product:products) {
            result+=product.toString();
        }
        return result;
    }
}

