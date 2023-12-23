package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static void main(String[] args) {

    }
    public List<String> addStar(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String str:strings){
            list.add(str + "*");
        }
        return list;
    }

}
