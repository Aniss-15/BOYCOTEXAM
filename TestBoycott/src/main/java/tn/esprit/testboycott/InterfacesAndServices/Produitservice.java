package tn.esprit.testboycott.InterfacesAndServices;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testboycott.Entity.Categorie;
import tn.esprit.testboycott.Entity.Etat;
import tn.esprit.testboycott.Entity.Produit;
import tn.esprit.testboycott.Entity.Utilisateur;
import tn.esprit.testboycott.Repository.CategorieRepo;
import tn.esprit.testboycott.Repository.ProdRepo;
import tn.esprit.testboycott.Repository.UserRepo;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class Produitservice implements Iproduit {
    @Autowired
    ProdRepo prodRepo;
    CategorieRepo categorieRepo;
    UserRepo userRepo;


    @Override
    public Produit addproduitandcategorie(Produit produit) {
        return prodRepo.save(produit);
    }

    @Override
    public Boolean chercherProduit(String nomProduit) {
        return prodRepo.findByNomProduit(nomProduit).getEtatProduit()==Etat.Boycott;
    }


    //@Override
   // public void AffecterUnProduitAuser(List<String> nomproduit, String email) {
     //   Utilisateur user = userRepo.findUtilisateurByEmail(email);
       // if (user == null) {
         //   throw new RuntimeException("user not found");
        //}

        //for (String nom : nomproduit) {
          //  List<Produit> produits = prodRepo.findByNomProduit(nom);
            //if (produits.isEmpty()) {
              //  throw new RuntimeException("Aucun produit trouvé pour : " + nom);
            //}
            //user.getProduits().addAll(produits);  // ajoute tous les produits avec ce nom
        //}
        //userRepo.save(user);
    //}

    }



