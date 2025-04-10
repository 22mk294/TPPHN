package org.example;

import org.example.data.*;
import org.example.exception.AgeInvalidException;
import org.example.persistance.AnimalJsonRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws AgeInvalidException {
        AnimalJsonRepository repository = new AnimalJsonRepository("animaux.json");

        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Personne("Alice", 25, "brun", 70));
        animaux.add(new Chien("Rex", 5, "noir", "berger"));
        animaux.add(new Perroquet("Polly", 2, "rouge", 30, "bonjour"));
        animaux.add(new ChauveSouris("Batty", 3, "45cm"));
        animaux.add(new Pigeon("Plume", 1, "gris", 12.0));

        // Sauvegarde
        repository.save(animaux);
        System.out.println("Animaux enregistrés dans le fichier JSON.");

        // Chargement
        List<Animal> animauxCharges = repository.load();
        System.out.println("\nAnimaux chargés depuis le fichier JSON :");
        for (Animal a : animauxCharges) {
            a.affiche(); // ou System.out.println(a.getNom());
            System.out.println("---");
        }
    }
}
