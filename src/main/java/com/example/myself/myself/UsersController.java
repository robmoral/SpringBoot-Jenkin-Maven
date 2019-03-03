/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myself.myself;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/users")
public class UsersController {
    
    private static final Logger logger = LoggerFactory.getLogger(UsersController.class);
    
   @Autowired
   UserRepoInterface repository;
            
   //@GetMapping("/{id}")
   //private Mono<Users> getUserById(@PathVariable String id) {
   //     return repository.
   //}
   
  
   @GetMapping
   public Flux<Users> getUsers() {
      return (Flux<Users>) repository.findAll();
   }
   
}