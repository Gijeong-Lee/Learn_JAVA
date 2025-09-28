package annotation.general.override;

public class overrideMain {
    public static void main(String[] args) {
        parent p1 = new parent();
        p1.printMessage();
        p1.printMessageNotOverride();

        parent p2 = new child();
        p2.printMessage();
        p2.printMessageNotOverride();
    }
}
