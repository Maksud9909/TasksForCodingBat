package Logic1;

public class ShareDigits {
    public boolean shareDigit(int a, int b) {
        boolean result = false;
        String aStr = String.valueOf(a); // 12
        String bStr = String.valueOf(b); // 43
        for (int i = 0; i < aStr.length(); i++) {
            for (int j = 0; j < bStr.length(); j++) {
                if (i==j){
                    result = true;
                }else {
                    result = false;

                }
            }
        }
        return result;
    }






    public static boolean hasCommonDigit(int num1, int num2) {
        while (num1 > 0) {
            int digit1 = num1 % 10; // Get the rightmost digit of num1
            int tempNum2 = num2;
            while (tempNum2 > 0) {
                int digit2 = tempNum2 % 10; // Get the rightmost digit of num2
                if (digit1 == digit2) {
                    return true;
                }
                tempNum2 /= 10; // Move to the next digit in num2
            }
            num1 /= 10; // Move to the next digit in num1
        }
        return false; // If no common digit is found
    }

}

