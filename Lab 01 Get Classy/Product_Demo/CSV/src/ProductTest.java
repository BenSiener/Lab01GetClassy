import org.junit.Test;
import java.util.ArrayList;

public class ProductTest {
     public static void main(String[] args) {

            ArrayList<Product> productArray = new ArrayList<>();

            productArray.add(new Product("01", "Fish", "Food", 5.50));
            productArray.add(new Product("02", "Cheese", "Old Milk", 19.92));
            productArray.add(new Product("03", "French", "Fry", 5.00));

            for (Product productList : productArray) {

                System.out.println(productList.toCSVDataRecord());
            }
            System.out.println();
        }
    }


