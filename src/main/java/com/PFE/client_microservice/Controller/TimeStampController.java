package com.PFE.client_microservice.Controller;

import com.PFE.client_microservice.Model.TimeStamp;
import com.PFE.client_microservice.Service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/client")
public class TimeStampController {

    @Autowired
    TimeStampService timeStampService;

    @GetMapping ("/getAll")
    public List<TimeStamp> getAll(){
        return timeStampService.getAll();
    }

    @GetMapping ("/findByStampId")
    public TimeStamp findByStampId(@RequestParam(name = "stampId")String stampId){
        return  timeStampService.findByStampId(stampId);
    }

}
