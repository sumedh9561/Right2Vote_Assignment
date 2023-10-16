package First_Combination_Solution;

import java.util.ArrayList;
import java.util.List;

public class My_Combinations {

    public static void main(String[] args) {
        int budget = 600;
        int tShirtPrice = 50;
        int jeansPrice = 80;
        int jacketPrice = 100;

        findCombinations(budget, tShirtPrice, jeansPrice, jacketPrice);
    }

    public static void findCombinations(int budget, int tShirtPrice, int jeansPrice, int jacketPrice) {
        List<List<Integer>> combinations = new ArrayList<>();
        int maxTShirts = budget / tShirtPrice;
        int maxJeans = budget / jeansPrice;
        int maxJackets = budget / jacketPrice;

        for (int t = 1; t <= maxTShirts; t++) {
            for (int j = 1; j <= maxJeans; j++) {
                for (int k = 1; k <= maxJackets; k++) {
                    int totalCost = t * tShirtPrice + j * jeansPrice + k * jacketPrice;
                    if (totalCost <= budget - tShirtPrice) {
                        List<Integer> combination = new ArrayList<>();
                        combination.add(t);
                        combination.add(j);
                        combination.add(k);
                        combination.add(totalCost);
                        combination.add(budget - totalCost);
                        combinations.add(combination);
                    }
                }
            }
        }

        System.out.println("My Possible Combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println("T-shirts :- " + combination.get(0) + ", Jeans :- " + combination.get(1) + ", Jackets :- " + combination.get(2) +
                    ", Total Price :- " + combination.get(3) + ", Balance Amount :- " + combination.get(4));
        }
    }


}



