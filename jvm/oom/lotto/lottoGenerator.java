package jvm.oom.lotto;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class lottoGenerator {
    public Set<Integer> generate() {
        Set<Integer> numbers = new HashSet<Integer>();
        while(numbers.size()<6){
            numbers.add(ThreadLocalRandom.current().nextInt(1, 46));
        }
        return numbers;
    }
}
