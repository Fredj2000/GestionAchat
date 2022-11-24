package com.example.gestionachat.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter

@Table(name = "Reglement")
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReglement ;
    private float montantPaye ;
    private float montantRestant ;
    private boolean payee ;
    @Temporal(TemporalType.DATE)
    private Date DateReglement;
    @ManyToOne
    private Facture facture ;
}
