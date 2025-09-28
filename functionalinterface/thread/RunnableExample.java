package functionalinterface.thread;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello world");

        Thread thread = new  Thread(task);
        thread.start();
    }
}
