package pl.biblioteka.biblioteka.products;

import pl.biblioteka.biblioteka.Genre;
import pl.biblioteka.biblioteka.PublisherList;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Random;

public class Product implements Productable {
    private static Long GENERIC_ID = 0L;


    private Long id;
    private String title;
    private String author;
    private PublisherList publisher;
    private Long orderNumber;
    private Genre genre;
    private Date releaseDate;
    private Date dateOfOrder;
    private Date rentDate;
    private boolean isReserved;
    private boolean isRented;
    private double productPrice;
    private double rentPrice;


    //empty constructor, getters, setters, toString
    public Product() {
        //setting up default values
        this.id = GENERIC_ID++;
        this.title = "unnamed";
        this.author = "none";
        this.publisher = PublisherList.UNSET;
        this.orderNumber = new Random().nextLong();
        this.genre = Genre.UNSET;
        this.releaseDate = null;
        this.dateOfOrder = Calendar.getInstance().getTime();
        this.rentDate = null;
        this.isReserved = false;
        this.isRented = false;
        this.productPrice = 20D;
        this.rentPrice = 1.5;

    }

    @Override
    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public PublisherList getPublisher() {
        return publisher;
    }

    @Override
    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean isReserved() {
        return isReserved;
    }

    @Override
    public boolean isRented() {
        return isRented;
    }

    @Override
    public Date getRentDate() {
        return rentDate;
    }

    @Override
    public Long getOrderNumber() {
        return orderNumber;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public double getRentPrice() {
        return rentPrice;
    }


    @Override
    public Product withDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
        return this;
    }

    @Override
    public Product withId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public Product withTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public Product withAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public Product withPublisher(PublisherList publisher) {
        this.publisher = publisher;
        return this;
    }

    @Override
    public Product withReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @Override
    public Product withGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public Product withReserved(boolean reserved) {
        isReserved = reserved;
        return this;
    }

    @Override
    public Product withRented(boolean rented) {
        isRented = rented;
        return this;
    }

    @Override
    public Product withRentDate(Date rentDate) {
        this.rentDate = rentDate;
        return this;
    }

    @Override
    public Product withOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    @Override
    public Product withProductPrice(double productPrice) {
        this.productPrice = productPrice;
        return this;
    }

    @Override
    public Product withRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
        return this;
    }

    @Override
    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setPublisher(PublisherList publisher) {
        this.publisher = publisher;
    }

    @Override
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    @Override
    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }


    @Override
    public String toString() {
        Formatter toStringFormatter = new Formatter();
        toStringFormatter.format("%d %s %s %s %s %s\n",
                id, getClass().getSimpleName(), title, author, publisher, genre);
        return toStringFormatter.toString();
    }
}
