package Warmup2;

public class FrontTimes {
    public  String frontTimes(String str, int n) {
        int frontLength = Math.min(3, str.length()); // Get the length of front, maximum 3
        String front = str.substring(0, frontLength); // Extract the front part of the string
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(front); // Append the front to the result n times
        }

        return result.toString();
    }
}

