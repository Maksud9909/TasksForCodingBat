package Logic1;

public class LessBy10 {
    public static void main(String[] args) {
        int res = 18 % 20;
        System.out.println(res);
    }
    public boolean lessBy10(int a, int b, int c) {
      if (a - b >= 10 || b - a >= 10 || a - c >= 10 || c-a >=10 || b-c >= 10 || c-b>=10){
          return true;
      }else {
          return false;
      }
    }

}
