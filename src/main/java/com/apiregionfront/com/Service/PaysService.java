package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Langue;
import com.apiregionfront.com.models.Pays;

import java.util.List;


public interface PaysService {

    Pays creer(Pays pays);
    String supprimer(Long id);

    List<Pays> lister();

    Pays TrouverPaysParId(Long idpays);
    Pays TrouverPaysParNom(String nomPays);
}