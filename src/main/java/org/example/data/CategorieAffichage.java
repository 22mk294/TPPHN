package org.example.data;

import java.util.ArrayList;
import java.util.List;

// Classe générique pour afficher les animaux selon leur catégorie
public class CategorieAffichage<T extends Animal> {
    private List<T> animaux;

    public CategorieAffichage() {
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimal(T animal) {
        animaux.add(animal);
    }

    public void afficherParCategorie(Class<?> categorie) {
        System.out.println("Animaux de la catégorie " + categorie.getSimpleName() + " :");
        for (T animal : animaux) {
            if (categorie.isInstance(animal)) {
                System.out.println(animal.getNom());
            }
        }
    }
}
