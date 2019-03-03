/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myself.myself;

/**
 *
 * @author robmoral
 */
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepoInterface extends ReactiveCrudRepository<Users,Long> {

    Flux<Users> findByLastName(String lastName);
    
}
