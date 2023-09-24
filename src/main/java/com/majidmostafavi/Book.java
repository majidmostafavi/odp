package com.majidmostafavi;

import java.util.ArrayList;

public class Book implements SubjectLibrary {

    private String name;
    private String type;
    private String author;
    private double price;
    private Stock stock;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Book(String name, String type, String author, double price,Stock stock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }



    public void setStock(Stock stock) {
        this.stock = stock;
        System.out.println("Availability changed from Sold out to Back in stock");
        notifyObserver();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println(this.toString());
        for (Observer o :observers){
            o.update(this.stock);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Stock getStock() {
        return stock;
    }


    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public String toString() {
        return " Book Name: " + this.name + " Book Type: "+ this.type + " Is now: " + this.stock+ " So , plases notify All users";
    }
}
