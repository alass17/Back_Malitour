package com.apiregionfront.com.Service;

import com.apiregionfront.com.models.Activite;
import com.apiregionfront.com.models.Langue;
import com.apiregionfront.com.payload.request.repository.ActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActviteServiceimpl implements ActiviteService{
    private final ActiviteRepository activiteRepository;
    @Override
    public Activite ajouter(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public String supprimer(Long id) {
        return "Activité supprimée";
    }

    @Override
    public Activite TrouverActiviteParId(Long idactivite) {
        return activiteRepository.findByIdActivite(idactivite);
    }

    @Override
    public Activite TrouverActiviteParDomaine(String domaine) {
        return activiteRepository.findByDomaine(domaine);
    }

    @Override
    public List<Activite> lister() {
        return activiteRepository.findAll();
    }
}
