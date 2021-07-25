package project.eventsreadersystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
//@Entity
public class Event {
    /*@Id
    @GeneratedValue(strategy= GenerationType.AUTO)*/

    public String Id;
    public String Type;
    public String InsuredId;
    public List<Product> Product;

    protected Event() {}

    public Event(String Id, String Type, String InsuredId, List<Product> Product) {
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

    public String getId() {
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
