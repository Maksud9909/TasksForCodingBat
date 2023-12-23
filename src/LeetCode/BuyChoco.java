package LeetCode;

public class BuyChoco {
    public  int leftoverMoney(int[] prices, int money) {
        int n = prices.length;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int totalCost = prices[i] + prices[j];
                if (totalCost <= money) {
                    int difference = money - totalCost;
                    minDifference = Math.min(minDifference, difference);
                }
            }
        }

        return minDifference == Integer.MAX_VALUE ? money : minDifference;
    }
}







//public int buyChoco(int[] prices, int money) {
//        int res = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if ((prices[0] + prices[1] == money) || (prices[0] + prices[2] == money)
//                    || (prices[1] + prices[2] == money)){
//                res = 0;
//            }
//            else {
//                res = money;
//            }
//        }
//        return res;
//    }