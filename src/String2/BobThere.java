package String2;

import javax.print.DocFlavor;

public class BobThere {
    public boolean bobThere(String str) {
        int len = str.length();
        for (int i = 0; i < len - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
                return   true;
            }
        }
        return false;
    }

}


//    public boolean bobThere(String str) {
//
//        int len = str.length();
//

//
//        for (int i = 0; i < len - 2; i++) {
//
//            if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
//
//            return true;
//
//        }
//
//        return false;
//
//    }
