package ex4_Stock;

public class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("Google", 100);
        google.updatePrice(1100);
        google.updatePrice(40);
        google.updatePrice(110);
        google.updatePrice(50);
        google.printInformation();
    }
}