package com.egorl.intlerarduinoclient.controllers;

import com.egorl.intlerarduinoclient.controllers.dto.SensorDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SensorsController {

    @PostMapping("arduino-client/add")
    public void createNewSensor(@RequestBody SensorDTO sensorDTO) {

    }

    @GetMapping("arduino-client/delete/{id}")
    public void removeSensor(@PathVariable("id") long id) {

    }

    @GetMapping("arduino-client/update/{id}/{value}")
    public void updateSensor(@PathVariable("id") long id, @PathVariable("value") long value) {

    }
}
