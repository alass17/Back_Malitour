package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Commentaire;

import java.util.List;

public interface CommentaireServ {
    Commentaire ajouter(Commentaire commentaire);
    String supprimer(Long idcom);
    List<Commentaire> listercommentaire();
    Commentaire modifier(Long idcom, Commentaire commentaire);
}
