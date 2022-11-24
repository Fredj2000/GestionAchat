package com.example.gestionachat.service;

import com.example.gestionachat.Entity.Fournisseur;
import com.example.gestionachat.Entity.Produit;
import com.example.gestionachat.Entity.SecteurActivite;
import com.example.gestionachat.Entity.Stock;
import com.example.gestionachat.repository.FournisseurRepository;
import com.example.gestionachat.repository.SecteurActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FournisseurServiceImpl implements ICrudService<Fournisseur>,IFournisseurService{
    FournisseurRepository fournisseurRepository;
    SecteurActiviteRepository secteurActiviteRepository;
    @Override
    public Fournisseur add(Fournisseur object) {
        return fournisseurRepository.save(object);
    }

    @Override
    public Fournisseur update(Fournisseur object) {
        return fournisseurRepository.save(object);
    }

    @Override
    public void delete(long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public List<Fournisseur> getAll() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur getOne(long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur f=fournisseurRepository.findById(fournisseurId).orElse(null);
        SecteurActivite sec = secteurActiviteRepository.findById(secteurActiviteId).orElse(null);
        sec.getFournisseurs().add(f);
        secteurActiviteRepository.save(sec);


    }
}
