package viewmodel;

import javafx.beans.property.*;

public abstract class AbstractProductVM {

    private final StringProperty nom = new SimpleStringProperty();
        public StringProperty nomProperty() { return nom; }
        public String getNom() { return nom.get(); }
        public void setNom(String nom) { this.nom.set(nom); }

    private final DoubleProperty prix = new SimpleDoubleProperty();
        public DoubleProperty prixProperty() { return prix; }
        public double getPrix() { return prix.get(); }
        public void setPrix(double prix) { this.prix.set(prix); }

    public AbstractProductVM(String nom, Double prix) {
        this.nom.set(nom);
        this.prix.set(prix);
    }
}
