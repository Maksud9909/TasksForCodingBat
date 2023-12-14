package String2;

public class StarOut {
    public String starOut(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == '*'){
                continue;
            }

            if (i > 0 && str.charAt(i-1) == '*'){
                continue;
            }

            if (i < str.length() - 1 && str.charAt(i + 1) == '*'){
                continue;
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}


