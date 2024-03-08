package com.mondomaine.service;

import com.mondomaine.model.Garage;

import java.util.List;

public interface GarageService {
    Garage ajouterGarage(Garage garage);
    List<Garage> listerGarages();
    Garage listerUnGarage(Long id);

}