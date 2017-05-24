package model; /**
 * Created by sazivalair on 2017-05-10.
 */

/**
 *  Represents a ticket for a ferry sailing
 */

public class Ticket {



    private Ferry ferry;
    private Passenger passenger;

    public Ticket(Ferry ferry, Passenger passenger) {

        this.ferry = ferry;
        this.passenger = passenger;

    }

    public Ferry getFerry() {
        return ferry;
    }

    //MODIFIES: this
    //EFFECTS: sets ferry to parameter
    public void setFerry(Ferry ferry) {
        this.ferry = ferry;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    //MODIFIES: this
    //EFFECTS: sets passenger to parameter
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

}
