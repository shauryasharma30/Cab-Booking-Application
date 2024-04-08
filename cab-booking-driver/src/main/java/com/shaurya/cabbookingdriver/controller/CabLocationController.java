package com.shaurya.cabbookingdriver.controller;

import com.shaurya.cabbookingdriver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int range = 100;
        while(range > 0) {
            cabLocationService.updateLocation(Math.random() + "," + Math.random());
            Thread.sleep(1000); // Updating every one second
            range --;
        }

        return new ResponseEntity<>(Map.of("message", "Location Entity"), HttpStatus.OK);

    }
}
