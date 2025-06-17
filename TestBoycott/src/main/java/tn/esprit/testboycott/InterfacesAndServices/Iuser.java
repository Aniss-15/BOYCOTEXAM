package tn.esprit.testboycott.InterfacesAndServices;

import tn.esprit.testboycott.Entity.Produit;
import tn.esprit.testboycott.Entity.TypeUtilisateur;
import tn.esprit.testboycott.Entity.Utilisateur;

import java.util.Date;
import java.util.List;

public interface Iuser {
    public Utilisateur addUser(Utilisateur u);
    public void AffecterUnProduitAuser(List<String> nomproduit , String email);
    public List<Utilisateur> recupererUtilisateursParCriteres(String nomC, Date d, TypeUtilisateur tu);
}
