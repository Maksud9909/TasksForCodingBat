package String1;

public class ConCat {
    public static void main(String[] args) {
        ConCat conCat = new ConCat();
        System.out.println(conCat.conCat("abc",""));


    }
    public String conCat(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0){
            return str1 + str2;
        }
        else if (str1.charAt(str1.length() - 1) == str2.charAt(0)){
            return str1.substring(0,str1.length() - 1) + str2;
        }
         else {
            return str1 + str2;
        }
    }

}
//str1.substring(str1.length() - 1) == str2.substring(0,1))