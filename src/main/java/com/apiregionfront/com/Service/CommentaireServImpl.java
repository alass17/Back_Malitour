package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Commentaire;
import com.apiregionfront.com.payload.request.repository.CommentaireRepo;

import java.util.List;

public class CommentaireServImpl implements CommentaireServ{
    CommentaireRepo commentaireRepo;
    @Override
    public Commentaire ajouter(Commentaire commentaire) {
        return commentaireRepo.save(commentaire);
    }

    @Override
    public String supprimer(Long idcom) {
       commentaireRepo.deleteById(idcom);
        return "Commentaire supprimé avec succès";
    }

    @Override
    public List<Commentaire> listercommentaire() {
        return commentaireRepo.findAll();
    }

    @Override
    public Commentaire modifier(Long idcom, Commentaire commentaire) {
         return commentaireRepo.findById(idcom)
                .map(r->{
                    r.setLibelle(commentaire.getLibelle());
                    r.setDate(commentaire.getDate());

                    return commentaireRepo.save(r);
                }).orElseThrow(() -> new RuntimeException("Commentaire non trouvée !"));
    }
}
