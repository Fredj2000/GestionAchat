package com.example.gestionachat.controller;

import com.example.gestionachat.Entity.DetailFacture;
import com.example.gestionachat.service.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DetailFactureController {
    private final ICrudService<DetailFacture> crudService;

    @PostMapping("/addDetailFacture")
    public DetailFacture add(@RequestBody DetailFacture object) {
        return crudService.add(object);
    }

    @PutMapping("/updateDetailFacture")
    public DetailFacture update(@RequestBody DetailFacture object) {
        return crudService.update(object);
    }

    @DeleteMapping("/deleteDetailFacture/{idDetFact}")
    public void delete(@PathVariable long id) {
        crudService.delete(id);

    }

    @GetMapping("/getAllDetailFacture")
    public List<DetailFacture> getAll() {
        return crudService.getAll();
    }

    @GetMapping("/getOneDetailFacture/{id}")
    public DetailFacture getOne(@PathVariable long id) {
        return crudService.getOne(id);
    }

}
