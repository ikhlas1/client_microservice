package com.PFE.client_microservice.Model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@Document(collection = "Timestamp")
public class TimeStamp {
    @Id
    private String stampId;
    private String queueId;
    private String serviceId;
    private Client client; //the client's number in the queue
    //private LocalDateTime timeStamp; // Need to change this or search for
    // Cannot construct instance of `java.time.LocalDateTime` (no Creators, like default constructor, exist)
    private int year;
    private int month;
    private int dayOfMonth;
    private int hour;
    private int minute;
    private int second;
    private int nano;
    private String operationType; // add, delete, late, your turn.
}
