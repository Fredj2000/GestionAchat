package com.example.gestionachat.repository;

import com.example.gestionachat.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {
    List<Facture> findByFournisseurIdFourni(Long idFournisseur);

}
