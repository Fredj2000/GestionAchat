package com.example.gestionachat.service;


import com.example.gestionachat.Entity.Facture;
import com.example.gestionachat.Entity.Reglement;
import com.example.gestionachat.repository.FactureRepository;
import com.example.gestionachat.repository.ReglementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ReglementServiceImpl implements ICrudService<Reglement>,IReglementService {
    ReglementRepository reglementRepository;
    FactureRepository factureRepository;
    @Override
    public Reglement add(Reglement object) {
        return reglementRepository.save(object);
    }

    @Override
    public Reglement update(Reglement object) {
        return reglementRepository.save(object);
    }

    @Override
    public void delete(long id) {
        reglementRepository.deleteById(id);
    }

    @Override
    public List<Reglement> getAll() {
        return reglementRepository.findAll();
    }

    @Override
    public Reglement getOne(long id) {
        return reglementRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Reglement> retrieveReglementByFacture(Long idFacture) {
        Facture facture = factureRepository.findById(idFacture).orElse(null);
        return facture.getReglement;
    }
}
