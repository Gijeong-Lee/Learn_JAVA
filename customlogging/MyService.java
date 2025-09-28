package customlogging;

public class MyService {

    @LogParams
    public void greet(String name, int age) {
        System.out.println("Hello " + name + ", age: " + age);
    }
}
