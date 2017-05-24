package model; /**
 * Created by sazivalair on 2017-05-10.
 */

/**
 *  Represents a passenger using a ferry service
 */

public class Passenger {

    private String name;
    private FerryCard ferryCard;

    // EFFECTS: passenger has a name and a new ferry card
    public Passenger(String name) {

        this.name = name;
        FerryCard ferryCard = new FerryCard();
        setFerryCard(ferryCard);
        ferryCard.setOwner(this);
    }

    public String getName() {
        return name;
    }

    //MODIFIES: this
    //EFFECTS: sets name to parameter
    public void setName(String name) {
        this.name = name;
    }

    public FerryCard getFerryCard() {
        return ferryCard;
    }

    //MODIFIES: this
    //EFFECTS: sets ferry card to parameter
    public void setFerryCard(FerryCard ferryCard) {
        this.ferryCard = ferryCard;
    }
}
