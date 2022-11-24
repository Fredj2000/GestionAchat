package com.example.gestionachat.service;


import com.example.gestionachat.Entity.SecteurActivite;
import com.example.gestionachat.repository.SecteurActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SecteurActiviteServiceImpl implements ICrudService<SecteurActivite> {
    SecteurActiviteRepository secteurActiviteRepository;
    @Override
    public SecteurActivite add(SecteurActivite object) {
        return secteurActiviteRepository.save(object);
    }

    @Override
    public SecteurActivite update(SecteurActivite object) {
        return secteurActiviteRepository.save(object);
    }

    @Override
    public void delete(long id) {
        secteurActiviteRepository.deleteById(id);
    }

    @Override
    public List<SecteurActivite> getAll() {
        return secteurActiviteRepository.findAll();
    }

    @Override
    public SecteurActivite getOne(long id) {
        return secteurActiviteRepository.findById(id).orElse(null);
    }
}
