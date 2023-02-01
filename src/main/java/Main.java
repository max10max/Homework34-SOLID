import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> products = (HashMap<String, Integer>) ShopCatalog.printCatalog();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase(products.size());
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            Product product = new Product(parts[0], Integer.parseInt(parts[1]));
            purchase.addPurchase(product);
        }
        long sum = purchase.sum(products);
        System.out.println("ИТОГО: " + sum);
    }
}