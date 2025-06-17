package tn.esprit.testboycott.InterfacesAndServices;

import tn.esprit.testboycott.Entity.Produit;

import java.util.List;

public interface Iproduit {
    public Produit addproduitandcategorie(Produit produit );
    public Boolean chercherProduit(String nomProduit) ;

    }
