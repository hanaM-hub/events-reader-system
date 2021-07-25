package project.eventsreadersystem.repository;

import org.springframework.data.repository.CrudRepository;
import project.eventsreadersystem.entity.Product;
import project.eventsreadersystem.entity.RequestDetails;

import java.util.List;

public interface requestRepository extends CrudRepository<RequestDetails, String> {
    List<Product> findByInsuredId(String lastName);
}
