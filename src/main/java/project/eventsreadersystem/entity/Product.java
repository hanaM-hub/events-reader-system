package project.eventsreadersystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Entity
public class Product {
    /*@Id
    @GeneratedValue(strategy= GenerationType.AUTO)*/
    public String Type;
    public String Price;
    public String StartDate;
    public String EndDate;

    protected Product() {}

    public Product(String Type, String Price, String StartDate, String EndDate) {
        this.Type = Type;
        this.Price = Price;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[type=%s, price='%s', startDate='%s', endDate='%s']",
                Type, Price, StartDate, EndDate);
    }

    public String getType() {
        return Type;
    }

    public String getPrice() {
        return Price;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }
}
