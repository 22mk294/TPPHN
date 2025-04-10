package org.example.persistance;



import org.example.data.Animal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalFileRepository implements AnimalRepository {

    private String fileName;

    public AnimalFileRepository(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save(List<Animal> animaux) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(animaux);
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors de l'enregistrement des animaux", e);
        }
    }

    @Override
    public List<Animal> load() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
                Object obj = in.readObject();
                if (obj instanceof List<?>) {
                    return (List<Animal>) obj;
                } else {
                    throw new RuntimeException("Le fichier ne contient pas une liste d'animaux valide.");
                }
        } catch (FileNotFoundException e) {
            // Le fichier n'existe pas encore, on retourne une liste vide
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Erreur lors du chargement des animaux", e);
        }
    }
}
