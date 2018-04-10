package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean stopBookLoop = false;
        Book aBook;
        String answerBook = "";
        ArrayList<Book> bookList = new ArrayList<>();





            while (stopBookLoop != true) {

//                aBook = new Book();
                String title, author, description;

                System.out.println("Please Enter Book Title : ");
//                aBook.setTitle(keyboard.nextLine());
                title = keyboard.nextLine();

                System.out.println("Enter Book Author : ");
                aBook.setAuthor(keyboard.nextLine());
                author = keyboard.nextLine();

                System.out.println("Describe the Book : ");
                aBook.setDescription(keyboard.nextLine());
                description = keyboard.nextLine();

                System.out.println("What is the Price of the Book ? : ");
                aBook.setPrice(keyboard.nextDouble());
                keyboard.nextLine();

                System.out.println("Is the Book in Stock ? : ");
                aBook.setIsInStock(keyboard.nextLine());
                aBook = new Book(title,author,description);
                bookList.add(aBook);

                System.out.println("Would you like to add another Book ? : ");
                answerBook = keyboard.nextLine();

                if (answerBook.equalsIgnoreCase("N") || answerBook.equalsIgnoreCase("No")) {
                    stopBookLoop = true;


                } else {
                    stopBookLoop = false;
                }

                for (Book eachBook : bookList){


                    System.out.println("Display Text : "+" "+ eachBook.getAuthor()+ " " + eachBook.getTitle() + " " + eachBook.getDescription());
                }

            }

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