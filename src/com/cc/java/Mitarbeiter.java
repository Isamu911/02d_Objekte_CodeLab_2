package com.cc.java;

public class Mitarbeiter {
    private String lastName;
    private String firstName;
    private String function;
    private int beginningYear;

    public Mitarbeiter(String lastName, String firstName, String function, int beginningYear){
        this.lastName = lastName;
        this.firstName = firstName;
        this.function = function;
        this.beginningYear = beginningYear;

    }
    

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFunction() {
        return function;
    }

    public int getBeginningYear() {
        return beginningYear;
    }

    


}
