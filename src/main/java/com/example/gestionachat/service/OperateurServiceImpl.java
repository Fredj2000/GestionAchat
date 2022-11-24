package com.example.gestionachat.service;


import com.example.gestionachat.Entity.Facture;
import com.example.gestionachat.Entity.Operateur;
import com.example.gestionachat.repository.FactureRepository;
import com.example.gestionachat.repository.OperateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OperateurServiceImpl implements ICrudService<Operateur>,IOperateurService{
    OperateurRepository operateurRepository;
    FactureRepository factureRepository;
    @Override
    public Operateur add(Operateur object) {
        return operateurRepository.save(object);
    }

    @Override
    public Operateur update(Operateur object) {
        return operateurRepository.save(object);
    }

    @Override
    public void delete(long id) {
        operateurRepository.deleteById(id);
    }

    @Override
    public List<Operateur> getAll() {
        return operateurRepository.findAll();
    }

    @Override
    public Operateur getOne(long id) {
        return operateurRepository.findById(id).orElse(null);
    }

    @Override
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur op = operateurRepository.findById(idOperateur).orElse(null);
        Facture fact = factureRepository.findById(idFacture).orElse(null);
        op.getFactures().add(fact);
        operateurRepository.save(op);

    }
}
