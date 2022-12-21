package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Pays;
import com.apiregionfront.com.payload.request.repository.PaysRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaysServiceimpl implements PaysService{
    private final PaysRepository paysRepository;
    @Override
    public Pays creer(Pays pays) {
        return paysRepository.save(pays);
    }

    @Override
    public String supprimer(Long id) {
        paysRepository.deleteById(id);
        return "Pays Supprimé !";
    }

    @Override
    public List<Pays> lister() {
        return paysRepository.findAll();
    }

    @Override
    public Pays TrouverPaysParId(Long idpays) {
        return paysRepository.findByIdPays(idpays);
    }

    @Override
    public Pays TrouverPaysParNom(String nomPays) {
        return paysRepository.findByNomPays(nomPays);
    }
}
