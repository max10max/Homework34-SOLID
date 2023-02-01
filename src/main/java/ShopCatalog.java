import java.util.HashMap;
import java.util.Map;

public class ShopCatalog {
    private static String[] allProducts = {"Хлеб", "Масло", "Колбаса", "Пирожок"};
    private static int[] allPrice = {56, 153, 211, 45};

    public static Map<String, Integer> printCatalog() {
        Map<String, Integer> productsCatalog = new HashMap<>();
        for (int i = 0; i < allProducts.length; i++) {
            productsCatalog.put(allProducts[i], allPrice[i]);
        }
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : productsCatalog.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
        return productsCatalog;
    }
}
