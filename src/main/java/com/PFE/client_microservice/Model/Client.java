package com.PFE.client_microservice.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
    public class Client {
        private int queueNumber;
        private String phoneNumber;
        private String emailAddress;

    }

