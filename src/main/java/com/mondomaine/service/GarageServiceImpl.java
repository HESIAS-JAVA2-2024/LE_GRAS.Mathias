package com.mondomaine.service;

import com.mondomaine.model.Garage;
import com.mondomaine.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageServiceImpl implements GarageService {

    @Autowired
    private GarageRepository garageRepository;

    public GarageServiceImpl(GarageRepository garageRepository) {
    }

    @Override
    public Garage ajouterGarage(Garage garage) {
        return garageRepository.save(garage);
    }

    @Override
    public List<Garage> listerGarages() {
        return garageRepository.findAll();
    }

    @Override
    public Garage listerUnGarage(Long id) {
        return garageRepository.findById(id).orElse(null);
    }

    // autres méthodes nécessaires
}