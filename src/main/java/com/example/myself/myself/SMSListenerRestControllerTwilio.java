package com.example.myself.myself;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 *
 * @author acanoma
 */
@RestController
@RequestMapping("/Twilio")
public class SMSListenerRestControllerTwilio {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SMSListenerRestControllerTwilio.class);
    
    WebClient client = WebClient.create("http://localhost:9090");

    @GetMapping(value = "/Url-0")
    public void list() {
        Mono<Users> userMono = client.get().uri("/users/{id}",1).retrieve().bodyToMono(Users.class);
        userMono.subscribe(System.out::println);
    }
    
    @GetMapping(value = "/Url-1")
    public Flux<Users> list2() {
        Flux<Users> userFlux = client.get().uri("/users").retrieve().bodyToFlux(Users.class);
        userFlux.subscribe(System.out::println);
        return userFlux;
    }
 
    @GetMapping(value = "Url-2")
    public Object list3() {
        return "{Hello world 2}";
    }
    
    
}
