import java.util.Map;

public class Purchase {
    protected Product[] purchases;

    public Purchase(int sizePurchase) {
        this.purchases = new Product[sizePurchase];
    }

    public void addPurchase(Product product) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = product;
                return;
            }
            if (purchases[i].getTitle().equals(product.getTitle())) {
                purchases[i].setCount(purchases[i].getCount() + product.getCount());
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Product purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.getTitle() + " " + purchase.getCount() + " шт. в сумме " + (purchase.getCount() * prices.get(purchase.getTitle())) + " руб.");
            sum += purchase.getCount() * prices.get(purchase.getTitle());
        }
        return sum;
    }
}