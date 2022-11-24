package com.example.gestionachat.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFacture ;
    private float montantRemise ;
    private float montantFacture ;
    private boolean archivee ;
    @Temporal(TemporalType.DATE)
    private Date DateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date DateDerniereModification;



}
