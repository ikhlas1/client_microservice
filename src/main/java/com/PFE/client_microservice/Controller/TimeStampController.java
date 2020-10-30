package com.PFE.client_microservice.Controller;

import com.PFE.client_microservice.Model.TimeStamp;
import com.PFE.client_microservice.Service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/Client")
public class TimeStampController {

    @Autowired
    TimeStampService timeStampService;

    @GetMapping ("/getAll")
    public List<TimeStamp> getAll(){
        return timeStampService.getAll();
    }

    /*@PostMapping ("/postTimeStamp")
    public TimeStamp postTimeStamp(){
        return timeStampService.postTimeStamp()
    }*/
}
