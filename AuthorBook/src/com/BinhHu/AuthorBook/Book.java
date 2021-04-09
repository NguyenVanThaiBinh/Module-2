package com.BinhHu.AuthorBook;

public class Book{
    private String name;
    private Author[] author;
    private double price;

    public Book(String name,Author[] author,double price){
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public String getName(){
        return name;
    }
    public double price(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getAuthorName(){
        String authorName = "";
        for (int i = 0; i < author.length; i++) {
            authorName+= author[i].getName()+", ";
        }
        if (authorName != null && authorName.length() > 0 && authorName.charAt(authorName.length() - 2) == ',') {
            authorName = authorName.substring(0, authorName.length() - 2);
        }
        return authorName;
    }
}



