package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager implements Serializable {

    public List<AbstractProduct> produits = new ArrayList<>();

    public List<AbstractProduct> getProduits() {
        return Collections.unmodifiableList(produits);
    }

    public void ajouterProduits(AbstractProduct produit) {
        produits.add(produit);
    }

    public void supprimerProduit(AbstractProduct produit) {
        produits.remove(produit);
    }
}
