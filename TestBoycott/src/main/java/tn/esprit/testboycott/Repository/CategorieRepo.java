package tn.esprit.testboycott.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testboycott.Entity.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie,Integer> {
    Categorie findCategorieByNomCtaeg(String nomCtaeg);
}
