package com.majidmostafavi;

public class User implements Observer{

    String username;
    String firstName;
    String lastName;

    public User(String username, String firstName, String lastName,SubjectLibrary subjectLibrary) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;

        subjectLibrary.subscribeObserver(this);

    }


    @Override
    public void update(Stock available) {
        System.out.println("Hello "+ firstName + "," + lastName + " we are glad to notify you that your book is now " + available );
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
