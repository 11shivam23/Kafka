package com.kafka.deliveryboy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.deliveryboy.service.KafkaService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/location")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping(value="update")
    public ResponseEntity<?> updateLocation() {
        this.kafkaService.updateLocation(" ( " + Math.round(Math.random()*100) + " , " +  Math.round(Math.random()*100) + " ) ");
        return new ResponseEntity<>(Map.of("messgae","Location Updated"), HttpStatus.OK);
    }
    
}
