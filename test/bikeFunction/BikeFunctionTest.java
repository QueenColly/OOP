package bikeFunction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BikeFunctionTest {

    private BikeFunction kia;


    @BeforeEach
    public void setUp() {
        kia = new BikeFunction();
    }

    @Test
    public void IHaveABikeMyBikeIsOff_INeedToTurnItOn() {
        kia.turnOn();
        assertTrue(kia.checkPowerStatus());
    }

    @Test
    public void IHaveABikeMyBikeIsOn_INeedToTurnItOff() {
        kia.turnOn();
        kia.turnOff();
        assertFalse(kia.checkPowerStatus());
    }

    @Test
    public void IHaveABike_WhenIStartMyBike_GearIs1_speedIs0() {
        kia.turnOn();
        assertEquals(0, kia.getSpeed());
        assertEquals(1, kia.getGear());
    }

    @Test
    public void IHaveABike_WhenIStartMyBike_whenMySpeedIsInRange0To20GearIs1_SpeedIs_20() {
        kia.turnOn();
        for (int index = 1; index <= 20; index++) {
            kia.accelerate();
        }
        assertEquals(20, kia.getSpeed());
        assertEquals(1, kia.getGear());
    }

    @Test
    public void IHaveABike_WhenIStartMyBike_whenMySpeedIsInRange21To30GearIs2SpeedIs21() {
        kia.turnOn();
        for (int index = 1; index <= 21; index++) {
            kia.accelerate();
        }
        assertEquals(21, kia.getSpeed());
        assertEquals(2, kia.getGear());
    }

    @Test
    public void IHaveABike_WhenIStartMyBike_whenMySpeedIsInRange31To40GearIs3SpeedIs31() {
        kia.turnOn();
        for (int index = 1; index <= 26; index++) {
            kia.accelerate();
        }
        assertEquals(31, kia.getSpeed());
        assertEquals(3, kia.getGear());
    }

    @Test
    public void IHaveABike_WhenIStartMyBike_whenMySpeedIsInRange31To40GearIs3_SpeedIs_40() {
        kia.turnOn();
        for (int index = 1; index <= 29; index++) {
            kia.accelerate();
        }
        assertEquals(40, kia.getSpeed());
        assertEquals(3, kia.getGear());
    }

    @Test
    public void IHaveABike_WhenIStartMyBike_whenMySpeedIsInRange31To40GearIs4_SpeedIs_43() {
        kia.turnOn();
        for (int index = 1; index <= 30; index++) {
            kia.accelerate();
        }
        assertEquals(43, kia.getSpeed());
        assertEquals(4, kia.getGear());
    }

    @Test
    public void IHaveABike_WhenIStartMyBike_whenMySpeedIsInRange31To40GearIs4SpeedIs59() {
        kia.turnOn();
        for (int index = 1; index <= 34; index++) {
            kia.accelerate();
        }
        assertEquals(59, kia.getSpeed());
        assertEquals(4, kia.getGear());
    }

    @Test
    public void IHaveABikeMyBikeIsOn_IAccelerateInGear1_while_speed_isInRange0To20_currentSpeedIncrementsByOne() {
        kia.turnOn();
        kia.accelerate();
        assertEquals(1, kia.getSpeed());
        kia.accelerate();
        assertEquals(2, kia.getSpeed());
    }

    @Test
    public void IHaveABikeMyBikeIsOn_IAccelerateInGear2_while_speed_isInRange21To30_currentSpeedIncrementsBy_Two() {
        kia.turnOn();
        for (int index = 1; index <= 21; index++) {
            kia.accelerate();
        }
        assertEquals(2, kia.getGear());
        assertEquals(21, kia.getSpeed());
        kia.accelerate();
        assertEquals(23, kia.getSpeed());
        kia.accelerate();
        assertEquals(25, kia.getSpeed());
        kia.accelerate();
        assertEquals(27, kia.getSpeed());
        kia.accelerate();
        assertEquals(29, kia.getSpeed());

    }

    @Test
    public void IHaveABikeMyBikeIsOn_IAccelerateInGear3_while_speed_isInRange31To40_currentSpeedIncrementsBy_Three() {
        kia.turnOn();
        for (int index = 1; index <= 26; index++) {
            kia.accelerate();
        }
        assertEquals(31, kia.getSpeed());
        assertEquals(3, kia.getGear());
        kia.accelerate();
        assertEquals(34, kia.getSpeed());
        kia.accelerate();
        assertEquals(37, kia.getSpeed());
        kia.accelerate();
        assertEquals(40, kia.getSpeed());


    }

    @Test
    public void IHaveABikeMyBikeIsOn_IAccelerateInGear4_while_speed_isInRange41AndAbove_currentSpeedIncrementsByFour() {
        kia.turnOn();
        for (int index = 1; index <= 30; index++) {
            kia.accelerate();
        }
        assertEquals(4, kia.getGear());
        assertEquals(43, kia.getSpeed());
        kia.accelerate();
        assertEquals(47, kia.getSpeed());
        kia.accelerate();
        assertEquals(51, kia.getSpeed());
        kia.accelerate();
        assertEquals(55, kia.getSpeed());
        kia.accelerate();
        assertEquals(59, kia.getSpeed());

    }

    @Test
    public void IHaveABikeMyBikeIsOn_IDecelerateInGear1_while_speed_isInRange0To20_currentSpeedDecrementsByOne() {
        kia.turnOn();
        kia.accelerate();

        for(int count = 1; count <= 5; count++){
        kia.accelerate();
        }
        assertEquals(6, kia.getSpeed());
        kia.decelerate();
        assertEquals(5,  kia.getSpeed());
//        kia.deAccelerate();
    }

    @Test
        public void IHaveABikeMyBikeIsOn_IdecelerateInGear2_while_speed_isInRange21To30_currentSpeedDecrementsBy_Two() {
            kia.turnOn();
            for (int index = 1; index <= 21; index++) {
                kia.accelerate();
            }
            assertEquals(21, kia.getSpeed());
            assertEquals(2, kia.getGear());
            kia.decelerate();
           assertEquals(19, kia.getSpeed());

        }
    @Test
        public void IHaveABikeMyBikeIsOn_IDeaccelerateInGear3_while_speed_isInRange31To40_currentSpeedIncrementsBy_Three() {
            kia.turnOn();
            for (int index = 1; index <= 26; index++) {
                kia.accelerate();
            }
            assertEquals(31, kia.getSpeed());
            assertEquals(3, kia.getGear());
            kia.decelerate();
            assertEquals(28, kia.getSpeed());
        }
    @Test
        public void IHaveABikeMyBikeIsOn_IDeaccelerateInGear4_while_speed_isInRange41AndAbove_currentSpeedIncrementsByFour() {
            kia.turnOn();
            for (int index = 1; index <= 30; index++) {
                kia.accelerate();
            }
            assertEquals(43, kia.getSpeed());
            assertEquals(4, kia.getGear());
            kia.decelerate();
            assertEquals(39, kia.getSpeed());

    }
    @Test
        public void myBikeIsOn_IturnItOff_iEnsureThatdecelerateMakesNoChange(){
            kia.turnOn();
            kia.turnOff();
            for(int count = 0; count < 31;count++){
                kia.decelerate();
            }
            assertEquals(0, kia.getSpeed());
            assertEquals(0, kia.getGear());
    }
}
