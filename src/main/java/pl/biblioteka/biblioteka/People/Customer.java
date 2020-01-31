package pl.biblioteka.biblioteka.People;

import pl.biblioteka.biblioteka.Address;
import pl.biblioteka.biblioteka.SimpleBookOrder;
import pl.biblioteka.biblioteka.products.Book;

import java.util.Date;
import java.util.List;

public class Customer extends Person {
    private Long cardNumber;
    private double balance;
    private List<Book> rentedBooks;
    private List<SimpleBookOrder> rentHistory;
    private Date signInDate;



    public static class Builder {
        private String name;
        private String surname;
        private Sex sex;
        private long number;
        private String mail;
        private Address address;
        private Date birthDate;
        private Long cardNumber;
        private double balance;
        private List<Book> rentedBooks;
        private List<SimpleBookOrder> rentHistory;
        private Date signInDate;

        public Customer build() {
            Customer customer = new Customer();
            customer.setName(this.name);
            customer.setSurname(this.surname);
            customer.setSex(this.sex);
            customer.setNumber(this.number);
            customer.setMail(this.mail);
            customer.setAddress(this.address);
            customer.setBirthDate(this.birthDate);
            customer.setCardNumber(this.cardNumber);
            customer.setBalance(this.balance);
            customer.setRentedBooks(this.rentedBooks);
            customer.setRentHistory(this.rentHistory);
            customer.setSignInDate(this.signInDate);
            return customer;
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setSex(Sex sex) {
            this.sex = sex;
            return this;
        }

        public Builder setNumber(long number) {
            this.number = number;
            return this;
        }

        public Builder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setCardNumber(Long cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder setRentedBooks(List<Book> rentedBooks) {
            this.rentedBooks = rentedBooks;
            return this;
        }

        public Builder setRentHistory(List<SimpleBookOrder> rentHistory) {
            this.rentHistory = rentHistory;
            return this;
        }

        public Builder setSignInDate(Date signInDate) {
            this.signInDate = signInDate;
            return this;
        }


    }


    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(List<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    public List<SimpleBookOrder> getRentHistory() {
        return rentHistory;
    }

    public void setRentHistory(List<SimpleBookOrder> rentHistory) {
        this.rentHistory = rentHistory;
    }

    public Date getSignInDate() {
        return signInDate;
    }

    public void setSignInDate(Date signInDate) {
        this.signInDate = signInDate;
    }
}
