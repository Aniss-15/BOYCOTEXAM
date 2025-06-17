package tn.esprit.testboycott.Controller;

import lombok.AllArgsConstructor;
import org.aspectj.weaver.bcel.UnwovenClassFileWithThirdPartyManagedBytecode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testboycott.Entity.Produit;
import tn.esprit.testboycott.InterfacesAndServices.Iproduit;

import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Produit")
public class ProduitController {

    @Autowired
    Iproduit produit;

    @PostMapping("/add-produit-cteg")
    public Produit addProduitCteg(@RequestBody Produit prod) {
        return produit.addproduitandcategorie(prod);
    }
    @GetMapping("/checkBoycott/{nomp}")
    public boolean checkproduct(@PathVariable("nomp") String nomProduit ) {
        return produit.chercherProduit(nomProduit);
    }

    
}
