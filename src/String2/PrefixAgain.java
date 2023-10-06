package String2;

public class PrefixAgain {
    public static void main(String[] args) {
        prefixAgain("abXYabc", 3);
    }
    public static boolean prefixAgain(String str, int n) {
        String preResult = str.substring(0,n);
        System.out.println(preResult);
        if (str.substring(n,str.length()).contains(preResult)){
            return true;
        }else {
            return false;
        }
    }

}
