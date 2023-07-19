package LeetCode;

import java.io.File;
import java.util.HashSet;
import java.util.Hashtable;

import java.util.HashSet;

public class Solution {
    public int maxNumOfPairs(String[] words) {
        int count = 0;
        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            String reverseWord = reverseString(word);

            if (set.contains(reverseWord)) {
                count++;
                set.remove(reverseWord);
            } else {
                set.add(word);
            }
        }

        return count;
    }

    private String reverseString(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}

//    public static void main(String[] args) {
//        String[] words = {"cd", "ac", "dc", "ca", "zz"};
//        Solution solution = new Solution();
//    }
//}
//
//
//    public int maximumNumberOfStringPairs(String[] words) {
//
//        int count = 0;
//        HashSet <String> hashSet = new HashSet<>();
//        for (String word: words) {
//            String forStrBuilder = new String(word);
//            StringBuilder reverseWord =
//        }
//    }
//}
//
//
//
////String str = "Hello, World!";
////StringBuilder sb = new StringBuilder(str);
////String reversedStr = sb.reverse().toString();
////System.out.println(reversedStr);
//
//















//public int maximumNumberOfStringPairs(String[] words) {
//        int result = 0;
//        for (int i = 1; i < words.length; i++) {
//            String currentElement = words[i];
//            String previousElement = words[i - 1];
//            if (currentElement.contains(previousElement)){
//                result +=1;
//            }
//            else {
//                return result+=0;
//            }
//        }
//        return result;
//    }