package Warmup2;

public class StringBeats {
    public String stringBits(String str) {
        int resultString[] = new int[]{str.length() / 2};
        StringBuilder result = new StringBuilder("");
        for (int num:
             resultString) {
            char character = str.charAt(num);
            result.append(character);
        }
        return String.valueOf(result);
    }

}
