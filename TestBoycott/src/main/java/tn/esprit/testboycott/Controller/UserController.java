package tn.esprit.testboycott.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testboycott.Entity.TypeUtilisateur;
import tn.esprit.testboycott.Entity.Utilisateur;
import tn.esprit.testboycott.InterfacesAndServices.Iproduit;
import tn.esprit.testboycott.InterfacesAndServices.Iuser;
import tn.esprit.testboycott.InterfacesAndServices.Produitservice;
import tn.esprit.testboycott.InterfacesAndServices.ServiceUser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/User")
public class UserController {
    @Autowired
    ServiceUser serviceUser;
    Iuser iuser ;
    @PostMapping("/add-user")
    public Utilisateur addUser(@RequestBody Utilisateur u) {
        return serviceUser.addUser(u);
    }

    @PutMapping("/affecter-un/{nom}/{email}")
    public void affecterProduitsAUtilisateur(
            @PathVariable String nom,
            @PathVariable String email) {

        List<String> nomProduits = Arrays.asList(nom.split(","));
        iuser.AffecterUnProduitAuser(nomProduits, email);
    }

   // @GetMapping("/getusers/{nomCategorie}/{date}/{TypeUtilisateur}")
    //public List<Utilisateur> getusersbycriteras(@PathVariable("nomCategorie") String nc, @PathVariable("date") Date d, @PathVariable("TypeUtilisateur") TypeUtilisateur tu) throws ParseException {
      //  return serviceUser.recupererUtilisateursParCriteres(nc,d,tu);
    //}
}
