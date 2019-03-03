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
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Component
public class SimpleFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

   @Override
   public void destroy() {
       logger.info("Filter destroy() called");
   }

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain) 
      throws IOException, ServletException {      
      System.out.println("Remote Host:"+request.getRemoteHost());
      System.out.println("Remote Address:"+request.getRemoteAddr());
      filterchain.doFilter(request, response);      
   }

   @Override
   public void init(FilterConfig filterconfig) throws ServletException {
       logger.info("Filter init() called");       
   }
   
}