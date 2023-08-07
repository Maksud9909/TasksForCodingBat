package Warmup2;

public class DoubleChar {
    public static void main(String[] args) {

        System.out.println(doubleChar("Maksud"));
    }
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            result.append(letter).append(letter);

        }
        return result.toString();
    }

}
