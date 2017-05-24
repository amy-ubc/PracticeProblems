package test;

import model.Ferry;
import model.FerryCard;
import model.Passenger;
import model.Ticket;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by sazivalair on 2017-05-11.
 */
public class FerryTest {

    private Ferry testFerry;
    private int testPrice;
    private Date testDate;

    @Before
    public void setUp() {
        testPrice = 20;
        testDate = new Date();
        testFerry = new Ferry("Nanaimo", testDate, testPrice);
    }

    @Test
    public void testFerryConstructor() {
        assertEquals("Nanaimo", testFerry.getDestination());
        assertEquals(testDate, testFerry.getSailingDate());
        assertEquals(testPrice, testFerry.getTicketPrice());
        assertTrue(testFerry.getTicketSet().isEmpty());
    }

    @Test
    public void testAddTicket() {
        Passenger testPassenger = new Passenger("Bruce Wayne");
        Ticket testTicket = new Ticket(testFerry, testPassenger);
        testFerry.addTicket(testTicket);
    }

}
