package com.mondomaine.service;

import com.mondomaine.model.Garage;
import com.mondomaine.repository.GarageRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GarageServiceTest {

    @Test
    public void testAjouterGarage() {
        GarageRepository garageRepository = Mockito.mock(GarageRepository.class);
        GarageServiceImpl garageService = new GarageServiceImpl(garageRepository);
        Garage garage = new Garage("Mon Garage","123 Rue principale");


        when(garageRepository.save(garage)).thenReturn(garage);

        Garage result = garageService.ajouterGarage(garage);

        assertEquals(garage, result);
    }
}
