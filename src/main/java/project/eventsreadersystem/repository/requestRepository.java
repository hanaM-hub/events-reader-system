package project.eventsreadersystem.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.eventsreadersystem.entity.Product;
import project.eventsreadersystem.entity.RequestDetails;

import java.util.ArrayList;

@Repository
public interface requestRepository extends CrudRepository<RequestDetails, String> {
    @Query(nativeQuery = true ,value= "SELECT RequestDetails.Id, Product.*" +
                                        "FROM RequestDetails" +
                                        "JOIN Event ON Event.RequestDetailsId = RequestDetails.Id" +
                                        "JOIN Product ON Product.EventId = Product.EventId" +
                                        "WHERE Event.InsuredId = :insuredId" +
                                        "GROUP BY RequestDetails.Id" )
    ArrayList<Product> findByInsuredId(@Param("insuredId") int branchCode, @Param("sourceCompany") int activityType);
}
