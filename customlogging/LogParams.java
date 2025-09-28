package customlogging;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // 실행 중에도 사용할 수 있게
@Target(ElementType.METHOD)        // 메서드에 붙일 수 있게
public @interface LogParams {
}
