package com.mondomaine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marque;
    private int puissance;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public Voiture(String marque, int puissance) {
        this.marque = marque;
        this.puissance = puissance;
    }
}