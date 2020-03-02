package LeetCode.easy;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    private List <String> fizzBuzz(int n) {
        List<String> result = new ArrayList <>();
        for(int i=1;i<=n;i++){
            if(i%15==0)
                result.add("FizzBuzz");
            else  if(i%3==0)
                result.add("Fizz");
            else if(i%5==0)
                result.add("Buzz");
            else
                result.add(Integer.toString(i));
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(n));
    }
}