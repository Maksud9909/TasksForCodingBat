package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nox {
    public List<String> noX(List<String> strings) {
        List<String>list =new ArrayList<>();
        for (String str:strings){
            list.add(str.replace("x",""));
        }
        return list;
    }

}
