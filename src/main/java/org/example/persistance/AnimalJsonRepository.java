package org.example.persistance;

import com.google.gson.*;
//import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import org.example.data.*;
import org.example.util.RuntimeTypeAdapterFactory;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import org.example.util.RuntimeTypeAdapterFactory;

public class AnimalJsonRepository implements AnimalRepository {

    private final String fileName;
    private final Gson gson;

    public AnimalJsonRepository(String fileName) {
        this.fileName = fileName;

        // Adapter polymorphique
        RuntimeTypeAdapterFactory<Animal> typeFactory = RuntimeTypeAdapterFactory
                .of(Animal.class, "type")
                .registerSubtype(Mammifere.class, "mammifere")
                .registerSubtype(Oiseau.class, "oiseau")
                .registerSubtype(Poisson.class, "poisson")
                .registerSubtype(Personne.class, "personne")
                .registerSubtype(Chien.class, "chien")
                .registerSubtype(Pigeon.class, "pigeon")
                .registerSubtype(Perroquet.class, "perroquet")
                .registerSubtype(ChauveSouris.class, "chauve_souris");

        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapterFactory(typeFactory)
                .create();
    }

    @Override
    public void save(List<Animal> animaux) {
        try (Writer writer = new FileWriter(fileName)) {
            gson.toJson(animaux, writer);
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors de la sauvegarde JSON", e);
        }
    }

    @Override
    public List<Animal> load() {
        try (Reader reader = new FileReader(fileName)) {
            Animal[] animaux = gson.fromJson(reader, Animal[].class);
            return new ArrayList<>(Arrays.asList(animaux));
        } catch (FileNotFoundException e) {
            System.out.println("Fichier JSON non trouvé. Retour d'une liste vide.");
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors du chargement JSON", e);
        }
    }
}
