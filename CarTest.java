package anotation.custom;

import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    public void testGetModelIonic(){
        Car car = new Car("Ionic", 2021);
        car.getModel();
    }

    @Test
    public void testGetModelSonata(){
        Car car = new Car("Sonata", 2021);
        car.getModel();
    }

    @Test
    public void testGetModelGrandeur(){
        Car car = new Car("Grandeur", 2021);
        car.getModel();
    }

    @Test
    public void testGetModelAvacte(){
        Car car = new Car("Avacte", 2021);
        car.getModel();
    }

    @Test
    public void testGetModelMorning(){
        Car car = new Car("Morning", 2021);
        car.getModel();
    }

    @Test
    public void testGetModelNO(){
        Car car = new Car("SM5", 2021);
        car.getModel();
    }

}