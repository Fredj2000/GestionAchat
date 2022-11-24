package com.example.gestionachat.service;

import com.example.gestionachat.Entity.DetailFacture;
import com.example.gestionachat.repository.DetailFactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailFactureServiceImpl implements ICrudService<DetailFacture> {
    DetailFactureRepository detailFactureRepository;
    @Override
    public DetailFacture add(DetailFacture object) {
        return detailFactureRepository.save(object);
    }

    @Override
    public DetailFacture update(DetailFacture object) {
        return detailFactureRepository.save(object);
    }

    @Override
    public void delete(long id) {
        detailFactureRepository.deleteById(id);

    }

    @Override
    public List<DetailFacture> getAll() {
        return detailFactureRepository.findAll();
    }

    @Override
    public DetailFacture getOne(long id) {
        return detailFactureRepository.findById(id).orElse(null);
    }
}
