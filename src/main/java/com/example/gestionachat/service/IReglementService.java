package com.example.gestionachat.service;

import com.example.gestionachat.Entity.Reglement;

import java.util.List;
import java.util.Set;

public interface IReglementService {
    Set<Reglement> retrieveReglementByFacture(Long idFacture);
}
