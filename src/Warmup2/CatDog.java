package Warmup2;

public class CatDog {
    public boolean catDog(String str) {
        boolean result = false;
        int cats = 0;
        int dogs = 0;
        if (str.contains("cat")){
            cats +=1;
        }else if(str.contains("dog")){
            dogs+=1;
        }
        if (cats == dogs){
            result = true;
        }else {
             result = false;
        }
        return result;
    }
}
