package test;

import model.Ferry;
import model.FerryCard;
import model.Passenger;
import model.Ticket;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by sazivalair on 2017-05-11.
 */
public class FerryCardTest {

    private FerryCard testFerryCard;
    private Passenger testPassenger;

    @Before
    public void setUp() {
        testPassenger = new Passenger("Bruce Wayne");
        testFerryCard = testPassenger.getFerryCard();
    }

    @Test
    public void testFerryCardConstructor() {
        assertEquals(testPassenger, testFerryCard.getOwner());
        assertEquals(0, testFerryCard.getBalance());
    }

    @Test
    public void testTopUp() {
        testFerryCard.topUp(20);
        assertEquals(20, testFerryCard.getBalance());

    }

    @Test
    public void testBuyTicketNoBalance() {
        int testPrice = 15;
        Date testDate = new Date();
        Ferry testFerry = new Ferry("Nanaimo", testDate, testPrice);
        assertFalse(testFerryCard.buyTicket(testFerry));

    }

    @Test
    public void testBuyTicketNotEnoughBalance() {
        int testPrice = 20;
        Date testDate = new Date();
        Ferry testFerry = new Ferry("Nanaimo", testDate, testPrice);
        testFerryCard.topUp(19);
        assertFalse(testFerryCard.buyTicket(testFerry));
    }

    @Test
    public void testBuyTicket() {
        int testPrice = 15;
        Date testDate = new Date();
        Ferry testFerry = new Ferry("Nanaimo", testDate, testPrice);
        Ticket testTicket = new Ticket(testFerry, testPassenger);
        testFerryCard.topUp(20);
        assertTrue(testFerryCard.buyTicket(testFerry));
        assertEquals(5, testFerryCard.getBalance());
        assertFalse(testFerry.getTicketSet().isEmpty());

    }
}
