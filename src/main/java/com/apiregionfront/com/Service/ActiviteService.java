package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Activite;
import com.apiregionfront.com.models.Langue;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActiviteService {
    Activite ajouter(Activite activite);
    String supprimer(Long id);
    Activite TrouverActiviteParId(Long idactivite);
    Activite TrouverActiviteParDomaine(String domaine);
    List<Activite> lister();
}
