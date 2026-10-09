import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int minPrice = prices[0];
        int maxProfit = 0;
        int buyPrice = prices[0];
        int sellPrice = prices[0];

        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
                buyPrice = minPrice;
                sellPrice = prices[i];
            }
        }

        System.out.println("Buy Price : " + buyPrice);
        System.out.println("Sell Price: " + sellPrice);
        System.out.println("Maximum Profit: " + maxProfit);

        sc.close();
    }
}