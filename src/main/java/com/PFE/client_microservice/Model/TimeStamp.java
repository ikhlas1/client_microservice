package com.PFE.client_microservice.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Clientdb")
public class TimeStamp {
    @Id
    private int stampId;
    private int queueId;
    private int serviceId;
    private int clientNumber; //the client's number in the queue
    private String timeStamp;
    private String operationType; // add, delete, late, your turn.
}
