package com.apiregionfront.com.Service;

import com.apiregionfront.com.models.Population;
import com.apiregionfront.com.payload.request.repository.PopulationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PopulationServiceimpl implements PopulationService {
    private final PopulationRepository populationRepository;
    @Override
    public Population ajouter(Population population) {
        return populationRepository.save(population);
    }

    @Override
    public Population modifier(Long id, Population population) {
        return populationRepository.findById(id)
                .map(p->{
                    p.setNbre_population(population.getNbre_population());
                    p.setAnnee(population.getAnnee());
                    return populationRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Population non trouvée !"));
    }

    @Override
    public String supprimer(Long id) {
        return "Population Supprimée";
    }
}
