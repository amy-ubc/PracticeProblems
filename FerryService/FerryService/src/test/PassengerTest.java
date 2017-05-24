package test;

import model.Passenger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by sazivalair on 2017-05-11.
 */
public class PassengerTest {

    private Passenger testPassenger;

    @Before
    public void setUp() {
        testPassenger = new Passenger("Bruce Wayne");
    }

    @Test
    public void testPassengerConstructor() {
        assertEquals("Bruce Wayne", testPassenger.getName());
        assertEquals(testPassenger, testPassenger.getFerryCard().getOwner());
    }



}
