package com.PFE.client_microservice.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Objects;

@Configuration
public class ExchangeBindingsConfig {

    @Autowired
    Environment env;

    //Exchanges
    @Bean
    DirectExchange clientExchange() {

        return new DirectExchange(env.getProperty("rabbitmq.exchange.client"));
    }

    //Queues
    @Bean
    org.springframework.amqp.core.Queue timeStampQueue() {

        return new org.springframework.amqp.core.Queue(Objects.requireNonNull(env.getProperty("rabbitmq.queue.timestamp")), false);
    }

    //Bindings
    @Bean
    Binding timeStampBinding(org.springframework.amqp.core.Queue timeStampQueue, DirectExchange clientExchange) {

        return BindingBuilder.bind(timeStampQueue).to(clientExchange).with(env.getProperty("rabbitmq.routingkey.timestamp"));
    }
}
