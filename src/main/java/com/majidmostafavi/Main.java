package com.majidmostafavi;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Kimiyagar","Romab","Pablu",1000d,Stock.SoldOut);


        User u1 = new User("u1","Majid","Mostafavi",book);
        User u2 = new User("u2","Mohammad","Mostafavi",book);
        User u3 = new User("u3","Mohsen","Mostafavi",book);

        System.out.println(book.getStock());

        book.setStock(Stock.InStock);
    }
}