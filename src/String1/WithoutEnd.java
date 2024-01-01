package String1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.substring(1,str.length()-1));
        return stringBuilder.toString();
    }

}
