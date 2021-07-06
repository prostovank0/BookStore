package com.example.BookStoree;

import javax.persistence.*;

@Entity
@Table ( name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String bookName;
    private String author;
    private int price;
    private int quantity;


    public Books() {

    }

    public Books(String bookName, String author, int price, int quantity) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.quantity = quantity;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
