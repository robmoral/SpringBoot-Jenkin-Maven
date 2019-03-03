/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myself.myself;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author acanoma
 */
@RestController
@RequestMapping("/Twilio")
public class SMSListenerRestControllerTwilio {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SMSListenerRestControllerTwilio.class);
    
    
    @RequestMapping(method = GET)
    public Object list() {
        return "{Hello world 1}";
    }
 
    @RequestMapping(value = "/test", method = GET)
    public Object getTest(@PathVariable String id) {
        return "{Hello World}";
    }
    
    
    
    /**
     * Evaluates JSON string and action it based on message type
     * @param jsonString 
     */
    private void evaluateJSON(String jsonString){
        LOGGER.info(jsonString);
    }
    
}
