package jvm.oom.lotto2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class lottoApplication2 {
    private static final List<List<Integer>> lottoHistory = new ArrayList<>();
    public static void main(String[] args) {
        lottoGenerator2 generator = new lottoGenerator2();
        while(true){
            List<Integer> lottoNumbers = generator.generate();
            System.out.println(lottoNumbers);

            if(lottoNumbers.size() >100) {
                lottoHistory.clear();
            }
            lottoHistory.add(lottoNumbers);

        }
    }
}