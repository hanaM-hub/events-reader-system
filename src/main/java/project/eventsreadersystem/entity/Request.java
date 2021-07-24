package project.eventsreadersystem.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Root")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Request {

   /* @Id
    @GeneratedValue(strategy= GenerationType.AUTO)*/
    private Root Root;

    protected Request() {}

    public Request(Root Root) {
        this.Root = Root;
    }

    @Override
    public String toString() {
        return String.format(
                "Root");
    }


    public Root getRoot() {
        return Root;
    }

}
