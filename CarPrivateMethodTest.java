package anotation.custom;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.time.LocalDate;

import org.assertj.core.api.Assertions;

class CarPrivateMethodTest {
    @Test
    public void NeedMaintenance() throws Exception{
        int yearMaintenance = LocalDate.now().getYear() - 6;
        Car carMaintanance = new Car("TestModel", yearMaintenance);

        Method method = Car.class.getDeclaredMethod("isNeedMaintenance");
        method.setAccessible(true);
        boolean resultMaintenance = (boolean) method.invoke(carMaintanance);

        Assertions.assertThat(resultMaintenance).isTrue();
    }

    @Test
    public void NotNeedMaintenance2() throws Exception{
        int yearMaintenance = LocalDate.now().getYear() - 4;
        Car carMaintanance = new Car("TestModel", yearMaintenance);

        Method method = Car.class.getDeclaredMethod("isNeedMaintenance");
        method.setAccessible(true);
        boolean resultMaintenance = (boolean) method.invoke(carMaintanance);

        Assertions.assertThat(resultMaintenance).isFalse();
    }

    @Test
    public void NeedChangeOil() throws Exception{
        int yearChangeOil = LocalDate.now().getYear() - 1;
        Car carChangeOil = new Car("TestModel", yearChangeOil);

        boolean resultChangeOil = carChangeOil.isNeedChangeOil();

        Assertions.assertThat(resultChangeOil).isTrue();
    }

    @Test
    public void NotNeddChangeOil() throws Exception{
        int yearChangeOil = LocalDate.now().getYear();
        Car carChangeOil = new Car("TestModel", yearChangeOil);

        boolean resultChangeOil = carChangeOil.isNeedChangeOil();

        Assertions.assertThat(resultChangeOil).isFalse();
    }
}