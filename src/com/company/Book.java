package com.company;

public class Book {
    String author, date, name;
    Book(String author, String name, String date){
        this.author = author;
        this.name = name;
        this.date = date;
    }

    public String getAuthor() {
        System.out.println(this.author);
        return author;
    }

    public String getDate() {
        System.out.println(this.date);
        return date;
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
