package com.mondomaine.service;

import com.mondomaine.model.Voiture;
import com.mondomaine.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImpl implements VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public VoitureServiceImpl(VoitureRepository voitureRepository) {
    }

    @Override
    public Voiture creerVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }
}