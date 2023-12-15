package String1;

public class startWord {
    public String startWord(String str, String word) {
        String result = null;
        if (str.length() == 1){
            int countLetters = word.length();
            result = str.substring(0,countLetters);
        }
        return result;
    }

}
