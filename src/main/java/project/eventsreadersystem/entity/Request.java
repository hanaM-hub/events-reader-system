package project.eventsreadersystem.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Request {
    /* @Id
         @GeneratedValue(strategy= GenerationType.AUTO)*/
    //@XmlElement
    public RequestDetails RequestDetails;
    //@XmlElement
    public Event[] Event;
    protected Request() {}

    public Request(RequestDetails RequestDetails, Event[] Event) {
        this.RequestDetails = RequestDetails;
        this.Event = Event;
    }

    @Override
    public String toString() {
        return String.format(
                "Request");
    }

    public RequestDetails getRequestDetails() {
        return RequestDetails;
    }

    public Event[] getEvents() {
        return Event;
    }

}
