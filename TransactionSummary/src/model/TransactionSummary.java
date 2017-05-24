package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by James on 2017-05-02.
 *
 * All implementation of methods should be completed by students in production code
 *
 */

public class TransactionSummary {
    public String name;        //name of person's given transaction summary
    public List<Transaction> transactions;

    //REQUIRES: the name of person whose transactions are being recorded
    //MODIFIES: this
    //EFFECTS: creates a new TransactionSummary object
    public TransactionSummary(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();     //initially empty record of transactions
    }

    //getters
    public int getNumTransactions() { return this.transactions.size();  }
    public String getName() { return this.name; }

    //REQUIRES: the transaction you want to add is not already within transactions
    //MODIFIES: this
    //EFFECTS: adds the given transaction into the list of transactions
    public void addTransaction(Transaction t) {
        this.transactions.add(t);
    }

    //REQUIRES: a non-empty list of transactions
    //MODIFIES: n/a
    //EFFECTS: computes the average amount of money spent on a transaction
    public double averageTransactionCost() {
       //TODO: complete the implementation of this method
        return 2.2;
    }


    //REQUIRES: transactions must be non-empty
    //EFFECTS: consumes a TransactionType, then returns the average cost of all transactions of that type in this
    //         TransactionsSummary Object
    public double specificTypeAverage(TransactionType specificType) {
       //TODO: complete the implementation of this method
        return 0.0;

    }

    //REQUIRES: transactions must be non-empty
    //EFFECTS: returns the largest transaction (in terms of cost) in this TransactionSummary object
    public Transaction largestTransaction() {
        //TODO: complete the implementation of this method
        return null;
    }


}
