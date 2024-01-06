package Logic2;

public class BlackJack {

    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));  // Output: 21
        System.out.println(blackjack(21, 19));  // Output: 21
        System.out.println(blackjack(19, 22));  // Output: 19
    }

    public static int blackjack(int a, int b) {
        // Check if both values are greater than 21
        if (a > 21 && b > 21) {
            return 0;
        }

        // Check which value is closer to 21 without going over
        if (a <= 21 && (b > 21 || Math.abs(21 - a) < Math.abs(21 - b))) {
            return a;
        } else {
            return b;
        }
    }
}

