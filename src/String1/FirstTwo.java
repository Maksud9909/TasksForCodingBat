package String1;

public class FirstTwo {
    public static void main(String[] args) {
        FirstTwo firstTwo = new FirstTwo();
        System.out.println(firstTwo.firstTwo("h"));
    }
    public String firstTwo(String str) {
        String result = new String();
        if (str.length()>=2){
             str = str.substring(0,2);

        }
        return str;
    }

}
