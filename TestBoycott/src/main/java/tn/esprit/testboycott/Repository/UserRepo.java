package tn.esprit.testboycott.Repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testboycott.Entity.TypeUtilisateur;
import tn.esprit.testboycott.Entity.Utilisateur;

import java.util.Date;
import java.util.List;

public interface UserRepo extends JpaRepository<Utilisateur, Long> {
    Utilisateur findUtilisateurByEmail(String email);
   // public List<Utilisateur> findAllByTypeUtilisateurAndDateinscriAfter(TypeUtilisateur Tu, Date d);

}
