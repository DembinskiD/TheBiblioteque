package pl.biblioteka.biblioteka;

import pl.biblioteka.biblioteka.People.Employee;
import pl.biblioteka.biblioteka.products.Book;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

    public class BookOrder {
    //klasa do zamawiania nowych ksiazek do biblioteki
    private Date orderDate;
    private Employee employee;
    private List<Book> orderedBooks;
    private double price;
    private boolean isSubmitted;


        public boolean submit() {
            isSubmitted = BookOrderArchive.INSTANCE.submit(this);
            return isSubmitted;
        }

        public Date getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public List<Book> getOrderedBooks() {
            return orderedBooks;
        }

        public void setOrderedBooks(List<Book> orderedBooks) {
            this.orderedBooks = orderedBooks;
        }

        public double getPrice() {
            computePrice();
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public BookOrder() {
    }


    public boolean addBookToOrder(Book book) {
        return this.orderedBooks.add(book);
    }

    public void computePrice() {
        DecimalFormat df2 = new DecimalFormat("#.##");
        this.price = Double.valueOf(df2.format(orderedBooks.stream().mapToDouble(Book::getProductPrice).sum()));
    }

    public static class Builder {
        private Date orderDate;
        private Employee employee;
        private List<Book> orderedBooks;
        private double price;

        public BookOrder build() {
            BookOrder bookOrder = new BookOrder();
            bookOrder.setOrderDate(this.orderDate);
            bookOrder.setEmployee(this.employee);
            bookOrder.setOrderedBooks(this.orderedBooks);
            bookOrder.isSubmitted = false;
            bookOrder.computePrice();
            return bookOrder;
        }

        public Builder setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        public Builder setOrderedBooks(List<Book> orderedBooks) {
            this.orderedBooks = orderedBooks;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }
    }
}
