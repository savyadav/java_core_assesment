package com.java.library;

 

import java.util.Scanner;

 

import com.java.author.Author;
import com.java.book.Book;

 

public class Library {

    public static void runApp() {    

        Author savita = new Author("Mark", 36, "female");
        Author kavita = new Author("Mona", 32, "female");
        Author vivek = new Author("James", 38, "male");
        Book [] book = new Book[5];

      
        book[0] = new Book("1", "Spring", 1200, 3000, 3, savita);
       book[1] = new Book("2", "java", 1388, 1250000, 3, kavita);
       book[2] = new Book("3", "Angular", 388, 50000, 3, vivek);

        System.out.println("Welcome to Book Store(Select Book ID from 0 - 3)");
        Scanner sc = new Scanner(System.in);
        int index = 0;
        do {
            index = Integer.parseInt(sc.nextLine());
            System.out.println(book[index]);
        } while(index<=book.length); 
    }    

 

    public static void main(String[] args) {
        runApp();
    }

 

}