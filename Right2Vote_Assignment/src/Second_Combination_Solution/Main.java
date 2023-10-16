package Second_Combination_Solution;

public class Main {

    public static void main(String[] args) {
        int tShirtPrice = 50;
        int jeansPrice = 80;
        int jacketPrice = 100;
        int budget = 600;
        System.out.println("MY Combinations");

        for (int t = 1; t * tShirtPrice < budget; t++) {
            for (int j = 1; j * jeansPrice < budget; j++) {
                for (int k = 1; k * jacketPrice < budget; k++) {
                    if (t * tShirtPrice + j * jeansPrice + k * jacketPrice <= budget
                            && t >= 1 && j >= 1 && k >= 1
                            && budget - (t * tShirtPrice + j * jeansPrice + k * jacketPrice) < tShirtPrice) {
                        int totalBill = t * tShirtPrice + j * jeansPrice + k * jacketPrice;
                        int remainingMoney = budget - totalBill;
                        System.out.println("T-shirts :-  " + t + ", Jeans :- " + j + ", Jackets :- " + k + ", Total_Bill :- " + totalBill+ ", Balance Amount :- " + remainingMoney);
                    }
                }
            }
        }
    }
}
