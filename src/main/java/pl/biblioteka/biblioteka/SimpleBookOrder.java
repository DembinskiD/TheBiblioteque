package pl.biblioteka.biblioteka;

import pl.biblioteka.biblioteka.People.Customer;
import pl.biblioteka.biblioteka.People.Employee;
import pl.biblioteka.biblioteka.products.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimpleBookOrder {
    private int orderNumber;
    private Customer customer;
    private Employee employee;
    private Date orderDate;
    private Date endDate;
    private double price;
    private List<Book> books = new ArrayList<>();


    public boolean addBook(Book book) {
        return this.books.add(book);
    }

    public boolean removeBook(Book book) {
        return this.books.remove(book);
    }

    public SimpleBookOrder() {
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
