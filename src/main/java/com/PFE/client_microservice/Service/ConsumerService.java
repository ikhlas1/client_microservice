package com.PFE.client_microservice.Service;

import com.PFE.client_microservice.Model.TimeStamp;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Autowired TimeStampService timeStampService;

    @RabbitListener( queues = "${rabbitmq.queue.name}")
    public void consumeMessage(TimeStamp timeStamp) {
        timeStampService.insertTimeStamp(timeStamp);
    }
}

