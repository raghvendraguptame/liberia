package com.R3.liberia.book;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Book {

    public Book() {
    }

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long bookId;

    @Column(nullable = false)
    private Long isbn;

    @Column(nullable = false)
    private String bookTitle;

    @Column(nullable = false)
    private int bookPages;

    @Column(nullable = false)
    private String[] bookAuthor;

    private String bookDescription;

    @Column(nullable = false)
    private String bookGenre;

    @Column(nullable = false)
    private String bookEdition;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private float discount;

    @Column(nullable = false)
    private float MRP;

    @Column(nullable = false)
    private float SellingPrice;

    @Column(nullable = false)
    private int quantity=1;

    @Column(nullable = false)
    private boolean isActive;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated = new Date();

    @PrePersist
    void onCreate()
    {
        created = updated = new Date();
    }

    @PreUpdate
    void onUpdate()
    {
        updated = new Date();
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public String[] getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String[] bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getMRP() {
        return MRP;
    }

    public void setMRP(float MRP) {
        this.MRP = MRP;
    }

    public float getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
