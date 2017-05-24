package model;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;

/**
 * Created by sazivalair on 2017-05-10.
 */

/**
 *  Represents a ferry sailing for a ferry service
 */

public class Ferry {

    private Set<Ticket> ticketSet = new HashSet<Ticket>();
    private String destination;
    private Date sailingDate;
    private int ticketPrice;

    // EFFECTS: ferry has a destination, date, and ticket price
    public Ferry(String destination, Date sailingDate, int ticketPrice) {
        this.destination = destination;
        this.sailingDate = sailingDate;
        this.ticketPrice = ticketPrice;
    }


    public Set<Ticket> getTicketSet() {
        return ticketSet;
    }

    // MODIFIES: this
    // EFFECTS: sets ticketSet to parameter
    public void setTicketSet(Set<Ticket> ticketSet) {
        this.ticketSet = ticketSet;
    }

    public String getDestination() {
        return destination;
    }

    // MODIFIES: this
    // EFFECTS: sets destination to parameter
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getSailingDate() {
        return sailingDate;
    }

    // MODIFIES: this
    // EFFECTS: sets sailingDate to parameter
    public void setSailingDate(Date sailingDate) {
        this.sailingDate = sailingDate;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // MODIFIES: this
    // EFFECTS: adds a ticket to the set of tickets
    public void addTicket(Ticket ticket) {

        ticketSet.add(ticket);

    }
}
