package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Population;
import org.springframework.stereotype.Service;


@Service
public interface PopulationService {
    Population ajouter(Population population);
    Population modifier(Long id,Population population);
    String supprimer(Long id);
}
