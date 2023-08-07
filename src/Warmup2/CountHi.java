package Warmup2;

public class CountHi {
    public int countHi(String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i,i+2).equals("hi")){
                result +=1;
            }else {
                result+=0;
            }
        }
        return result;

    }

}
