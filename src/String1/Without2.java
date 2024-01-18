package String1;

public class Without2 {
    public static void main(String[] args) {
        Without2 without2  =new Without2();
        System.out.println(without2.without2("HelloHi"));
    }
    public String without2(String str) {
        String firstTwo = str.substring(0,2);
        String lastTwo = str.substring(str.length()-2);

        if (str.length()>=2 && firstTwo.equals(lastTwo)){
            return str.substring(2);
        }else {
            return str;
        }
    }

}
