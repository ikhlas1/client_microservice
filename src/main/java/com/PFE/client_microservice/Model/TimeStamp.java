package com.PFE.client_microservice.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@RequiredArgsConstructor
@Document(collection = "ClientMicroservice")
public class TimeStamp {
    @Id
    private String stampId;
    private int queueId;
    private int serviceId;
    private Client client; //the client's number in the queue
    private String timeStamp;
    private String operationType; // add, delete, late, your turn.
}
