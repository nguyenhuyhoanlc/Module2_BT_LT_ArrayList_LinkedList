import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static final Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {
        System.out.print("Nhập n sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0 ; i < n ; i ++){
            addProduct();
        }
        displayAllProduct();
        productManager.removeProductById(12);
    }

    public static void addProduct(){
        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.print("Nhập mã sản phẩm: ");
        int numberID = scanner.nextInt();
        System.out.println("Nhập giá sản phẩm: ");
        int priceProduct = scanner.nextInt();
        scanner.nextLine();
        productManager.addProduct(new Product(nameProduct, priceProduct, numberID));
    }

    public static void displayAllProduct(){
        System.out.println(productManager);
    }

}

