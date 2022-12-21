package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Langue;
import com.apiregionfront.com.payload.request.repository.LangueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LangueServiceimpl implements LangueService{
    private final LangueRepository langueRepository;
    @Override
    public Langue ajouter(Langue langue) {
        return langueRepository.save(langue);
    }

    @Override
    public String supprimer(Long id) {
        return "Langue supprimée";
    }

    @Override
    public Langue TrouverLangueParId(Long idlangue) {
        return langueRepository.findByIdLangue(idlangue);
    }

    @Override
    public Langue TrouverLangueParLibelle(String libelle) {
        return langueRepository.findByLibelle(libelle);
    }

    @Override
    public List<Langue> lister() {
        return langueRepository.findAll();
    }
}
