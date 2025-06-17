package tn.esprit.testboycott.InterfacesAndServices;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.testboycott.Entity.Categorie;
import tn.esprit.testboycott.Entity.Produit;
import tn.esprit.testboycott.Entity.TypeUtilisateur;
import tn.esprit.testboycott.Entity.Utilisateur;
import tn.esprit.testboycott.Repository.CategorieRepo;
import tn.esprit.testboycott.Repository.ProdRepo;
import tn.esprit.testboycott.Repository.UserRepo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ServiceUser implements Iuser{
    @Autowired
    UserRepo userRepo;
    ProdRepo prodRepo;
    CategorieRepo categorieRepo;

    @Override
    public Utilisateur addUser(Utilisateur u) {
        return userRepo.save(u);
    }

    @Override
    public void AffecterUnProduitAuser(List<String> nomproduit, String email) {
            Utilisateur utilisateur=userRepo.findUtilisateurByEmail(email);
            if (utilisateur != null) {
                for (String nom : nomproduit) {
                    Produit p = prodRepo.findByNomProduit(nom);
                    if (p != null) {
                        utilisateur.getProduits().add(p);

                    }

                }
                userRepo.save(utilisateur);
            }
        }

    @Override
    public List<Utilisateur> recupererUtilisateursParCriteres(String nomC, Date d, TypeUtilisateur Tu) {

        return null;
    }
}


