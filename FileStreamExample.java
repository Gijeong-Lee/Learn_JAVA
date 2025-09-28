import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileStreamExample {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // 읽을 파일 경로

        try {
            // Files.lines() → Stream<String> 반환
            Files.lines(Paths.get(filePath))
                    .map(String::toUpperCase)   // 모든 라인을 대문자로 변환
                    .forEach(System.out::println); // 출력
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
