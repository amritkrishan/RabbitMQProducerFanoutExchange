package com.producer.rabbitmqfanout.service;

import com.producer.rabbitmqfanout.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${producer.rabbitmq.exchange}")
    private String exchange;


    public void send(Employee emp) {
        rabbitTemplate.convertAndSend(exchange, "", emp);
        System.out.println("Send msg = " + emp);

    }
}