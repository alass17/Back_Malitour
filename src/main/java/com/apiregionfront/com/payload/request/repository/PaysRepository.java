package com.apiregionfront.com.payload.request.repository;


import com.apiregionfront.com.models.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays,Long> {
    Pays findByIdPays(Long idpays);
    Pays findByNomPays(String nomPays);
}
