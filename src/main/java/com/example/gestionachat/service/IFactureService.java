package com.example.gestionachat.service;
import com.example.gestionachat.Entity.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> getFacturesByFournisseur(Long idFournisseur);
    Facture addFacture(Facture f, Long idFournisseur);
}
