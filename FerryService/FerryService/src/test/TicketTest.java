package test;

import model.Ferry;
import model.Ticket;
import model.Passenger;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by sazivalair on 2017-05-11.
 */
public class TicketTest {

    private Ticket testTicket;
    private Passenger testPassenger;
    private Ferry testFerry;

    @Before
    public void setUp() {
        Date testDate = new Date();
        int testPrice = 15;
        testFerry = new Ferry("Nanaimo", testDate, testPrice);
        testPassenger = new Passenger("Bruce Wayne");
        testTicket = new Ticket(testFerry, testPassenger);
    }

    @Test
    public void testTicketConstructor() {
        assertEquals(testFerry, testTicket.getFerry());
        assertEquals(testPassenger, testTicket.getPassenger());
    }



}
