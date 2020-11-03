package com.PFE.client_microservice.Repository;

import com.PFE.client_microservice.Model.TimeStamp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;

@Repository
public interface ClientRepository extends MongoRepository<TimeStamp, String> {

    TimeStamp findByStampId(String stampId);
}
