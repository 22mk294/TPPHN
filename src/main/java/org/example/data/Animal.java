package org.example.data;



import org.example.exception.AgeInvalidException;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nom;
    private int age;

    public Animal(String nom, int age) throws AgeInvalidException {
        this.nom = nom;
        setAge(age); // Valide l'âge via exception
    }

    public abstract void faireDuBruit();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return nom + " " + age;
    }

    public void setAge(int age) throws AgeInvalidException {
        if (age < 0) {
            throw new AgeInvalidException(age);
        } else {
            this.age = age;
        }
    }

    public void affiche() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }

    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    public void dormir() {
        System.out.println(nom + " est en train de dormir.");
    }
}
