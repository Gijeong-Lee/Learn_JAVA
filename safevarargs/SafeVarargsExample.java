package annotation.general.safevarargs;

public class SafeVarargsExample {
    @SafeVarargs        //사용하지 않는 걸 추천
    public static <T> void printMessage(T... messages){
        for (T message : messages) {
            System.out.println(message);
        }
    }
}
