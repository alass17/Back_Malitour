package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Langue;
import com.apiregionfront.com.models.Pays;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LangueService {
    Langue ajouter(Langue langue);
    String supprimer(Long id);
    Langue TrouverLangueParId(Long idlangue);
    Langue TrouverLangueParLibelle(String libelle);

    List<Langue> lister();

}
