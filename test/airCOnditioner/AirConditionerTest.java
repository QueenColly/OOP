package airCOnditioner;

import airConditioner.AirConditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner samsung;

    @BeforeEach
        public void setUp() {
        samsung = new AirConditioner();
    }


    @Test
        public void iHaveAn_AirConditioner_andItsOffButNeeds_toBeTurnedOn() {
        samsung.turnOn();
        assertTrue(samsung.checkPowerStatus());
    }

    @Test
        public void iHaveAn_AirConditioner_andItsOnButNeeds_toBeTurnedOff() {
        samsung.turnOn();
        samsung.turnOff();
        assertFalse(samsung.checkPowerStatus());
    }

    @Test
        public void iHaveAn_AirConditionerMyAcIsOn_andItIncreasesWhenI_increaseTheTemperature() {

        samsung.turnOn();
        samsung.increaseTemperature();
        boolean actual = samsung.increaseTemperature();
        boolean expected = true;
        assertTrue(actual);
        assertEquals(expected, actual);
    }

    @Test
        public void iHaveAn_AirConditionerMyAcIsOn_andItDecreasesWhenI_decreaseTheTemperature() {

        samsung.turnOn();
        boolean check =samsung.checkPowerStatus();
        assertTrue(check);
        boolean actual = samsung.decreaseTemperature();
        boolean expected = true;
        assertTrue(actual);
        assertEquals(expected, actual);
    }
    @Test
        public void iHaveAn_AirConditionerMyAcIsOn_whenI_increaseTheTemperatureBeyond30Degrees_temperatureIsStill30() {
        samsung.turnOn();

        for (int index = 0; index <= 35; index++){
            samsung.temperatureIncreaseToHigh();
        }
        int expected = 30;
        int actual = samsung.getTemperature();
        assertEquals(expected, actual);
    }
    @Test
        public void iHaveAn_AirConditionerMyAcIsOn_whenI_decreaseTheTemperatureBelow16Degrees_temperatureIsStill_16() {

        samsung.turnOn();
        for (int index = 16; index >= 0 ; index--){
            samsung.temperatureDecreaseToLow();
        }
        int expected = 16;
        int actual = samsung.getTemperature();
        assertEquals(expected, actual);
    }



}
