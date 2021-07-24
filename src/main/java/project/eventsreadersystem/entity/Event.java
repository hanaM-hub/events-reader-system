package project.eventsreadersystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
//@Entity
public class Event {
    /*@Id
    @GeneratedValue(strategy= GenerationType.AUTO)*/
    private Long Id;
    private String Type;
    private String InsuredId;
    private List<Product> Product;

    protected Event() {}

    public Event(Long Id, String Type, String InsuredId, List<Product> Product) {
        this.Id = Id;
        this.Type = Type;
        this.InsuredId = InsuredId;
        this.Product = Product;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, type='%s', insuredId='%s']",
                Id, Type, InsuredId);
    }

    public Long getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    public String getInsuredId() {
        return InsuredId;
    }

    public List<Product> getProducts() {
        return Product;
    }
}
