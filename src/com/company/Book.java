package com.company;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private String isInStock;
    private String displayText;

    public Book() {
    }

    public Book(String title, String author, String description, int price, String isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public Book(String displayText) {
        this.displayText = displayText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String author, String title, String description) {
        this.displayText = displayText;
    }
}
//    Modify your existing application. Change the Integer to a Book and prompt the user to enter the title, author, description, price and inStock. The user should be able to enter as many books as they wish.
//
//        Create a Book class that allows for Book title, author, description, price and isInStock variables
//
//        The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.
//
//
//
//        The application shall also contain getters and setters for each private member variable.
//
//        Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.
//
//
//
//        Publish your solution to GitHub and submit your GitHub url as the assignment.