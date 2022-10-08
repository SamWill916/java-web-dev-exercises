package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {
    private Car test_car;
    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50, 1968);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void gasTankLevelAccurateAfterDriving(){
        test_car.drive(200);
        assertEquals(6, test_car.getGasTankLevel(), .01);
    }


    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

    //Creating Test for classic car
    @Test
    public void canDetermineIfClassicCar() {
        assertTrue(test_car.isClassic());
    }

}
