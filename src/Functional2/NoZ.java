package Functional2;

import java.util.ArrayList;
import java.util.List;

public class NoZ {
    public static void main(String[] args) {

        String s = new String("Maks");
        System.out.println(s.charAt(1));
    }
    public static List<String> noZ(List<String> strings) {
        List<String>list = new ArrayList<>();
        for (String str:strings){
            if (!str.contains("z")){
                list.add(str);
            }
        }
        return list;
    }

}
