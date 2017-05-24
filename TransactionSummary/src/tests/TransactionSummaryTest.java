package tests;

import model.Transaction;
import model.TransactionSummary;
import model.TransactionType;
import org.junit.Before;


import static model.TransactionType.*;

public class TransactionSummaryTest {
    TransactionSummary testSummary;
    Transaction t1, t2, t3, t4, t5, t6, t7;

    @Before
    public void setUp() {
        testSummary = new TransactionSummary("Donald Knuth");
        t1 = new Transaction("Movie", "May 1st", 10, ENTERTAINMENT);
        t2 = new Transaction("Restaurant", "May 11th", 20, FOOD);
        t3 = new Transaction("Clothes", "May 9", 40, SHOPPING);
        t4 = new Transaction("Textbooks", "May 8", 150, EDUCATION);
        t5 = new Transaction("Korean Food", "May 11", 11, FOOD);
        t6 = new Transaction("Vancouver Symphony", "May 15", 40, ENTERTAINMENT);
        t7 = new Transaction("Cake", "May 4", 5, FOOD);

        testSummary.addTransaction(t1);
        testSummary.addTransaction(t2);
        testSummary.addTransaction(t3);
        testSummary.addTransaction(t4);
        testSummary.addTransaction(t5);
        testSummary.addTransaction(t6);
        testSummary.addTransaction(t7);
    }


}