package jvm.oom.lotto2;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class lottoGenerator2 {
    public List<Integer> generate() {
        List<Integer> numbers = new ArrayList<Integer>();
        while(numbers.size()<6){
            numbers.add(ThreadLocalRandom.current().nextInt(1, 46));
        }
        return numbers;
    }
}
