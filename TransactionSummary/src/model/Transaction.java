package model;

/**
 * Created by James on 2017-05-02.
 */
public class Transaction {
    public String name;
    public String date;
    public int amount;
    public TransactionType type;


    //REQUIRES: a name for the transaction that took place, a date when it took place,
    //          the amount of money that the transaction took, and the type
    //MODIFIES: this
    //EFFECTS: a constructor for the Transaction class, instantiates an instance of Transaction
    public Transaction(String name, String date, int amount, TransactionType type) {
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    //getters
    public String getName() {
        return this.name;
    }
    public String getDate() {
        return this.date;
    }
    public int getAmount() {
        return this.amount;
    }
    public TransactionType getType() {
        return this.type;
    }

}
