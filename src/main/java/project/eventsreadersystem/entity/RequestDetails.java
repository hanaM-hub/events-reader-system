package project.eventsreadersystem.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

//@Entity
public class RequestDetails {

    //@Id
    /* @GeneratedValue(strategy= GenerationType.AUTO)*/
    @XmlElement
    public String Id;
    @XmlElement
    public String AcceptDate;
    @XmlElement
    public String SourceCompany;

    protected RequestDetails() {}

    public RequestDetails(String Id, String AcceptDate, String SourceCompany) {
        this.Id = Id;
        this.AcceptDate = AcceptDate;
        this.SourceCompany = SourceCompany;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, acceptDate='%s', sourceCompany='%s']",
                Id, AcceptDate, SourceCompany);
    }


    public String getId() {
        return Id;
    }

    public String getAcceptDate() {
        return AcceptDate;
    }

    public String getSourceCompany() {
        return SourceCompany;
    }
}
