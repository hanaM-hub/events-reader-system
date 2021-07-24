package project.eventsreadersystem.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class RequestDetails {

    @Id
    /* @GeneratedValue(strategy= GenerationType.AUTO)*/
    private Long Id;
    private String AcceptDate;
    private String SourceCompany;

    protected RequestDetails() {}

    public RequestDetails(Long Id, String AcceptDate, String SourceCompany) {
        this.Id = Id;
        this.AcceptDate = AcceptDate;
        this.SourceCompany = SourceCompany;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, acceptDate='%s', sourceCompany='%s']",
                Id, AcceptDate, SourceCompany);
    }


    public Long getId() {
        return Id;
    }

    public String getAcceptDate() {
        return AcceptDate;
    }

    public String getSourceCompany() {
        return SourceCompany;
    }
}
