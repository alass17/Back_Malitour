package com.apiregionfront.com.payload.request.repository;


import com.apiregionfront.com.models.Activite;
import com.apiregionfront.com.models.Langue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite,Long> {
    Activite findByIdActivite(Long idactivite);
    Activite findByDomaine(String domaine);

}
