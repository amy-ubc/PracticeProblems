package model;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */
public class CoffeeMaker {

    //EFFECTS: sets time since last brew, cups remaining to 0
    public CoffeeMaker(){

    }

    //REQUIRES: beans between 2.40 and 2.60 cups, water between 14.9 and 15.1 cups
    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    public void brew(double beans, double water){
        //stub
    }

    ///REQUIRES: cups remaining > 0, time since last brew < 60
    //MODIFIES: this
    //EFFECTS: subtracts one cup from cups remaining
    public void pourCoffee(){
        //stub
    }

    //EFFECTS: returns how many cups remaining in pot (a full pot is 20 cups)
    public int getCupsRemaining(){
        return 0;
    }

    //EFFECTS: returns true if there are cups remaining
    public boolean areCupsRemaining(){
        return false; //stub
    }

    public int getTimeSinceLastBrew(){
        return 0; //stub
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time){
        //stub
    }

}
