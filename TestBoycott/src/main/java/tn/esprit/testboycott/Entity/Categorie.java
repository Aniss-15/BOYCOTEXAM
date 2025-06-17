package tn.esprit.testboycott.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCtaeg;
    private String nomCtaeg;
    @ManyToMany(mappedBy = "categories")
    @JsonIgnore
    @ToString.Exclude
    private List<Produit> produits;
}
