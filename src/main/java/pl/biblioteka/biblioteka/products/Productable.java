package pl.biblioteka.biblioteka.products;


import pl.biblioteka.biblioteka.Genre;
import pl.biblioteka.biblioteka.PublisherList;

import java.util.Date;


public interface Productable<T extends Productable>{
    Long getId();
    Date getDateOfOrder();
    String getTitle();
    String getAuthor();
    PublisherList getPublisher();
    Date getReleaseDate();
    Genre getGenre();
    boolean isReserved();
    boolean isRented();
    Date getRentDate();
    Long getOrderNumber();
    double getProductPrice();
    double getRentPrice();

    T withDateOfOrder(Date dateOfOrder);
    T withId(Long id);
    T withTitle(String title);
    T withAuthor(String author);
    T withPublisher(PublisherList publisher);
    T withReleaseDate(Date releaseDate);
    T withGenre(Genre genre);
    T withReserved(boolean reserved);
    T withRented(boolean rented);
    T withRentDate(Date rentDate);
    T withOrderNumber(Long orderNumber);
    T withProductPrice(double productPrice);
    T withRentPrice(double rentPrice);


    void setDateOfOrder(Date dateOfOrder);
    void setId(Long id);
    void setTitle(String title);
    void setAuthor(String author);
    void setPublisher(PublisherList publisher);
    void setReleaseDate(Date releaseDate);
    void setGenre(Genre genre);
    void setReserved(boolean reserved);
    void setRented(boolean rented);
    void setRentDate(Date rentDate);
    void setOrderNumber(Long orderNumber);
    void setProductPrice(double productPrice);
    void setRentPrice(double rentPrice);





}
