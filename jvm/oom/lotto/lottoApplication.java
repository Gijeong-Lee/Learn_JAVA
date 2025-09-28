package jvm.oom.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class lottoApplication {
    private static final List<Set<Integer>> lottoHistory = new ArrayList<>();
    public static void main(String[] args) {
        lottoGenerator generator = new lottoGenerator();
        while(true){
            Set<Integer> lottoNumbers = generator.generate();
            System.out.println(lottoNumbers);
            lottoHistory.add(lottoNumbers);

        }
    }
}
