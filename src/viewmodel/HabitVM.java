package viewmodel;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.AbstractProduct;
import model.Couleur;
import model.Habit;
import model.Taille;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class HabitVM extends AbstractProductVM implements PropertyChangeListener {

    private Habit model;

    private StringProperty nom = new SimpleStringProperty();
    private DoubleProperty prix = new SimpleDoubleProperty();

    private final ObservableList<CouleurVM> couleurdDisponiblesObs = FXCollections.observableArrayList();
    private final ObservableList<TailleVM> taillesDisponiblesObs = FXCollections.observableArrayList();

    private final ListProperty<CouleurVM> couleursDisponibles = new SimpleListProperty<>(couleurdDisponiblesObs);

    public ListProperty<CouleurVM> couleursDisponiblesProperty() { return couleursDisponibles; }
        public ObservableList<CouleurVM> getCouleursDisponibles() { return couleursDisponibles.get(); }
        public void setCouleursDisponibles(ObservableList<CouleurVM> couleursDisponibles) { this.couleursDisponibles.set(couleursDisponibles); }

    private final ListProperty<TailleVM> tailleDisponibles = new SimpleListProperty<>(taillesDisponiblesObs);
        public ListProperty<TailleVM> tailleDisponiblesProperty() { return tailleDisponibles; }
        public ObservableList<TailleVM> getTailleDisponibles() { return tailleDisponibles.get(); }
        public void setTailleDisponibles(ObservableList<TailleVM> tailleDisponibles) { this.tailleDisponibles.set(tailleDisponibles); }

    public HabitVM(Habit model) {
        super(model.getNom(), model.getPrix());
        this.model = model;

        nom.set(model.getNom());
        model.setNom(nom.get());
        prix.set(model.getPrix());
        model.setPrix(prix.get());

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(Habit.HABIT_PROP_COULEUR)) {

        }
    }
}
