package tests;

public class StockDetector {
    int minPrice = 10;
    int maxPrice = 100;

    public void detector(String stockName, int stockPrice) {
        if ("Apple".equals(stockName)) {
            buy();
        } else if ("Gamestop".equals(stockName)) {
            sell();
        } else {
            if (stockPrice > maxPrice) {
                sell();
            } else if (stockPrice < minPrice) {
                buy();
            }
        }
    }

        private void buy () {
            System.out.println("You have bought something");
        }

        private void sell () {
            System.out.println("You have sold something");
        }
    }
