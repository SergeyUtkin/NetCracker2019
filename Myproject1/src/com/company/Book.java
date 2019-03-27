package com.company;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String a = "Book[name = " + this.name + " , authors = {Author";
        for (int i = 0; i < authors.length; i++)
            a = a + "[name = " + authors[i].getName() + " ,email = " + authors[i].getEmail() + " ,gender = " + authors[i].getGender() + "] ";

        a = a + "} ,price = " + this.price + " , qty = " + this.qty + " ]";
        return a;
    }

    public String getAuthorName() {
        String a = null;
        for (int i = 0; i < authors.length; i++)
            a = a + authors[i].getName() + ", ";
        return a;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        for (int i = 0; i < authors.length; i++)
            result = 31 * result + authors[i].hashCode();
        result = 31 * result + (int) (Double.doubleToLongBits(price) ^ (Double.doubleToLongBits(price) >>> 32));
        result = 31 * result + qty;
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Book book = (Book) obj;
        boolean flag = true;
        Author[] arr = book.getAuthors();
        for (int i = 0; i < authors.length; i++)
            if (!authors[i].equals(arr[i]))
                flag = false;
        return flag && book.getName().equals(name) && book.getPrice() == price && book.getQty() == qty;
    }
}
