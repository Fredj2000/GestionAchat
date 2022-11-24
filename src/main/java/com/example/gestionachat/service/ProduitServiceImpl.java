package com.example.gestionachat.service;

import com.example.gestionachat.Entity.Produit;
import com.example.gestionachat.Entity.Stock;
import com.example.gestionachat.repository.ProduitRepository;
import com.example.gestionachat.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ICrudService<Produit>,IProduitSercive {
    ProduitRepository produitRepository;
    StockRepository stockRepository;
    @Override
    public Produit add(Produit object) {
        return produitRepository.save(object);
    }

    @Override
    public Produit update(Produit object) {
        return produitRepository.save(object);
    }

    @Override
    public void delete(long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getOne(long id) {
        return produitRepository.findById(id).orElse(null);
    }


    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setStock(stock);
        produitRepository.save(p);

    }
}

