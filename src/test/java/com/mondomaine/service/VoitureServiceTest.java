package com.mondomaine.service;

import com.mondomaine.model.Voiture;
import com.mondomaine.repository.VoitureRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class VoitureServiceTest {

    @Test
    public void testCreerVoiture() {
        VoitureRepository voitureRepository = Mockito.mock(VoitureRepository.class);
        VoitureServiceImpl voitureService = new VoitureServiceImpl(voitureRepository);
        Voiture voiture = new Voiture("Ma Voiture",123);


        when(voitureRepository.save(voiture)).thenReturn(voiture);

        Voiture result = voitureService.creerVoiture(voiture);

        assertEquals(voiture, result);
    }
}
