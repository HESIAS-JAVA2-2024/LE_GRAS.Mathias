package com.mondomaine.controller;


import com.mondomaine.model.Voiture;

import com.mondomaine.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/voitures")
public class VoitureController {
    @Autowired
    private VoitureService voitureService;

    @PostMapping("/")
    public Voiture creerVoiture(@RequestBody Voiture voiture) {
        return voitureService.creerVoiture(voiture);
    }
}