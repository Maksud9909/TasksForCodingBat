package String2;

import java.lang.ref.SoftReference;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        boolean res = false;
        char [] arr = str.toCharArray();
        if (str.isEmpty() || str == null || str.equals("*") || str.equals("**")){
            return true;
        }
        for (int i = 1; i < arr.length -1; i++) {
            int lastElement = arr[arr.length - 1];
            if (arr[i] == '*'){
                if (arr[i-1] == arr[i+1] || arr[i-1] == lastElement){
                    res =  true;
                }
                else {
                    res = false;
                }
            }

        }
        return res;
    }

}
