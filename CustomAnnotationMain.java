package anotation.custom;

public class CustomAnnotationMain {
    public static void main(String[] args) {
        Car car = CarFactory.createCar(new CarRequest("BMW", 2021));
        System.out.println(car);
    }
}
