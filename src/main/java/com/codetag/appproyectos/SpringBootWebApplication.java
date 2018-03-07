/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.appproyectos;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author proy-dim
 */
@SpringBootApplication
public class SpringBootWebApplication {
//public class SpringBootWebApplication extends SpringBootServletInitializer {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(SpringBootWebApplication.class);
//    }
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(SpringBootWebApplication.class).run(args);

    }

}
