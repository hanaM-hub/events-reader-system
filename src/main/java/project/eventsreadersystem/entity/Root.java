package project.eventsreadersystem.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

//@Entity
@XmlRootElement(name = "Root")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Root {

    /* @Id
     @GeneratedValue(strategy= GenerationType.AUTO)*/
    private RequestDetails RequestDetails;
    private List<Event> Event;
    protected Root() {}

    public Root(RequestDetails RequestDetails, List<Event> Event) {
        this.RequestDetails = RequestDetails;
        this.Event = Event;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer");
    }


    public RequestDetails getRequestDetails() {
        return RequestDetails;
    }

    public List<Event> getEvents() {
        return Event;
    }
}
