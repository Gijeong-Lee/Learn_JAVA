package stream;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationTest {
    private final Faker faker = new Faker();

    // 1~10 사이의 숫자를 받아 짝수만 필터링
    @Test
    void filter() {
        //List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i <= 10; i++) {
//            numbers.add(i);
//        }
//
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .toList();
//
//        System.out.println(evenNumbers);

        List<Integer> evenNumbers = IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .boxed()
                .toList();

        System.out.println(evenNumbers);
    }

    // 10명의 이름 리스트에서 이름 -> 이름 길이로 변환
    @Test
    void Map() {
        List<String> names = Stream.generate(() -> faker.name().fullName())
                .limit(10)
                .toList();
        System.out.println(names);

        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .toList();

        System.out.println(nameLengths);
    }

    // 10명의 이름을 받아서 그 이름을 한글자씩 나눈 list를 만든다
    // 그리고 map, flatMap의 차이를 확인한다.
    @Test
    void mapVsflatMap() {
        List<String> names = Stream.generate(() -> faker.name().fullName())
                .limit(10)
                .toList();
        System.out.println(names);

        List<List<String>> nameCharacters1 = names.stream()
                .map(s -> List.of(s.split("")))
                .toList();
        System.out.println(nameCharacters1);

        List<String> nameCharacters2 = names.stream()
                .flatMap(s -> Stream.of(s.split("")))
                .toList();
        System.out.println(nameCharacters2);
    }

    // 1~100 의 숫자를 받고, 5로 나눈 나머지 list를 만든가.
    // 그 다음 중복을 제거한다.
    @Test
    void distinct() {
        List<Integer> numbers = IntStream.rangeClosed(1, 100)
                .map(i -> i % 5)
                .boxed()
                .toList();
        System.out.println(numbers);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .toList();
        System.out.println(distinctNumbers);
    }

    // 1~100 사이의 랜덤 숫자를 받아서 정렬
    @Test
    void sorted() {
        List<Integer> numbers = Stream.generate(() -> faker.number().numberBetween(1, 100))
                .limit(10)
                .toList();
        System.out.println(numbers);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sortedNumbers);
    }

    // 1~100 사이의 랜덤 숫자 10개를 받아서 역순 정렬
    // 4개 skip 후 출력
    @Test
    void skip() {
        List<Integer> numbers = Stream.generate(() -> faker.number().numberBetween(1, 100))
                .limit(10)
                .toList();
        System.out.println(numbers);

        List<Integer> skipNumbers = numbers.stream()
                .skip(4)
                .toList();
        System.out.println(skipNumbers);
    }
}



