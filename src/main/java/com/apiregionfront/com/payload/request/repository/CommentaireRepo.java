package com.apiregionfront.com.payload.request.repository;

import com.apiregionfront.com.models.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepo extends JpaRepository <Commentaire,Long>{
}
