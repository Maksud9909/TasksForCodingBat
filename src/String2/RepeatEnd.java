package String2;

public class RepeatEnd {
    public static void main(String[] args) {
        RepeatEnd repeatEnd = new RepeatEnd();
        System.out.println(repeatEnd.repeatEnd("Hello",2));

    }
    public String repeatEnd(String str, int n) {
        str = str.substring(str.length() - n,str.length());
        return str.repeat(n);
    }

}
