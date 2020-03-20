package org.techpastors.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.techpastors.springbootjpa.model.Automobile;
import org.techpastors.springbootjpa.service.AutomobileService;

import java.util.List;

@RestController
@RequestMapping("/the.automobile.company")
public class AutomobileController {

    @Autowired
    AutomobileService service;

    @GetMapping("/all")
    public List<Automobile> getAllCars() {
        return service.getAllAutomobiles();
    }

    @GetMapping("/car/{name}")
    public Automobile getByCarName(@PathVariable String name) {
        return service.getFindByCarName(name);
    }

    @PostMapping("/save")
    public ResponseEntity<String> create(@RequestBody Automobile automobile){
        service.create(automobile);
        return ResponseEntity.ok("Created Successfully....");
    }


}
