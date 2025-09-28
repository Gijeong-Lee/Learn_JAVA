package anotation.custom;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomAnnotationMainTest {
    //2000 ~ 2025
    @Test
    public void testValidYearRange(){
        Car car = CarFactory.createCar(new CarRequest("BMW", 2021));
        Assertions.assertThat(car.getYear()).isEqualTo(2021);
        System.out.println(car);
    }

    @Test
    public void testInValidYearRange(){
        Assertions.assertThatThrownBy(() -> CarFactory.createCar(new CarRequest("BMW", 2026)))
                        .isInstanceOf(IllegalArgumentException.class);
    }

}