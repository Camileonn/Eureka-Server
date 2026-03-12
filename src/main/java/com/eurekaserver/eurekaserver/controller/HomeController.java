package com.eurekaserver.eurekaserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka-api")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String home() {
        logger.info("Endpoint '/' fue llamado en Eureka Server");
        return "Bienvenido al Eureka Server - Registro de Microservicios";
    }

    @GetMapping("/status")
    public String status() {
        logger.info("Endpoint '/status' fue llamado en Eureka Server");
        return "Eureka Server está funcionando correctamente";
    }
}
