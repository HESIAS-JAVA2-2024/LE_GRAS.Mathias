package com.mondomaine.controller;

import com.mondomaine.model.Garage;
import com.mondomaine.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/garages")
public class GarageController {
    @Autowired
    private GarageService garageService;

    @PostMapping("/")
    public Garage ajouterGarage(@RequestBody Garage garage) {
        return garageService.ajouterGarage(garage);
    }

    @GetMapping("/")
    public List<Garage> listerGarages() {
        return garageService.listerGarages();
    }

    @GetMapping("/{id}")
    public Garage listerUnGarage(@PathVariable Long id) {
        return garageService.listerUnGarage(id);
    }

    // méthodes pour associer et dissocier une voiture
}