package pl.biblioteka.biblioteka.People;

import pl.biblioteka.biblioteka.Address;

import java.util.Date;

public class Employee extends Person {
    private Date employmentDate;
    private double remuneration;
    private long accNumber;
    
    
    public class Builder {
        private String name;
        private String surname;
        private Sex sex;
        private long number;
        private String mail;
        private Address address;
        private Date birthDate;
        private Date employmentDate;
        private double remuneration;
        private long accNumber;

        public Employee build() {
            Employee employee = new Employee();
            employee.setName(this.name);
            employee.setSurname(this.surname);
            employee.setSex(this.sex);
            employee.setNumber(this.number);
            employee.setMail(this.mail);
            employee.setAddress(this.address);
            employee.setBirthDate(this.birthDate);
            employee.setEmploymentDate(this.employmentDate);
            employee.setRemuneration(this.remuneration);
            employee.setAccNumber(this.accNumber);
            return employee;
        }


        public Builder setRemuneration(double remuneration) {
            this.remuneration = remuneration;
            return this;
        }

        public Builder setAccNumber(long accNumber) {
            this.accNumber = accNumber;
            return this;
        }

        public Builder setEmploymentDate(Date employmentDate) {
            this.employmentDate = employmentDate;
            return this;
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
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
}
