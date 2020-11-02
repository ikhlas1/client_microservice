package com.PFE.client_microservice.Service;

import com.PFE.client_microservice.Model.TimeStamp;
import com.PFE.client_microservice.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeStampService {
    @Autowired
    ClientRepository clientRepository;

    public List<TimeStamp> getAll() {
        return clientRepository.findAll();
    }

    public void insertTimeStamp(TimeStamp timeStamp) {

        clientRepository.insert(timeStamp);
    }
}
