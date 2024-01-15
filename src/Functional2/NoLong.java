package Functional2;

import java.util.List;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(string -> string.length() > 3);
        return strings;
    }

}
