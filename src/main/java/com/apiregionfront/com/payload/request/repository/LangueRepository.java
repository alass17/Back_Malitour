package com.apiregionfront.com.payload.request.repository;


import com.apiregionfront.com.models.Langue;
import com.apiregionfront.com.models.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LangueRepository extends JpaRepository<Langue, Long> {
    Langue findByIdLangue(Long idlangue);
    Langue findByLibelle(String libelle);
}
