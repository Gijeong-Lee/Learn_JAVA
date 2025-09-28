package anonymous;

public class AnonymousMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

        // Dog, Cat과 달리 한번만 쓰고 버릴거다.
        // 같은 경우 익명 클래스
        Animal crow = new Animal() {
            @Override
            public void sound() {
                System.out.println("까악");
            }
        };

        crow.sound();

        Animal sparrow = new Animal() {
            @Override
            public void sound() {
                System.out.println(soundString() + soundString());
            }

            public String soundString() {
                return "짹짹";
            }
        };

        sparrow.sound();
    }
}
