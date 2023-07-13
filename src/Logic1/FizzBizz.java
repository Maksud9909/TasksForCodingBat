package Logic1;

public class FizzBizz {
    public String fizzString(String str) {
        String fizz = "Fizz";
        String bizz = "Buzz";
        String fizzBizz = "FizzBuzz";
         if (str.startsWith("f") && str.endsWith("b")) {
            return fizzBizz;
        }
        else if (str.startsWith("f")){
            return fizz;
        }else if (str.endsWith("b")){
            return bizz;
        }else {
            return str;
        }
    }

}
