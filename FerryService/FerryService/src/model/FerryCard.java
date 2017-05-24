package model; /**
 * Created by sazivalair on 2017-05-10.
 */


/**
 *  Represents a ferry card used to purchase tickets for a ferry sailing
 */

public class FerryCard {

    private Passenger owner; // passenger associated with card
    private int balance; // balance on card in dollars

    // EFFECTS: ferry card has a balance of zero
    public FerryCard() {
        this.balance = 0;

    }

    public int getBalance() {
        return balance;
    }

    //MODIFIES: this
    //EFFECTS: sets balance to parameter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Passenger getOwner() {
        return owner;
    }

    //MODIFIES: this
    //EFFECTS: sets owner to parameter
    public void setOwner(Passenger owner) {
        this.owner = owner;
    }


    // REQUIRES: balanceAdded > 0
    // MODIFIES: this
    // EFFECTS: adds balanceAdded to balance available on this card
    public void topUp(int balanceAdded) {
        balance += balanceAdded;
    }


    // MODIFIES: this
    // EFFECTS: if card does not have at least ticketPrice available on balance,
    // returns false; otherwise creates a new ticket, adds the ticket to ticket
    // and subtracts ticketPrice from balance.
    public boolean buyTicket(Ferry ferry) {

        int ticketPrice = ferry.getTicketPrice();

        if(balance < ticketPrice) {
            return false;
        }

        Ticket ticket = new Ticket(ferry, owner);
        ferry.addTicket(ticket);
        balance = balance - ticketPrice;
        return true;

    }



}