package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mickey on 2017-04-26.
 */
public class Contact {
    private String name;
    private String number;
    private String email; //remove?
    private List<String> callLog;
    private ContactType type;

    public enum ContactType {
        WORK, FRIEND, FAMILY
    }

    public Contact(String name){
        this.name = name;
        callLog = new ArrayList<>();
    }

    //getters
    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public String getEmail(){
        return email;
    }

    public ContactType getContactType(){
        return type;
    }

    public List<String> getCallLog(){
        return callLog;
    }

    //MODIFIES: this
    //EFFECTS: sets contact's name to parameter
    public void setName(String name){
        this.name = name;
    }

    //MODIFIES: this
    //EFFECTS: sets contact's name to parameter
    public void setNumber(String number){
        this.number = number;
    }

    //MODIFIES: this
    //EFFECTS: sets contact type to one of: WORK, FRIEND, FAMILY
    public void setContactType(ContactType contactType){
        this.type = contactType;
    }

    //REQUIRES: a date in format "MM/DD/YY"
    //MODIFIES: this
    //EFFECTS: adds the given date to the call log
    public void call(String date){
        callLog.add(date);
    }

    //EFFECTS: prints out call history for this contact
    public void printCallHistory(){
        for(String s: getCallLog()){
            System.out.println(s);
        }
    }

    //EFFECTS: returns an automatic response to match ContactType
    public String generateResponse(){
        if(getContactType() == ContactType.FRIEND){
            return "Awesome!";
        } else if (getContactType() == ContactType.FAMILY){
            return "Love you too";
        } else {
            return "Sounds good";
        }
    }

}
