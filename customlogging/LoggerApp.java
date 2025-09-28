package customlogging;

import java.lang.reflect.Method;

public class LoggerApp {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();

        // 메서드 찾기
        Method method = MyService.class.getMethod("greet", String.class, int.class);

        // Annotation이 붙어 있는지 확인
        if (method.isAnnotationPresent(LogParams.class)) {
            Object[] params = {"Alice", 25};  // 실제 호출할 값
            System.out.println("호출한 메서드: " + method.getName());
            for (Object p : params) {
                System.out.println("매개변수: " + p);
            }
            // 메서드 실행
            method.invoke(service, params);
        }
    }
}
