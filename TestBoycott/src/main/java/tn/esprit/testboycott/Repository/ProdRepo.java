package tn.esprit.testboycott.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.testboycott.Entity.Produit;

import java.util.List;

public interface ProdRepo extends JpaRepository<Produit , Long> {
    public Produit findByNomProduit(String n);


}
