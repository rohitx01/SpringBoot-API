package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class MyController {

    @Autowired
    private LoadService loadService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to the loads application";
    }

    @PostMapping("/load")
    public ResponseEntity<String> addLoad(@RequestBody Load load) {
        loadService.addLoad(load);
        return new ResponseEntity<>("Load details added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/load")
    public List<Load> getLoadsByShipperId(@RequestParam String shipperId) {
        return loadService.getLoadsByShipperId(shipperId);
    }

    @GetMapping("/load/{loadId}")
    public Load getLoadById(@PathVariable long loadId) {
        return loadService.getLoadById(loadId);
    }

    @PutMapping("/load/{loadId}")
    public Load updateLoad(@PathVariable long loadId, @RequestBody Load load) {
        return loadService.updateLoad(loadId, load);
    }

    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<String> deleteLoad(@PathVariable long loadId) {
        loadService.deleteLoad(loadId);
        return new ResponseEntity<>("Load deleted successfully", HttpStatus.OK);
    }
}
